package AlgoritmaPengulangan;

import java.util.Scanner;


class nameLength {


    public static boolean checkNameLength(String nama) {
        if(nama == null){
            return false;
        }
        int length = nama.length();
        return length >= 1 && length <= 20;

    }
}

class nimLength {

    public static boolean checkNimLength(String nim) {

        if(nim == null){
            return false;
        }
        int length = nim.length();
        return length == 10;

    }
}

class validasiJumlahAngka {

    public static boolean checkJumlahAngka(int jumlahAngka) {
        if(jumlahAngka >=5 && jumlahAngka <=20){
            return true;
        }
        return false;
    }
}

public class Main {

    public static void main(String[] args) {


        boolean done = false;
        boolean done2 = false;
        boolean done3 = false;
        int jumlahAngka;
        String tampilanNim;
        String nama, nim;
        String jawabanPengulangan;
        Boolean pengulangan=true;


            Scanner scanner = new Scanner(System.in);

            do{
                System.out.println("Masukkan nama anda [1..25] ");
                nama = scanner.nextLine();
                if (nameLength.checkNameLength(nama)) {
                    done = true;
                    System.out.println("");
                } else {
                    System.out.println("nama harus diisi dengan minimal 1 karakter dan maksimal 20 karakter");
                }
            } while (!done);

            do {
                System.out.println("Masukkan NIM anda [harus 10 karakter] ");
                nim = scanner.nextLine();
                if (nimLength.checkNimLength(nim)) {
                    done3 = true;
                    System.out.println("");
                } else {
                    System.out.println("NIM harus 10 karakter");
                }
            } while (!done3);

            System.out.println("Registrasi Sukses");
            System.out.println("Selamat datang " + nama + " {NIM: " + nim + "]");

            System.out.println(("Mari belajar macam-macam deret bilangan.."));


            while(pengulangan) {
                do {
                    System.out.println("Masukkan sembarang angka [5..20] ");
                    jumlahAngka = scanner.nextInt();
                    if (validasiJumlahAngka.checkJumlahAngka(jumlahAngka)) {
                        done2 = true;
                        System.out.println("");
                    } else {
                        System.out.println("jumlah angka minimal 5 maksimal 20");
                    }
                } while (!done2);

                System.out.println("Deret Bilangan");

                System.out.println(jumlahAngka + "Bilangan Genap");

                int bilangangenap = 0;
                int nomorGenap = 0;
                int jumlahBilGenap = 0;

                while (bilangangenap < jumlahAngka) {
                    nomorGenap++;

                    if (nomorGenap % 2 == 0 && bilangangenap <= jumlahAngka) {
                        System.out.print(nomorGenap + " ");
                        bilangangenap++;
                        jumlahBilGenap += nomorGenap;
                    }

                }

                System.out.println("Hasil Penjumlahan: " + jumlahBilGenap);

                //       }


                System.out.println(jumlahAngka + " Bilangan Ganjil");

                int bilanganganjil = 0;
                int nomorGanjil = 0;
                int jumlahBilGanjil = 0;

                while (bilanganganjil < jumlahAngka) {
                    nomorGanjil++;

                    if (nomorGanjil % 2 == 1 && bilanganganjil <= jumlahAngka) {
                        System.out.print(nomorGanjil + " ");
                        bilanganganjil++;
                        jumlahBilGanjil += nomorGanjil;
                    }


                }
                System.out.println("Hasil Penjumlahan: " + jumlahBilGanjil);

                System.out.println(jumlahAngka + " Bilangan fibonacci");

                int bilanganFibonacci = 0;
                int nomorFibonacci = 0;
                int jumlahBilFibonacci = 0;
                int past = 1, current = 0;

                for (int i = 0; i < jumlahAngka; i++) {
                    nomorFibonacci = current + past;
                    System.out.print(nomorFibonacci + " ");
                    past = current;
                    current = nomorFibonacci;
                    jumlahBilFibonacci += nomorFibonacci;
                }
                System.out.println( "Hasil Penjumlahan: " + jumlahBilFibonacci);


                System.out.println("Anda ingin mengulangi perhitungan?[y,t]");
                jawabanPengulangan = scanner.next();
                if (jawabanPengulangan.equalsIgnoreCase("t")) {
                    pengulangan= false;
                }

            }

            System.out.println("Program selesai");

    }
}







