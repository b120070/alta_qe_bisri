package tugas_oop;
import java.util.Scanner;


public class basic_programming {



    class   persegi {
        public int persegi = 40;

        public static void main(String[] args) {
            int sisi, luas;
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan panjang sisi persegi: ");
            sisi = scan.nextInt();
            luas = sisi * sisi;
            System.out.println("Luas Persegi adalah " + luas);
        }

    }
    class segitiga {
        public int segitiga =40;
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int a, t;
            double luas;

            System.out.print("Masukan Alas : ");
            a=input.nextInt();
            System.out.print("Masukan Tinggi : ");
            t=input.nextInt();

            luas=0.5*a*t;
            System.out.println("Luas Segitiga : "+luas);
        }

    }

    class persegi_panjang{
        public int persegi_panjang = 40;
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int panjang, lebar, luas;

            System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
            System.out.println("-----------------------------------------------");

            System.out.print("Masukan Panjang      : ");
            panjang = input.nextInt();
            System.out.print("Masukan Lebar        : ");
            lebar = input.nextInt();

            luas = panjang * lebar;

            System.out.println("Luas Persegi Panjang : " + luas);
        }
    }

    class   volume_kubus {
        public int persegi = 40;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sisi , volume;

            System.out.println("program perhitungan volume kubus");
            System.out.println("masukkan sisi kubus");
            sisi = input.nextInt();

            volume = (sisi*sisi*sisi);

            System.out.println("volume kubus adalah =" +volume);

        }


    }

    class Kalkulator {
        public int Kalkulator = 40;
        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            int numbers1, numbers2, choice, result= 0;
            System.out.println("Program Kalkulator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pembagian");
            System.out.println("4. Perkalian");
            System.out.println("5. Sisa Bagi");
            System.out.println("-----------------------------");

            // input data
            System.out.print("Masukan Angka Pertama: ");
            numbers1 = input.nextInt();
            System.out.print("Masukan Angka Kedua: ");
            numbers2 = input.nextInt();

            // Pilihan Operasi
            System.out.print("Masukan Operasi: ");
            choice = input.nextInt();

            switch (choice)
            {
                case 1 : result = numbers1 + numbers2; break;
                case 2 : result = numbers1 - numbers2; break;
                case 3 : result = numbers1 / numbers2; break;
                case 4 : result = numbers1 * numbers2; break;
                case 5 : result = numbers1 % numbers2; break;
                default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");
            }
            System.out.println("Hasil: " + result);
        }
    }

    class ongkir {
        public static void main(String[] args) {
//input
            String NamaPengirim = "bisri";
            String AlamatPengirim = "btn";
            String NamaPenerima = "rana";
            String AlamatPenerima = "garut";
            char KodeKota = 'J';

            int kode, TarifPerKg;
            int BeratKiriman = 50;
            boole TrifPerKg = 3500;


            if (kode = 'J') {
                KotaTujuan = "Jakarta";
                TarifPerKg = 3500;
            } else if (kode = 'B') {
                KotaTujuan = "Bandung";
                TarifPerKg = 4500;
            } else if (kode = 'C') {
                KotaTujuan = "Cirebon";
                TarifPerKg = 3000;
            } else (kode == 'T') {
                KotaTujuan = "Tanggerang";
                TrifPerKg == 3500;
            }


            System.out.println("Nama Pengirim \t\t:" + NamaPengirim);
            System.out.println("Alamat Pengirim \t:" + AlamatPengirim);
            System.out.println("Nama Penerima \t:" + NamaPenerima);
            System.out.println("Alamat Penerima \t:”" + AlamatPenerima);
            System.out.println("Kode \t\t\t\t:" + kode);
            System.out.println("Kota Tujuan \t\t:" + KotaTujuan);
            System.out.println("Tarif Per Kg \t\t:" + TarifPerKg);
        }
    }
}
