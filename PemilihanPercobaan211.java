import java.util.Scanner;

public class PemilihanPercobaan211{
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.print("Nilai uas   :");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts   :");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis   :");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas   :");
        float tugas = input00.nextFloat();

        float nilaiAkhir = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Grade A  =  Sangat Baik");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Grade B+ =  Lebih dari Baik");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Grade B  =  Baik");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Grade C+ =  Lebih dari Cukup");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Grade C  =  Cukup");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Grade D  =  Kurang");
        } else if (nilaiAkhir > 0 && nilaiAkhir <= 39){
            System.out.println("Grade E  =  Gagal");
        } else {
            System.out.println("Nilai Tidak Valid");

        String message = nilaiAkhir < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Status " + message);
        }
    }
}