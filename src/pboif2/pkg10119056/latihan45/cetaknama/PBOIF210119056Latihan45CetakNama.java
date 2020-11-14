/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan45.cetaknama;
import java.util.Scanner;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Cetak nama
 */


public class PBOIF210119056Latihan45CetakNama {

    public static void main(String[] args) {
        Printer printer=new Printer();
        Scanner input=new Scanner(System.in);
        System.out.println("====Aplikasi Pencetak Nama====");
        
        System.out.print("Masukkan nama anda : ");
        printer.setNama(input.next());
        System.out.print("Mau cetak nama berapa kali? :");
        printer.setJmlCetak(input.nextInt());
        printer.cetak(printer.getNama());
        
        printer.cetak(printer.getJmlCetak(), printer.getNama());
        
        
        
        
        
        
//        System.out.print("Masukkan nama anda : ");
//        printer.cetak(input.next());
//        System.out.println("Mau cetak nama berapa kali?");
//        printer.cetak(input.nextInt(),input.next());
        
        
    }
    
}
