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
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.println("\nPilih Skema PKM:");
            System.out.println("1. PKM-RE (Riset Eksakta)");
            System.out.println("2. PKM-K (Kewirausahaan)");
            System.out.println("3. PKM-PM (Pengabdian Masyarakat)");
            System.out.print("Pilihan Anda (1-3): ");
            int skema = sc.nextInt();

            if (skema >= 1 && skema <= 3) {
                System.out.println("Pendaftaran PKM Anda berhasil diproses.");
            } else {
                System.out.println("Skema PKM tidak valid.");
            }
        } else {
            System.out.println("\nJenis perlombaan tidak terdaftar.");
        }

        sc.close();
    }
}