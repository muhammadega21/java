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
public class pertemuan3_tugas1 {
    public static void main(String[] args) {
        String nama,prodi;
        
        nama = JOptionPane.showInputDialog("Inputkan Nama Anda");
        prodi = JOptionPane.showInputDialog("Inputkan Prodi Anda");
        
        System.out.println("Nama : " + nama);
        switch (prodi) {
            case "SI":
                System.out.println("Prodi : Sistem Informasi");
                break;
            case "TI":
                System.out.println("Prodi : Teknik Informatika");
                break;
            case "BD":
                System.out.println("Prodi : Bisnis Digital");
                break;
            case "MR":
                System.out.println("Prodi : Manajemen Ritel");
                break;
            case "DKV":
                System.out.println("Prodi : Desain Komunikasi Visual");
                break;
            default:
                System.out.println("Prodi : " + prodi)
                        ;
        }
    }
}
