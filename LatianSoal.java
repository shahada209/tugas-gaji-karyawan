import java.util.Scanner;

public class LatianSoal {
    public static void main(String[] args) {
        
        double hargabarang, jumlahbarangyangdibeli, presentasediskon, hasil;

        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan harga barang");
        hargabarang=scan.nextDouble();
        System.out.println("masukkan jumlah barang");
        jumlahbarangyangdibeli = scan.nextDouble();
        System.out.println("masukkan diskon");
        presentasediskon = scan.nextDouble();

        hasil= hargabarang*jumlahbarangyangdibeli;
        presentasediskon=presentasediskon/100*hasil;

        hasil = hasil-presentasediskon;

        System.out.println("total: "+hasil);



    }
}
