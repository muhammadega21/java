/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class scanner {
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,prodi,alamat, nim;
        int usia,gaji;
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Data Mahasiswa Universitas Metamedia");
        System.out.println("====================================");
        System.out.print("Nama Mahasiswa : ");
        nama = masukan.nextLine();
        System.out.print("Program Studi : ");
        prodi = masukan.nextLine();
        System.out.print("Alamat : ");
        alamat = masukan.nextLine();
        System.out.print("NIM : ");
        nim = masukan.nextLine();
        System.out.print("Usia : ");
        usia = masukan.nextInt();
        
        System.out.println("=====================================");
        System.out.println("Tampilan hasil Inputan");
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println("NIM : " + nim);
        System.out.println("Usia : " + usia);
    }
}
