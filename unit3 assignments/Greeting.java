public class Greeting {

    public static String greetings(String name) {
        return "Hello, " + name + ", how are you?";
    }

    public static void main(String[] args) {
        System.out.println(greetings("Dr. Kessner"));
        System.out.println(greetings("Ascii Cat")); 
        System.out.println(greetings("(>^.^<)")); 
        System.out.println(greetings("Sydneys")); 
    }
}
