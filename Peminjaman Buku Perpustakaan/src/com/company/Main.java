package com.company;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String NPM;
    String TTL;
    String alamat;
    String fakultas;
    String prodi;
    String jenisKelamin;
    Buku buku;

    //Metthod
    void PeminjamanBuku(Buku buku) {
        this.buku = buku;
    }

    //Construktor
    Mahasiswa(String nama, String NPM, String TTL, String alamat, String fakultas, String prodi, String jenisKelamin) {
        this.nama = nama;
        this.NPM = NPM;
        this.TTL = TTL;
        this.alamat = alamat;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
    }

    void datapeminjambuku() {
        System.out.println("");
        System.out.println("===Data Peminjam Buku===");
        System.out.println("nama :" + nama);
        System.out.println("NPM :" + NPM);
        System.out.println("TTL :" + TTL);
        System.out.println("alamat :" + alamat);
        System.out.println("fakultas :" + fakultas);
        System.out.println("prodi :" + prodi);
        System.out.println("jenisKelamin :" + jenisKelamin);
        buku.databuku();
    }
    String getnama(){
        return this.nama;
    }
}

    class Buku {
        String judul;
        String penulis;
        String penerbit;
        int jumlahHalaman;
        int tahunTerbit;
        int stockBuku;

        //Construktor
        Buku(String judul, String penulis, String penerbit, int jumlahHalaman, int tahunTerbit, int stockBuku) {
            this.judul = judul;
            this.penulis = penulis;
            this.penerbit = penerbit;
            this.jumlahHalaman = jumlahHalaman;
            this.tahunTerbit = tahunTerbit;
            this.stockBuku = stockBuku;
        }
        void databuku(){
            System.out.println("judul :" + judul);
            System.out.println("penulis :" + penulis);
            System.out.println("penerbit :" + penerbit);
            System.out.println("jumlahHalaman :" + jumlahHalaman);
            System.out.println("tahunTerbit :" + tahunTerbit);
            System.out.println("stockBuku :" + stockBuku);
        }
        String getBuku(){
            return this.judul;
        }
    }
        public class Main {

            public static void main(String[] args) {
                //inisialisasi Fungsi Scanner
                Scanner input = new Scanner(System.in);

                //Peminjam Buku
                Mahasiswa Mahasiswa1 = new Mahasiswa("Irgi", "2055061010", "Sukabumi,21-03-01",
                        "Kampung Baru", "Teknik", "Teknik Informatika", "Pria");
                Mahasiswa Mahasiswa2 = new Mahasiswa("Ardian", "2055065050", "Bandung,22-03-01",
                        "Kampung Lama", "Teknik", "Teknik Informatika", "Pria");
                Mahasiswa Mahasiswa3 = new Mahasiswa("Marantama", "2055061010", "Jakarta,25-06-01",
                        "Griya Bali", "Teknik", "Teknik Informatika", "Pria");

                //Jenis Buku
                Buku buku1 = new Buku("Rahasia Dibalik Telepon", "Prista Rini", "CV.Iasha Jaya",
                        60, 2015, 30);
                Buku buku2 = new Buku("Laskar Pelangi", "Andrea Hirata", "Benteng Pustaka",
                        529, 2005, 10);
                Buku buku3 = new Buku("Kisah Seorang Pahlawan Resolusi", "Abie Besman", "Kompas Penerbit Buku",
                        362, 2019, 15);

                //Main Program
                System.out.println("Program Peminjaman Buku");
                System.out.print("Masukkan nama : ");
                String nama = input.next();
                if (nama.equals("Irgi") || nama.equals("irgi")) {
                    System.out.println(Mahasiswa1.getnama() + " Berhasil Masuk");
                    display();
                    int pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            Mahasiswa1.PeminjamanBuku(buku1);
                            Mahasiswa1.datapeminjambuku();
                            System.out.println(Mahasiswa1.getnama()+ " Berhasil Meminjam Buku berjudul " + buku1.getBuku());
                            break;
                        case 2:
                            Mahasiswa1.PeminjamanBuku(buku2);
                            Mahasiswa1.datapeminjambuku();
                            System.out.println(Mahasiswa1.getnama()+ " Berhasil Meminjam Buku berjudul " + buku2.getBuku());
                            break;
                        case 3:
                            Mahasiswa1.PeminjamanBuku(buku3);
                            Mahasiswa1.datapeminjambuku();
                            System.out.println(Mahasiswa1.getnama()+ " Berhasil Meminjam Buku berjudul " + buku3.getBuku());
                            break;
                        default:
                    }
                } else if (nama.equals("Ardian") || nama.equals("ardian")) {
                    System.out.print(Mahasiswa2.getnama() + " Berhasil Masuk ");
                    display();
                    int pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            Mahasiswa2.PeminjamanBuku(buku1);
                            Mahasiswa2.datapeminjambuku();
                            System.out.println(Mahasiswa2.getnama()+ " Berhasil Meminjam Buku berjudul " + buku1.getBuku());
                            break;
                        case 2:
                            Mahasiswa2.PeminjamanBuku(buku2);
                            Mahasiswa2.datapeminjambuku();
                            System.out.println(Mahasiswa2.getnama()+ " Berhasil Meminjam Buku berjudul " + buku2.getBuku());
                            break;
                        case 3:
                            Mahasiswa2.PeminjamanBuku(buku3);
                            Mahasiswa2.datapeminjambuku();
                            System.out.println(Mahasiswa2.getnama()+ " Berhasil Meminjam Buku berjudul " + buku3.getBuku());
                            break;
                        default:
                    }
                } else if (nama.equals("Marantama") || nama.equals("marantama")) {
                    System.out.print(Mahasiswa3.getnama() + " Berhasil Masuk ");
                    display();
                    int pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            Mahasiswa3.PeminjamanBuku(buku1);
                            Mahasiswa3.datapeminjambuku();
                            System.out.println(Mahasiswa3.getnama()+ " Berhasil Meminjam Buku berjudul " + buku1.getBuku());
                            break;
                        case 2:
                            Mahasiswa3.PeminjamanBuku(buku2);
                            Mahasiswa3.datapeminjambuku();
                            System.out.println(Mahasiswa3.getnama()+ " Berhasil Meminjam Buku berjudul " + buku2.getBuku());
                            break;
                        case 3:
                            Mahasiswa3.PeminjamanBuku(buku3);
                            Mahasiswa3.datapeminjambuku();
                            System.out.println(Mahasiswa3.getnama()+ " Berhasil Meminjam Buku berjudul " + buku3.getBuku());
                            break;
                        default:
                    }
                } else {
                    System.out.print("Mahasiswa Belum Terdaptar ");
                }

            }

            //        display
            static void display() {
                System.out.println("");
                System.out.println("Pilih Buku Yang Ingin Dipinjam");
                System.out.println("1. Rahasia Dibalik Telepon");
                System.out.println("2.Laskar Pelangi");
                System.out.println("3.Kisah Seorang Pahlawan Resolusi");
                System.out.print("Pilih Buku Yang Dipinjam : ");
            }
        }

