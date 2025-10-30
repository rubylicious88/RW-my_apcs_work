public class CountOccurrences{
 public static int countOccurences(String S, String w){
 int count = 0;
 int index = 0 ;
 
 while((index = S.indexOf(w, index)) != -1) {
 count++;
 index += w.length();
 }
 return count;
 }
 public static void main(String[] args){
 System.out.println(countOccurences("Mississippi", "iss")) ;
 System.out.println(countOccurences("banananana", "na")) ;
 }
}
