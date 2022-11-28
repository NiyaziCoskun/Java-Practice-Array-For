package java_practice_array_for;

import java.sql.SQLOutput;

public class practice6 {
    public static void main(String[] args) {
        int[] numbers = {100, 90,  80, 70, 60};
        System.out.println("Sirali mi :" + getSiraliMi(numbers));
    }

    public static boolean getSiraliMi(int[] numbers) {
        boolean siraliMi = true;

        for (int i = 0; i<numbers.length - 1 ; i++){
            if (numbers[i] < numbers[i+1]) {
                siraliMi = false;
                break;
            }
        }

        return siraliMi;
    }

}
