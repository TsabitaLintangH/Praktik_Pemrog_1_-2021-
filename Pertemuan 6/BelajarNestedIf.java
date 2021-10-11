import java.util.Scanner;

public class BelajarNestedIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan umur Anda = ");
        int umur = scanner.nextInt();
        if(umur <= 5 && umur >= 0) {
            System.out.println("Anda masih balita");
            System.out.println("MAsukan umur orang tua Anda = ");
            int umurOrangTua = scanner.nextInt();
            if(umurOrangTua < 15) {
                System.out.print("Anda bisa mengasuh anak sendiri.");
            }
        } else if(umur > 5 && umur <= 19) {
            System.out.println("Anda sudah remaja");
        } else if(umur < 19) {
            System.out.println("Anda sudah dewasa");
        } else{
            System.out.println("Umur anda tidak valid");
        }
    } 
}

