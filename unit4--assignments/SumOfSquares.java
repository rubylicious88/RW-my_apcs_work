public class SumOfSquares {

    public static int sumOfSquares(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i * i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(1)); 
        System.out.println(sumOfSquares(2)); 
        System.out.println(sumOfSquares(3)); 
    }
}
