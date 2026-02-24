public class bidangDuaDimensi{
    String nama;

    public bidangDuaDimensi(String nama){
        this.nama = nama;
    }

    void info(){
        System.out.println("Nama bangun: " + nama);
    }
    void luas(){
       
    }
}

/*
Superclass juga mempunyai method info() dan method luas().
Method Info() di superclass akan mencetak nilai atribut nama
Catatan: Method luas() belum di definisikan
Buat sub class bujurSangkar yang mempunyai atribut sisi
Sub class bujurSangkar adalah sub class dari super class bidangDuaDimensi
Buat contructor dari class bujurSangkar
Lakukan overriding dari method luas() yang berada di super class
Seperti saat membangun sub class bujurSangkar, buat sub class Lingkaran
Implementasikan di kelas App
*/