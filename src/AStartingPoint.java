import java.util.Random;

public class AStartingPoint {
    public static void main(String[] args) {
        // Java is OO based ... look how string
        //    declares an opbjec from the String class
        String myName = new String("Fred");
        String  occupation = "Author";

        Random generator = new Random();
        int num1 = generator.nextInt(10) + 1;
        System.out.printf("From 1 to 10: %s", num1);
        // int is considered a primative
        // but does have a wrapper object equvilent
        Integer myNum = 12;
        // Show how you can method 'shop' with IDE
        // This is a change
    }
}
