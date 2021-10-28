import java.util.Scanner;
public class BelajarArrayForBreak {
    public static void main(String[] args) {
        int[] bilangan = new int [1001];
        for (int i = 1; i < 1001; i++) {
            Scanner scan = new Scanner (System.in);
            System.out.println("Masukan bilangan ke-" + i + " = ");
            int cek = scan.nextInt();

            if (cek == 0) { // kalau ngetik 0
                break; // stop print dan lanjut ke for loop selanjutnya
            } else { // kalau masih ngetik angka selain 0
                bilangan [i] = cek; // jalanin scanner cek
            }
        }


        for (int i = 1; i<bilangan.length; i++) {
        if (bilangan[i] == 0) {
            break;
        } else {
            System.out.println("Bilangan ke-" + i + " = " + bilangan[i]);
        }
        
        }
    }
    
}
