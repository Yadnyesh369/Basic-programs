package Simple;

public class SplitString {

	public static void main(String[] args) {
			String s1="java string powered by split method by Yadnyesh";			
			String[] words=s1.split("\\s");
			for(String w:words){
	
			System.out.println(w);
			
		}
	}
}
