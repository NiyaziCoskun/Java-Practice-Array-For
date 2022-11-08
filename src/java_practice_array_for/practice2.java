package java_practice_array_for;

public class practice2 {
    public static void main(String[] args) {
        String metin = "aslinda degisen tek sey var. java güzeldir. farkina varmana sevindim";

        String [] cumleler = metin.split("\\.");

        System.out.println(cumleler.length);
        System.out.println(cumleler[0]);
        System.out.println(cumleler[1]);
        System.out.println(cumleler[2]);
    }
}
