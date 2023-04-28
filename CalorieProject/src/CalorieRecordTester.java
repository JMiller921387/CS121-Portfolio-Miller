public class CalorieRecordTester {
    public static void main(String[] args) {
        CalorieRecord cr = new CalorieRecord();
        TotalCalories tc1 = new TotalCalories(500, "12/25/2000", "12/31/2020");
        TotalCalories tc2 = new TotalCalories(1500, "12/25/2000", "12/31/2020");
        TotalCalories tc3 = new TotalCalories(2000, "12/25/2000", "12/31/2020");

        cr.addCaloriesDiet(tc1);
        cr.addCaloriesDiet(tc2);
        cr.addCaloriesDiet(tc3);

        System.out.println(cr.getCaloriesDiet());
    }
}
