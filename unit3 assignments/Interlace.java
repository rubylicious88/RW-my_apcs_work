public class Interlace{
	public static String interlace(String s, String n){
		String result = "";
		int lengthS=s.length();
		int lengthN=n.length();
		int i = 0;
		
		while (i < lengthS && i < lengthN){
			result += s.substring(i, i+1);
			result += n.substring(i, i+1);
			i++;
			}
			while (i < lengthS){
				result += s.substring(i,i+1);
				i++;
				}
			while (i < lengthN){
				result += n.substring(i,i+1);
				i++;	
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println("interlace(\"abc\", \"123\") ->" + interlace("abc","123"));
		System.out.println("interlace(\"bed\", \"ras\") ->" + interlace("bed","ras"));

		}
	}
