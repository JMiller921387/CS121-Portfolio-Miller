import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = {3, 6, 2, 9, 0, 13, 34, 23, 28, 32, 27};
        LinearSearchDemo demo = new LinearSearchDemo();

        System.out.println("What number do you want to search for");

        int key = console.nextInt();

        int answer = demo.LinearSearch(key, array);

        System.out.println(answer);
    }
}
