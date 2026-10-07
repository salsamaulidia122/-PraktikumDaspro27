import java.util.Scanner;

public class StudiKasus227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pendaftaran Lomba Kampus ===");
        System.out.print("Masukkan jenis perlombaan (Lomba/PKM/Lainnya): ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("Lomba")) {
            System.out.println("\nPilih Tingkat Perlombaan:");
            System.out.println("1. Nasional");
            System.out.println("2. Internasional");
            System.out.print("Pilihan Anda (1/2): ");
            int tingkat = sc.nextInt();

            if (tingkat == 1) {
                System.out.println("Anda mendaftar Lomba Tingkat Nasional.");
            } else if (tingkat == 2) {
                System.out.println("Anda mendaftar Lomba Tingkat Internasional.");
            } else {
                System.out.println("Pilihan tingkat tidak valid.");
            }
        }

        sc.close();
    }
}