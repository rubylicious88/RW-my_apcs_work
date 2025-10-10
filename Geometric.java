public class Geometric {
    public static void main(String[] args) {
        int term = 3;          
        int ratio = 2;       
        int numTerms = 10;    

        for (int i = 1; i <= numTerms; i++) {
            System.out.println(term);
            term = term * ratio; 
        }
    }
}
