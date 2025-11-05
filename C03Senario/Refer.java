package C03Senario;


import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface APIDescription { String description(); }

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotEmpty {}

@APIDescription(description="Sample API class")
class UserAPI {
    @APIDescription(description="Get user list endpoint")
    public void getUsers() { System.out.println("getUsers executed"); }
    @APIDescription(description="Create user endpoint")
    public void createUser() { System.out.println("createUser executed"); }
}

class Refer {
    @NotEmpty
    String name;
    String email;
    public Refer(String n,String e){name=n;email=e;}
}

public class Refer {
    public static void main(String[] args) throws Exception {
        Class<UserAPI> apiClass = UserAPI.class;
        if (apiClass.isAnnotationPresent(APIDescription.class)) {
            APIDescription ad = apiClass.getAnnotation(APIDescription.class);
            System.out.println("Class desc: " + ad.description());
        }
        Method[] methods = apiClass.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(APIDescription.class)) {
                APIDescription mdesc = m.getAnnotation(APIDescription.class);
                System.out.println("Method: " + m.getName() + " -> " + mdesc.description());
            }
        }
        UserAPI api = apiClass.getDeclaredConstructor().newInstance();
        for (Method m : methods) {
            if (m.getName().equals("getUsers")) m.invoke(api);
        }
        Reflect c1 = new Reflect("", "a@b.com");
        validateNotEmpty(c1);
    }
    static void validateNotEmpty(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(NotEmpty.class)) {
                f.setAccessible(true);
                try {
                    Object val = f.get(obj);
                    if (val == null || (val instanceof String && ((String)val).trim().isEmpty())) {
                        System.out.println("Warning: Field '" + f.getName() + "' is empty");
                    } else {
                        System.out.println("Field '" + f.getName() + "' OK");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Cannot access field: " + f.getName());
                }
            }
        }
    }
}
