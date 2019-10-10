/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118028.latihan19.saldotabungan;
    import java.text.DecimalFormat;
    import java.text.DecimalFormatSymbols;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Saldo Tabungan
 */
public class IF0110118028Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double bunga;
        double saldo = 2500000;
        
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        rupiah.setDecimalFormatSymbols(formatRp);
            for(int i = 1;i<=6;i++){
                bunga =  0.15 * saldo ;
                saldo = bunga + saldo;
                System.out.printf("Saldo di bulan ke- " + i +  " %s%n",rupiah.format(saldo) );
            
        }
        
    }
    
}
