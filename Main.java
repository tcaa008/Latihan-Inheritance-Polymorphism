import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== MENU EKSPLORASI INHERITANCE & POLYMORPHISM ===");
            System.out.println("1. Buat Bujur Sangkar");
            System.out.println("2. Buat Lingkaran");
            System.out.println("3. Buat Silinder");
            System.out.println("4. Demonstrasi Polymorphism");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // bersihin enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan warna: ");
                    String warnaBS = scanner.nextLine();
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = scanner.nextDouble();

                    BujurSangkar bs = new BujurSangkar(sisi, warnaBS);
                    System.out.println("\n--> Hasil:");
                    bs.printInfo();
                    break;

                case 2:
                    System.out.print("Masukkan warna: ");
                    String warnaL = scanner.nextLine();
                    System.out.print("Masukkan radius: ");
                    double radius = scanner.nextDouble();

                    Lingkaran l = new Lingkaran(radius, warnaL);
                    System.out.println("\n--> Hasil:");
                    l.printInfo();
                    break;

                case 3:
                    System.out.print("Masukkan warna: ");
                    String warnaS = scanner.nextLine();
                    System.out.print("Masukkan radius: ");
                    double rS = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();

                    Silinder s = new Silinder(tinggi, rS, warnaS);
                    System.out.println("\n--> Hasil:");
                    s.printInfo();
                    break;

                case 4:
                    System.out.println("\n--- Demonstrasi Polymorphism ---");
                    Bentuk[] daftarBentuk = new Bentuk[3];
                    daftarBentuk[0] = new BujurSangkar(4, "Merah");
                    daftarBentuk[1] = new Lingkaran(7, "Biru");
                    daftarBentuk[2] = new Silinder(10, 5, "Hijau");

                    for (Bentuk b : daftarBentuk) {
                        b.printInfo(); 
                    }
                    break;

                case 5:
                    berjalan = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}