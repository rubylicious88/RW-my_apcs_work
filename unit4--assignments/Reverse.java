public class Reverse{
	public static String reverse(String s) {
		String result = "";
		for (int i = s.length()-1; i>=0; i--) {
			String letter = s.substring(i, i + 1);
			result += letter;
		}
		return result;
	}
	
	public static void testReverse(String s, String t) {
		String result = reverse(s);
		System.out.println("reverse(\"" + s + "\") -> \"" + result +"\"");		
		}
		public static void main(String[] args) {
			System.out.println("Reverse");
			testReverse("bad", "dab");
			testReverse("Hello, world!", "!dlrow ,olleH");
			testReverse("tacocat", "tacocat");
			}
		}
