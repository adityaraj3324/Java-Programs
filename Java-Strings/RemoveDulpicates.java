import java.util.Scanner;

class RemoveDulpicates {
	static boolean[] map = new boolean[26];
	public static String removeDuplicateLetters(String s,int idx,String newString) {
		if(idx == s.length()) return newString;
		char currChar = s.charAt(idx); 
		if(map[currChar - 'a']){
			return removeDuplicateLetters(s,idx+1,newString); 
			} 
		else{
			newString += currChar;
			map[currChar - 'a'] = true;
			return removeDuplicateLetters(s,idx+1,newString);
			} 
		} 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		String s = sc.next();
		System.out.println(removeDuplicateLetters(s,0,""));
		sc.close();
		}
	}