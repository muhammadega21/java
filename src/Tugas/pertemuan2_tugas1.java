/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class pertemuan2_tugas1 {
    public static void main(String[] args) {
        String nama_karyawan,alamat,jenis_kelamin,jabatan,telp;
        long no_telp;
        
        nama_karyawan = JOptionPane.showInputDialog("Masukkan Nama Karyawan : ");
        alamat = JOptionPane.showInputDialog("Masukkan Alamat : ");
        jenis_kelamin = JOptionPane.showInputDialog("Masukkan Jenis Kelamin : ");
        jabatan = JOptionPane.showInputDialog("Masukkann Jabatan : ");
        telp = JOptionPane.showInputDialog("Masukkan Nomor Telepon : ");
        no_telp = Long.parseLong(telp);
        
        System.out.println("Tampilan hasil inputan");
        System.out.println("Nama Karyawan : " + nama_karyawan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jenis Kelamin : " + jenis_kelamin);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("no_telp : 0" + no_telp);
        
    }
}
