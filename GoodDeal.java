class GoodDeal
{
    public static boolean goodDeal(double originalPrice, 
                                   double salePrice)
    {
        return salePrice < (0.75 * originalPrice);
    }

    public static void testGoodDeal(double originalPrice, 
                                    double salePrice,
                                    boolean expected)
    {
        boolean result = goodDeal(originalPrice, salePrice);
        system.out.println("Original Price" + originalPrice + "Sale Price"
    }

    public static void main(String[] args)
    {
        
        testGoodDeal(100, 50, true);
        testGoodDeal(100, 80, false);
        testGoodDeal(200,100, true);
        testGoodDeal(200,150, false);
        testGoodDeal(50,25, true);
        testGoodDeal(50,37.5, false);
    }
}GoodDeal.javaGoodDeal.java
