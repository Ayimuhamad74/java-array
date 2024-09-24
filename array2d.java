import java.util.Scanner; //untuk menginport masukan dari java.util.scanner

public class array2d { //mendeskripsikan kelas public
    public static void main(String[] args) //deklarasi metode utama (main method) dalam program Java. 
    {
        Scanner inputan = new Scanner(System.in); //digunakan untuk membuat objek dari kelas Scanner yang akan 
        //digunakan untuk membaca masukan dari pengguna melalui keyboard (input dari sistem).
        int A[][] = new int[2][2]; //pendeklarasian variabel dengan array 2d
        int B[][] = new int[2][2]; //pendeklarasian variabel dengan array 2d
        int C[][] = new int[2][2]; //pendeklarasian variabel dengan array 2d
        System.out.println("Masukan Nilai Matriks X");
        //program meminta pengguna untuk memasukkan nilai-nilai matriks X
        System.out.println("----------------------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            //merupakan suatu konstruksi perulangan (loop) yang menggunakan pernyataan for untuk mengulang iterasi sebanyak dua kali
            {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "]:"); 
                //digunakan untuk mencetak ke konsol pesan yang menunjukkan indeks atau posisi suatu elemen dalam matriks.
                A[i][j] = inputan.nextInt();
                // pengguna diminta untuk memasukkan nilai-nilai matriks A, dan nilai-nilai tersebut disimpan dalam elemen-elemen matriks
            }
        }
        System.out.println("\nMasukan Nilai MAtriks Y"); //untuk memasukan nilai matriks Y
        System.out.println("=========================");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            //merupakan suatu konstruksi perulangan (loop) yang menggunakan pernyataan for untuk mengulang iterasi sebanyak dua kali
            {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "]:");
                //digunakan untuk mencetak ke konsol pesan yang menunjukkan indeks atau posisi suatu elemen dalam matriks.
                B[i][j] = inputan.nextInt();
                //digunakan untuk membaca nilai dari pengguna dan menyimpannya dalam elemen matriks B pada baris i dan kolom j
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            //merupakan suatu konstruksi perulangan (loop) yang menggunakan pernyataan for untuk mengulang iterasi sebanyak dua kali
            {
                C[i][j] = A[i][j] + B[i][j];
                //digunakan untuk menjumlahkan nilai elemen-elemen matriks A dan B 
            }
        }
        System.out.println("\nHasil penjumlahan Matriks");
        //untuk menampilkan hasil penjumlahan matriks dari inputan
        System.out.println("=========================");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
            //merupakan suatu konstruksi perulangan (loop) yang menggunakan pernyataan for untuk mengulang iterasi sebanyak dua kali

            {
                System.out.println((C[i][j] + " "));
                //digunakan untuk mencetak nilai elemen matriks C ke konsol pada baris ke-i dan kolom ke-j,
            }
            System.out.println(" ");
            // untuk mencetak baris kosong (new line)
        }
    }
}