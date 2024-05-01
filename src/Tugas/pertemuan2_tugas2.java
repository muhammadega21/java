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
public class pertemuan2_tugas2 {
    public static void main(String[] args) {
        String nama_pelanggan,lama;
        long lama_menginap, harga, total_harga;
        
        harga = 60000;
        
        nama_pelanggan = JOptionPane.showInputDialog("Masukkan Nama Pelanggan : ");
        lama = JOptionPane.showInputDialog("Masukkan Lama Menginap : ");
        lama_menginap = Integer.parseInt(lama);
        
        total_harga = harga * lama_menginap;
        
        System.out.println("Tampilan hasil inputan");
        System.out.println("Nama Pelanggan : " + nama_pelanggan);
        System.out.println("Harga Kamar/malam : Rp. " + harga);
        System.out.println("Lama Menginap : " + lama_menginap + " Malam");
        System.out.println("Total Bayar : Rp. " + total_harga);        
    }
}
