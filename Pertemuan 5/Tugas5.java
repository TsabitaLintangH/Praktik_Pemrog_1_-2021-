import java.util.Scanner;

public class Tugas5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama lengkap Anda : ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Nilai IPK Anda : ");
        double ipk = scanner.nextDouble();

        System.out.print("Lama masa studi Anda : ");
        int lamaStudi = scanner.nextInt();

        System.out.println();
        System.out.println("Predikat Kelulusan Tahun 2021");
        System.out.println("Nama  : " + namaLengkap);
        System.out.println("IPK : " + ipk);
        System.out.println("Lma masa studi : " + lamaStudi);
    
        if (ipk >= 3.51 && ipk <= 4.00 && lamaStudi <= 4) {
            System.out.println("Selamat! Anda lulus dengan Pujian Tertinggi (Summa Cumlaude).");
        } else if (ipk >= 3.51 && ipk <= 4.00) {
            System.out.println("Selamat! Anda lulus dengan Pujian (Cumlaude).");
        }  else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("Selamat! Anda lulus dengan Sangat Memuaskan.");
        } else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("Selamat! Anda lulus dengan Memuaskan.");
        } else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.println("Selamat! Anda lulus dengan Cukup.");
        } else if (ipk < 2.00) {
            System.out.println("Maaf, Anda dinyatakan Tidak Lulus.");
            System.out.println("Tetap Semangat, Jangan Putus Asa!");
        } else {
            System.out.println("Maaf, IPK Anda Tidak Valid");
        }
    scanner.close();
    }
}