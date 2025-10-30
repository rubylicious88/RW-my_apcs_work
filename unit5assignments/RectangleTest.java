public class RectangleTest{
    public static void main(String[] args){
        Rectangle r = new Rectangle(15, 23);
        System.out.println("base: " + r.getBase());
        System.out.println("height: " + r.getHeight());
        System.out.println("area: " + r.area());
        System.out.println("perimeter: " + r.perimeter());
        System.out.println("diagonal: " + r.diagonal());

        Rectangle s = new Rectangle(10, 11);
        System.out.println("base: " + s.getBase());
        System.out.println("height: " + s.getHeight());
        System.out.println("area: " + s.area());
        System.out.println("perimeter: " + s.perimeter());
        System.out.println("diagonal: " + s.diagonal());
    }
}
