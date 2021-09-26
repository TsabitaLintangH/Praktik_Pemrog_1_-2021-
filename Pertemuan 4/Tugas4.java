import java.util.Scanner;

public class Tugas4 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai a : ");
        double a = scanner.nextDouble();
        System.out.print("Masukan nilai b : ");
        double b = scanner.nextDouble();

        double hasil1 = a + b;
        System.out.println("Hasil a + b = " + hasil1);
        double hasil2 = a - b;
        System.out.println("Hasil a - b = " + hasil2);
        double hasil3 = a * b;
        System.out.println("Hasil a * b = " + hasil3);
        double hasil4 = a / b;
        System.out.println("Hasil a / b = " + hasil4);
    }
    
}
