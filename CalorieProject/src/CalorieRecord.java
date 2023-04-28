import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class CalorieRecord {
    static int i = 0;
    static ArrayList<TotalCalories>array;

    public CalorieRecord(){
        array = new ArrayList<TotalCalories>();
    }

    public void addCaloriesDiet(TotalCalories input){
        array.add(input);
    }

    public String getCaloriesDiet(){
        StringBuilder dietList = new StringBuilder();
        for(TotalCalories tCal : array){
            dietList.append(tCal.getCalInfo());
        }
        return dietList.toString();



    }


}

