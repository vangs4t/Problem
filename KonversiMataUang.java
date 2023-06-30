import java.util.*;
import java.text.DecimalFormat;
public class Conversi {
    public static DecimalFormat angka = new DecimalFormat("#0.00");
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continues = true;
        while (continues){
            System.out.println("Masukan Jumlah rupiah yang ingin di Konversi");
            double rupiah = input.nextDouble();
            if (rupiah < 0){
                System.out.println("Nilai uang tidak valid");
            }
            System.out.println("Rp." + rupiah);
            System.out.println("Pilih Mata uang yang mau di konversi");
            String[] pilihan = {". Konversi ke Dollar", ". Konversi ke Euro", ". Konversi ke Poundstering",
                    ". Konversi ke Yen"};
            for (int i = 0; i < pilihan.length; i++) {
                System.out.println((i + 1) + pilihan[i]);
            }
            int userInput = input.nextInt();
            switch (userInput){
                case 1 -> dollar(rupiah);
                case 2 -> euro(rupiah);
                case 3 -> poundsterling(rupiah);
                case 4 -> yen(rupiah);
            }
            System.out.println("Apakaha anda ingin Konversi Mata uang lagi? Y/N");
            String answer = input.next();
            if (answer.equalsIgnoreCase("N")){
                continues = false;
            }
        }
        System.out.println("Terimaksih sudah menggunakan aplikasi kami");

    }
    private static double dollar(double uang){
        double konveksi = uang * 0.00007;
        String format = angka.format(konveksi);
        System.out.println(uang + " setara dengan " + format + " USD");
        return konveksi;
    }
    private static double euro(double uang){
        double konveksi = uang * 0.00006;
        String format = angka.format(konveksi);
        System.out.println(uang + " setara dengan " + format + " EUR");
        return konveksi;
    }
    private static double poundsterling(double uang){
        double konveksi = uang * 0.00005;
        String format = angka.format(konveksi);
        System.out.println(uang + " setara dengan " + format + " GBP");
        return konveksi;
    }
    private static double yen(double uang){
        double konveksi = uang * 0.00966;
        String format = angka.format(konveksi);
        System.out.println(uang + " setara dengan " + format + " JPY");
        return konveksi;
    }
}
