public class Find2nd {
	public static int find2nd(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if (s.substring(i,i+1).equals("a")){
				count++;
				if(count ==2){
					return i;
					}
				}
			}
			return -1;
		}
		public static void main(String[] args){
			System.out.println("Find2nd");
			System.out.println("find2nd(banana) -> "+ find2nd("banana"));
			System.out.println("find2nd(happy birthday) ->" + find2nd("happy birthday"));

			}
	}
