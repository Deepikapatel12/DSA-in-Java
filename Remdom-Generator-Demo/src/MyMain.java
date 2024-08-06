import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println("random.nextInt() = " + random.nextInt());
//        Generate 1000 random numbers
        int upperBound = 1000;
        for (int i = 0; i < 1000; i++) {
//            System.out.println(random.nextInt(1000));
            System.out.println(random.nextInt(upperBound));
        }
    }
}
