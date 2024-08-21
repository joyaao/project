import java.util.Scanner;

public class segtiga_input {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("PROGRAM");
        System.out.println("============ ");

        System.out.print("Imputan Alas\t\t: ");
        float alas = inputan.nextInt();
        System.out.print("Inputan Tinggi\t: ");
        float tinggi = inputan.nextInt();

        float luas = (alas * tinggi)/2;

        System.out.println("Alas Segitiga Adalah : " +alas+" cm");
        System.out.println("Tinggi Segitiga Adalah :" +tinggi+" cm");
        System.out.println("Luas Segitiga Adalah : " +luas+" cm");
    }
}
