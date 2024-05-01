/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi.pertemuan4;

/**
 *
 * @author Lenovo
 */
public class Array3 {
    public static void main(String[] args) {
        String [][] kontak = {
            {"lili","0811"},
            {"lala","08122"},
            {"maya","08133"}
        };
        
        for (int i = 0; i < kontak.length; i++){
            
               System.out.println("nama : " + kontak[i][0] + ", nomor : " + kontak[i][1] );
        }

    }
   
}
