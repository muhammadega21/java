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
public class pertemuan3_tugas2 {
    public static void main(String[] args) {
        // Table
        System.out.println("Daftar Harga Barang Beserta Harga");
        System.out.println("=================================");
        System.out.println("Kode Barang          Nama Barang          Harga Barang");
        System.out.println("A1                   Sabun Mandi          Rp. 30.000");
        System.out.println("A2                   Shampo               Rp. 50.000");
        System.out.println("A3                   Pasta Gigi           Rp. 25.000");
        System.out.println("A4                   Sikat Gigi           Rp. 15.000");
        
        // Input
        String input,jml, nama_barang,diskon;
        int A1=30000, 
            A2=50000, 
            A3=25000, 
            A4=1500,
            qty,harga, total_harga;
        double total_bayar;
        
        input = JOptionPane.showInputDialog("Inputkan ID Barang");
        jml = JOptionPane.showInputDialog("Inputkan Jumlah Beli");
        qty = Integer.parseInt(jml);
        
        switch (input) {
            case "A1":
                nama_barang = "Sabun Mandi";
                harga = 30000;
                break;
            case "A2":
                nama_barang = "Shampo";
                harga = 50000;
                break;
            case "A3":
                nama_barang = "Pasta Gigi";
                harga = 25000;
                break;
            case "A4":
                nama_barang = "Sikat Gigi";
                harga = 15000;
                break;
            default:
                System.out.println("Kode yang Anda Inputkan Salah");
                return;
        }
        
        total_harga = qty * harga;
        
        if(total_harga >= 500000 ){
            total_bayar = total_harga - (0.1 * total_harga);
            diskon = "10%";
        }else{
            total_bayar = total_harga;
            diskon = "0";
        }
        
        System.out.println("Kode Barang  : " + input);
        System.out.println("Nama Barang  : " + nama_barang);
        System.out.println("Jumlah Beli  : " + qty);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Total Bayar  : " + total_harga);
        System.out.println("Diskon       : " + diskon);
        System.out.println("Total Bayar  : " + total_bayar);
    }
}
