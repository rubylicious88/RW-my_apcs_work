public class GoodDeal {

    public static boolean goodDeal(double originalPrice, double salePrice) {
        return salePrice < 0.75 * originalPrice;
    }

    public static void testGoodDeal() {
        System.out.println("Testing goodDeal() function...\n");

        printResult(100, 70);  
        printResult(100, 80);  
        printResult(200, 149);  
        printResult(200, 151); 
        printResult(50, 37.5); 
        printResult(120, 60);   
    }

 
    private static void printResult(double original, double sale) {
        boolean result = goodDeal(original, sale);
        if (result) {
            System.out.println("Original price: $" + original + 
                               ", Sale price: $" + sale + 
                               " → This is a GOOD DEAL!");
        } else {
            System.out.println("Original price: $" + original + 
                               ", Sale price: $" + sale + 
                               " → This is NOT a GOOD DEAL.");
        }
    }

    public static void main(String[] args) {
        testGoodDeal();
    }
}
