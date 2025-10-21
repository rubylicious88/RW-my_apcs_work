public class PowersOf2{
	public static int sumPowers(int s){
		int result= 0;
		int power = 1;
		for(int i=0; i < s ; i++){
			result +=power;
			power=power*2;
			}
			return result;
		}
		public static void main(String[] args){
			System.out.println("PowersOf2");
			System.out.println("sumPower(0)->" + sumPowers(0));
			System.out.println("sumPower(1)->" + sumPowers(1));
			System.out.println("sumPower(2)->" + sumPowers(2));
			System.out.println("sumPower(3)->" + sumPowers(3));
			System.out.println("sumPower(4)->" + sumPowers(4));

			}
	}
