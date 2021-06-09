
public class BackspaceAttack {

	public static void main(String[] args) {
		
		
		System.out.println(erase("he##l#hel#llo")); // erase("he##l#hel#llo") ➞ "hello"
		System.out.println(erase("major# spar##ks")); // erase("major# spar##ks") ➞ "majo spks"
		System.out.println(erase("si###t boy")); // erase("si###t boy") ➞ "t boy"
		System.out.println(erase("####")); // erase("####") ➞ ""

	}
	
	public static String erase(String s) {
		
		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < s.length(); i = i + 1) {
			
			if (s.charAt(i) == '#') {
				if (sb.length() != 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			}
			else {
				sb.append(s.charAt(i));
			}
			
		}
		
		return sb.toString();
		
	}

}
