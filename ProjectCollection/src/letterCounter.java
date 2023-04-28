public class letterCounter {
    static int counter;
    public static void main(String[] args){
        char testLetter = 'k';
        count("kayak", testLetter,0);
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
