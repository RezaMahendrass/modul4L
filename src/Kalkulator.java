import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma Natural");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.println("Pilih Operasi (1/2/3/4/5) :");

            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
            }

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    double angkaAkar = scanner.nextDouble();
                    hasil = Math.sqrt(angkaAkar);
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    double angkaPangkat = scanner.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double pangkat = scanner.nextDouble();
                    hasil = Math.pow(angkaPangkat, pangkat);
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    double angkaLog = scanner.nextDouble();
                    hasil = Math.log(angkaLog);
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    int angkaFaktorial = scanner.nextInt();
                    hasil = faktorial(angkaFaktorial);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }

            System.out.println("Hasil: " + hasil);
        }

        scanner.close();
    }

    private static double faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}
