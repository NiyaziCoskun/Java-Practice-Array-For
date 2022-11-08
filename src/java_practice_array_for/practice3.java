package java_practice_array_for;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen makaleyi giriniz :");
        String makale = input.nextLine();

        String[] cumleler = makale.split("\\.");
        String[] kelimeler = makale.split(" ");
        String[] karakterler = makale.split("");

        System.out.println("Cümle sayisi :" + cumleler.length);
        System.out.println("Kelime sayisi :" + kelimeler.length);
        System.out.println("Karakterler :" + karakterler.length);

    }
}


/*
Lorem ipsum dolor sitamet, consetetur sadipscing elitr, seddiam nonumy eirmod tempor invidunt utlabore et dolore
magna aliquyam erat, seddiam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.
 */