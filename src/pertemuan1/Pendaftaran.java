/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author erianda
 */
public class Pendaftaran {
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
    }
    
}
