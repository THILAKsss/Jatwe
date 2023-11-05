package pk5;

public class WordCount {
public static void main(String[]args) {
	
	String s ="Hi Hello how";
	
	int count=1;
	//System.out.println(s.length());
	
	for(int i=0;i<s.length();i++) {
		
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
			count++;  
		}
	}System.out.println(count);
}
}
