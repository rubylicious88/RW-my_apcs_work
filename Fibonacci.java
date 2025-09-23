public class Fibonacci {
    public static void main(String[] args) {
        int n = 30;  
        int a = 1;    
        int b = 1;   
        int c;        

        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <= n; i++) {
            c = a + b;          
            System.out.println(c);

            a = b;            
            b = c;
        }
    }
}

