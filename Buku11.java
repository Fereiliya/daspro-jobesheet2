import java.util.Scanner;
public class Buku11{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int MerekBuku, TotalHalaman;
        double Diskon=0.1, total, bayar, jumlahdiskon;

        System.out.println("Masukkan harga merek buku yang dibeli: ");
        MerekBuku=input.nextInt();
        System.out.println("Masukkan jumlah halamannya: ");
        TotalHalaman=input.nextInt();
        
        total=TotalHalaman*MerekBuku;
        jumlahdiskon=total*Diskon;
        bayar=total*jumlahdiskon;

        System.out.println("Diskon yang didapatkan adalah " +jumlahdiskon);
        System.out.println("Jumlah yang harus dibayarkan adalah " +bayar);
    }
}