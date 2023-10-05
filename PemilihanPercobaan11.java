import java.util.Scanner;

public class PemilihanPercobaan11{
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input00.nextInt();

        String hasil;
        hasil = (angka % 2 ==0) ? (angka + " bilangan genap") : (angka + " bilangan ganjil");
        System.out.println(hasil);
    }
}