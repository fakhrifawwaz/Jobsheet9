import java.util.Scanner;

public class Kafe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Daftar menu makanan yang telah ditentukan sebelumnya dalam bentuk array
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        // Menampilkan menu kepada pengguna
        System.out.println("Menu Makanan dan Minuman yang Tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println();
        
        System.out.print("Masukkan jumlah pesanan: ");
        int n = sc.nextInt();
        sc.nextLine(); // Mengonsumsi newline setelah nextInt
        
        String[] namaPesanan = new String[n];
        double[] harga = new double[n];
        
        // Loop untuk input nama dan harga untuk setiap pesanan, dengan verifikasi menggunakan linear search
        for (int i = 0; i < n; i++) {
            boolean ditemukan = false;
            String namaMakanan;
            
            do {
                System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
                namaMakanan = sc.nextLine();
                
                // Proses pencarian menggunakan linear search pada array menu
                for (String item : menu) {
                    if (item.equalsIgnoreCase(namaMakanan)) {
                        ditemukan = true;
                        break;
                    }
                }
                
                if (!ditemukan) {
                    System.out.println("Makanan '" + namaMakanan + "' tidak ada di menu. Silakan pilih dari menu yang tersedia.");
                }
            } while (!ditemukan); // Ulangi sampai makanan ditemukan
            
            namaPesanan[i] = namaMakanan;
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            harga[i] = sc.nextDouble();
            sc.nextLine(); // Mengonsumsi newline setelah nextDouble
        }
        
        // Menghitung total biaya
        double totalBiaya = 0;
        for (double h : harga) {
            totalBiaya += h;
        }
        
        // Menampilkan daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < n; i++) {
            System.out.println("- " + namaPesanan[i] + ": Rp " + harga[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
        
        sc.close();
    }
}
