public class SumOfSquare {

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sumOfSquares(1) = " + sumOfSquares(1)); 
        System.out.println("sumOfSquares(2) = " + sumOfSquares(2));
        System.out.println("sumOfSquares(3) = " + sumOfSquares(3)); 
        System.out.println("sumOfSquares(4) = " + sumOfSquares(4)); 
        System.out.println("sumOfSquares(5) = " + sumOfSquares(5)); 
        System.out.println("sumOfSquares(10) = " + sumOfSquares(10));
    }
}
