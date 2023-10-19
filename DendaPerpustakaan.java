import java.util.Scanner;
public class DendaPerpustakaan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denda, keterlambatan;
        float total_denda;

        System.out.println("Total Denda Perhari :3000 ");
        denda = 3000;
        System.out.print("Masukkan total keterlambatan: ");
        keterlambatan = sc.nextInt();
        total_denda = denda * keterlambatan;
        System.out.println("Total Denda " + total_denda);
        System.out.println("Silahkan Transfer ke nomer dibawah ini. ");
        System.out.println("72373284039. ");
    }
}    