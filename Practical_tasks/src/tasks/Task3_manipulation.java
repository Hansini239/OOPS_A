package tasks;

public class Task3_manipulation {
	public static void main(String[] args) {	
		String[] words= {"math","phy","chem"};
		for(int i=0;i<words.length;i++) {
			words[i]=words[i].toUpperCase();           
		}
		for (String word : words) {
			System.out.println(word);
		}
		}
	}

