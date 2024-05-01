/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class jOptionPane {
    public static void main(String[] args) {
        String nama,prodi,alamat,usial,nim;
        int usia;
        
        nama = JOptionPane.showInputDialog("Inputkan nama : ");
        prodi = JOptionPane.showInputDialog("Inputkan Program Studi : ");
        alamat = JOptionPane.showInputDialog("Inputkan Alamat : ");
        nim = JOptionPane.showInputDialog("Inputkan NIM : ");
        usial = JOptionPane.showInputDialog("Inputkan Usia : ");
        usia = Integer.parseInt(usial);
        
        System.out.println("Tampilan hasil inputan");
        System.out.println("Nama : " + nama);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println("NIM : " + nim);
        System.out.println("Usia : " + usia);
        
    }
}
