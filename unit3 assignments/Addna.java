public class Addna{
	public static String addNa(int n){
		String result = "ba";
		for(int i = 0; i < n; i++){
			result += "na";
			}
			return result;
		}
		public static void main (String [] args){
			System.out.println("AddNa (0) ->" + addNa(0));
			System.out.println("AddNa (1) ->" + addNa(1));
			System.out.println("AddNa (2) ->" + addNa(2));
			System.out.println("AddNa (3) ->" + addNa(3));


			}
	}
