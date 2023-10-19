import java.util.Scanner;
public class Gaji11{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jumlahMasuk, JumlahTidakMasuk, TotalGaji;
        int gaji=40000, potonganGaji=25000;

        System.out.println("Masukkan jumlah hari masuk kerja anda: ");
        jumlahMasuk=input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda: ");
        JumlahTidakMasuk=input.nextInt();
        
        TotalGaji=(jumlahMasuk*gaji)-(JumlahTidakMasuk*potonganGaji);

        System.out.println("Gaji yang anda terima adalah " +TotalGaji);
    }
}