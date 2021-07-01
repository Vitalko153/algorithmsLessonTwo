import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        int[] bigArr = new int[100000];

        Random random = new Random();
        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = random.nextInt(50);
            System.out.println(bigArr[i]);
        }
    }
}
