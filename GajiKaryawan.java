import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input jumlah jam kerja
        System.out.println("Masukkan jumlah jam kerja: ");
        int jamkerja = scanner.nextInt();

        // Meminta input tarif per jam
        System.out.println("Masukkan tarif per: ");
        int tarifPerjam  = scanner.nextInt();

        // Menghitung gaji bruto 
        int gajiBruto = jamkerja * tarifPerjam;

        // Menghitung potongan pajak
        double potonganPajak = gajiBruto * 0.10;

        // Menghitung gaji bersih
        double gajiBersih = gajiBruto - potonganPajak;

        // Menampilkan hasil
        System.out.println("Gaji bruto: "+ gajiBruto);
        System.out.println("Potongan pajak:"+ potonganPajak);
        System.out.println("Gaji bersih:"+ gajiBersih);

    }
    
             }