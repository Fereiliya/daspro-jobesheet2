import java.util.Scanner;
public class UTSFebri{
    public static void main(String[] args) {
        Scanner input11=new Scanner(System.in);

        int minuman, makanan;
        String nama, kantongPlastik;
        double harga;

        System.out.println("__________________________________________________________________________"); 
        System.out.println("__________________________________________________________________________"); 
        System.out.println("                                                                          "); 
        System.out.println("Selamat Datang Silahkan Input Jumlah Makanan Dan Minuman Yang Akan Dipesan"); 
        System.out.println("__________________________________________________________________________"); 
        System.out.println("__________________________________________________________________________"); 
        System.out.println("                                                                          ");
        System.out.println("Daftar Menu: ");
        System.out.println("Harga Minuman = 5000");
        System.out.println("                                                                          ");
        System.out.println("Harga Makanan = 12000");
        System.out.println("                                                                          ");
        System.out.println("Setiap Pembelian Minuman Berjumlah 3 Akan Dikenakan Potongan Sebesar 5%");
        System.out.println("Dan Setiap Pembelian Dengan Nominal 1000000 Akan Dikenakan PPN Sebesar 7%");
        System.out.println("__________________________________________________________________________"); 
        System.out.println("__________________________________________________________________________"); 
        System.out.println("                                                                          ");
        System.out.println("Masukkan Jumlah Minuman Yang Akan Dipesan: ");
        minuman=input11.nextInt();
        System.out.println("__________________________________________________________________________"); 
        System.out.println("__________________________________________________________________________");
        System.out.println("                                                                          ");
        System.out.println("Masukkan Jumlah Makanan Yang Akan Dipesan: ");
        makanan=input11.nextInt();
        System.out.println("__________________________________________________________________________"); 
        System.out.println("__________________________________________________________________________");
        System.out.println("                                                                          ");
        System.out.println("Silahkan Masukkan Nama Pelanggan: ");
        nama=input11.next();
        System.out.println("__________________________________________________________________________"); 
        System.out.println("__________________________________________________________________________");

        if (minuman == 3){
           harga = ((minuman * 5000) + (makanan * 12000)) - (minuman * 5000 * 0.05);
        }else{
            harga = ((minuman * 5000) + (makanan * 12000));
        }
        
        System.out.println("Apakah Anda Ingin Menggunakan Kantong Plastik Jika Iya Akan Dikenakan Biaya Tambahan 200 (ya/tidak)? ");
        kantongPlastik=input11.next();
        if (kantongPlastik.equals("ya")) {
            harga = harga + 200;
        }else{
        }

        if (harga >= 1000000){
            harga = harga + (harga * 0.07);
        }else{
        }


        System.out.println("Terima Kasih " + nama + " Telah Memesan " + minuman + " Minuman Dan " + makanan + " Makanan Dengan Total Harga: " + harga);




    


    }
}