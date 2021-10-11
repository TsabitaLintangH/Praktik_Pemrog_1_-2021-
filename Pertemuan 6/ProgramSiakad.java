import java.util.Scanner;

public class ProgramSiakad {
    public static void main(String[] args) {
        System.out.println(" PROGRAM SIAKAD ");
        System.out.println("1. Tambah data");
        System.out.println("2. Edit data");
        System.out.println("3. Hapus data");
        System.out.println("4. Lihat data");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Program Siakad yang Anda pilih = ");
        int program = scanner.nextInt();
        if(program == 1) {
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mata Kuliah");
            System.out.println("3. Kembali");
            int pilih = scanner.nextInt();
            if(pilih == 1) {
                Scanner scan = new Scanner(System.in);
                System.out.println(" TAMBAH DATA MAHASISWA ");
                System.out.println();
                System.out.println("Masukan nama Mahasiswa = ");
                String namaMahasiswa = scan.nextLine();
                System.out.println("Nama mahasiswa adalah " + namaMahasiswa);
            } else if(pilih == 2) {
                Scanner scan = new Scanner(System.in);
                System.out.println(" TAMBAH DATA MATA KULIAH ");
                System.out.println();
                System.out.println("Masukan nama mata kuliah = ");
                String namaMataKuliah = scanner.nextLine();
                System.out.println("Nama mata kuliah " + namaMataKuliah);
            } else if(pilih == 3) {
                System.out.println("Terima kasih");
            } else if(pilih > 1 && pilih < 5) {
                System.out.println("Fitur belum tersedia");
            } else if(pilih < 1 && pilih > 3) {
                System.out.println("Menu tidak tersedia");
            }
        }
    }
    
}
