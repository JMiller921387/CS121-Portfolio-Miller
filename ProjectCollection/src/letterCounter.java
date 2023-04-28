import java.util.Scanner;

public class LetterCounter {
    static int counter;
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.println("What word would you like to search in?");

        String testWord = console.nextLine();

        System.out.println("What letter would you like to search for?");

        //Get the answer in a string
        String testString = console.nextLine();

        //Get the first letter to that string. This converts the string to a letter.
        //nd if they messed up by accidently adding a space, the program won't fie
        char testLetter = testString.charAt(0);
        count(testWord, testLetter,0);

        console.close();
    }

    public static void count(String test, char matcher, int index) {
        int num = test.length() - index - 1;
        //System.out.println(num);
        //System.out.println(test.charAt(num) );

        if(num == -1){
            System.out.println("There are " + counter + " times the letter " + matcher + " occurs in the word " + test);
        }

        else{
            char letter = test.charAt(num);
            if(letter == matcher){
                counter++;
            }
            count(test, matcher, index + 1);

        }

    }

}
