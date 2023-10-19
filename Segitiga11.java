import java.util.Scanner;
public class Segitiga11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.println("Total Denda Perhari :3000 ");
        alas = 3000;
        System.out.print("Masukkan total keterlambatan: ");
        tinggi = sc.nextInt();
        luas = alas * tinggi;
        System.out.println("Total Denda " + luas);
    }
}