import java.util.Scanner;

public class Kafe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan: ");
        int n = sc.nextInt();
        sc.nextLine(); // Mengonsumsi newline setelah nextInt
        

        String[] namaPesanan = new String[n];
        double[] harga = new double[n];
        
        // nama dan harga untuk setiap pesanan
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            harga[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        
        // Menghitung total biaya
        double totalBiaya = 0;
        for (double h : harga) {
            totalBiaya += h;
        }
        
        // daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < n; i++) {
            System.out.println("- " + namaPesanan[i] + ": Rp " + harga[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
        
        sc.close();
    }
}
