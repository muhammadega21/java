/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class bufferReader {
    public static void main(String[] args) {
        String nama,prodi,alamat,nim;
        int usia;
        
        try{
            BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Data Mahasiswa Universitas Metamedia");
            System.out.println("====================================");
            System.out.print("Nama Mahasiswa : ");
            nama = masukan.readLine();
            System.out.print("Program Studi : ");
            prodi = masukan.readLine();
            System.out.print("Alamat : ");
            alamat = masukan.readLine();
            System.out.print("Nim : ");
            nim = masukan.readLine();
            System.out.print("Usia : ");
            usia = Integer.parseInt(masukan.readLine());
            
            System.out.println("=====================================");
            System.out.println("Tampilan hasil inputan");
            System.out.println("Nama yang diinputkan : " + nama);
            System.out.println("Program Studi : " + prodi);
            System.out.println("Alamat : " + alamat);
            System.out.println("NIM : " + nim);
            System.out.println("Usia : " + usia);
        }
        catch(IOException e){}
    }
}
