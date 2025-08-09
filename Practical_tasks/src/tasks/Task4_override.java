package tasks;
class student {
	void over(){
	System.out.println("This is student class");	
}
	}
class staff extends student{
	void over(){
	System.out.println("This is inside staff class");
}
	}
class branch extends student{
	void over(){
	System.out.println("This is inside branch class");
}
}
class admin extends student{
	void over(){
	System.out.println("This is inside admin class");
}}

public class Task4_override {
	

	public static void main(String[] args) {
		student st = new student();
		student st1 = new staff();
		student st2 = new branch();
		student st3 = new admin();
		
		st.over();
		st1.over();
		st2.over();
		st3.over();		

	}

}
