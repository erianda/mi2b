/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author erianda
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="Aldo";
        mhs.nobp ="07110080";
        mhs.kelas ="A";
        mhs.prodi = "TKJW";
        mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama : " +mhs.nama+ "\n"
                + "No BP : "+mhs.nobp+"\n"
                        + "Jurusan : "+mhs.jurusan+"\n"
                                + "Prodi : "+ mhs.prodi+"\n"
                                        + "Kelas : "+mhs.kelas);
        System.out.println("");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama ="Aldi";
        mhs2.nobp ="07110090";
        mhs2.kelas ="A";
        mhs2.prodi = "TKJW";
        mhs2.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama : " +mhs2.nama+ "\n"
                + "No BP : "+mhs2.nobp+"\n"
                        + "Jurusan : "+mhs2.jurusan+"\n"
                                + "Prodi : "+ mhs2.prodi+"\n"
                                        + "Kelas : "+mhs2.kelas);
        
        
        
    }
}
