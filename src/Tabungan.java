/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.NumberFormat;
import java.util.Locale;        
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan target saldo tabungan dalam objek
 */
public class Tabungan {

    public int saldoAwal, lama;
    public double bungaPerBulan;
    
    public void hitungSaldo(){
        saldoAwal = 3500000;
        bungaPerBulan = 0.08;
        lama = 8;
        for (int i = 1; i <= lama; i++){
            saldoAwal = (int) (saldoAwal + (saldoAwal * bungaPerBulan));
            NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id","ID"));
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + numberFormat.format(saldoAwal));            
    }
}
           
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabungan = new Tabungan();
        tabungan.hitungSaldo();
    }
    
}
