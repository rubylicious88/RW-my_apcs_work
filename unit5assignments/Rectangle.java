public class Rectangle{
    public Rectangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
    }
    public double area(){
        return base * height;
    }
    public double perimeter(){
        return 2 * (base + height);
    }
    public double diagonal(){
        return Math.sqrt((base * base) + (height * height));
    }
    public double getBase() {
        return base;
    }
    public double getHeight(){
        return height;
    }
    private double base;
    private double height;
}
