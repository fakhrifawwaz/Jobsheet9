import java.util.Scanner;
public class NilaiMahasiswa15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Banyaknya nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        int n = sc.nextInt();

        //array untuk simpan nilainya
        int[] nilai = new int[n];

        //input nilai tiap mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) +": ");
            nilai[i] = sc.nextInt();
        }
        //menghitung rata2
        double total = 0;
        for (int val : nilai){
            total += val;
        }
        double rataRata = total / n;

        //mencari nilai tertinggi dan terrendah
        int max = nilai[0];
        int min = nilai[0];
        for (int val : nilai) {
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        System.out.print("\nNilai yang telah dimasukkan:");
        for (int val : nilai) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        // Menampilkan rata-rata, tertinggi, dan terendah
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        
        sc.close();

    }
}
