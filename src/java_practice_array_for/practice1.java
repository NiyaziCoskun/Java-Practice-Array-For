package java_practice_array_for;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        String diller = "Türkce, ingilizce, Almanca, Fransizca, Arapca";

        String [] array = diller.split(",");

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        System.out.println(array.length);

    }
}
