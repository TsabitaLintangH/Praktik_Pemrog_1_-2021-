import java.util.Scanner;

public class Siakad { 
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        System.out.println();
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=8) {  //menampilan menu siakad
            menu = tampilanMenu();
            if (menu == 1) {
                siakad.lihatData();
            } else if (menu == 2) {
                siakad.tambahData();
            } else if (menu == 3) {
                siakad.cariData();
            } else if (menu == 4) {
                siakad.rerataIPK();
            } else if (menu == 5) {
                siakad.hapusData();
            } else if (menu == 6) {
                siakad.editNama();
            }
        }
    }

    public static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("---MENU---");
        System.out.println("1. Lihat Data Mahasiswa");
        System.out.println("2. Menambah Data Mahasiswa");
        System.out.println("3. Cari Data Mahasiswa");
        System.out.println("4. Rata-rata IPK Mahasiswa");
        System.out.println("5. Edit Nama Mahasiswa");
        System.out.println("6. Hapus Data Mahasiswa");
        System.out.println("8. Keluar");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;
    }

    private void lihatData() {
        if (jumlahData == 0) {
            System.out.println("Data tidak ada");
        } else {
            System.out.println("Berikut adalah data mahasiswa");
            for (int i=0; i<jumlahData; i++) {
                mahasiswa[i].getDetail();
            }
        }
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukan Nama Mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukan IPK Mahasiswa = ");
        double ipk = scan.nextDouble();
        System.out.print("Masukan Tinggi Badan Mahasiswa = ");
        double tinggiBadan = scan.nextDouble();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk, tinggiBadan);
        inputMahasiswa.setTinggiBadan(tinggiBadan);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
    }

    private void cariData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
        int index = getIndexNIM(nim);
        if (index == -1 ) {
            System.out.println("NIM Mahasiswa yang Anda cari tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexNIM(String nim) {
        for (int i = 0; i <jumlahData; i++) {
            if(mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rata-rata IPK Mahasiswa = " + rerata);
    }

    public void editNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang ingin diedit = ");
        String nim = scan.nextLine();
        int index = getIndexNIM(nim);
        if (index == -1 ) {
            System.out.println("Mahasiswa yang Anda cari tidak ditemukan");
        } else {
            System.out.print("NIM  Nama  IPK  TinggiBadan");
            mahasiswa[index].getDetail();
            System.out.println();
            System.out.print("Masukan Nama Mahasiswa yang baru = ");
            String namaedit = scan.nextLine();
            mahasiswa[index].setNama(namaedit);
            System.out.print("Masukan IPK Mahasiswa yang baru = ");
            double ipkedit = scan.nextDouble();
            mahasiswa[index].setIPK(ipkedit);
            System.out.print("Masukan Tinggi Badan Mahasiswa yang baru = ");
            double tinggiBadanedit = scan.nextDouble();
            mahasiswa[index].setTinggiBadan(tinggiBadanedit);
            mahasiswa[index].getDetail();
        }
    }

    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa dari data yang akan dihapus = ");
        String nim = scan.nextLine();
        int index = getIndexNIM(nim);
        if (index == -1) {
            System.out.println("Mahasiswa yang Anda akan hapus tidak ditemukan");
        } else {
            for(int i = index; i<jumlahData; i++){
                mahasiswa[i] = mahasiswa [i+1];
            }
            jumlahData--;
            lihatData();
        }
    }
}
