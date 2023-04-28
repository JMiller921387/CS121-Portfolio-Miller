public class LinearSearchDemo {


    public int LinearSearch(int key, int array[]) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Comparison: " + (counter++));

            if (array[i] == key) {
                System.out.println("Number found at array#" + i + ", returning counter");

                break;
            }
            if(array.length - 1 == i){
                System.out.println("Item not found.");
                counter = 0;
                break;
            }

        }
        return counter;

    }
}
