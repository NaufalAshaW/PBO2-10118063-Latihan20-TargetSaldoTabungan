import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class TargetSaldoTabungan {

    /**
     * @param args
     */
      public static void main(String[] args){
          Double saldo = 3500000.0;
          Double target = 6000000.0;
          Integer i = 1;
          
          while (saldo <= target){
              saldo += saldo * 0.08;
              System.out.println("Saldo anda di bulan ke- " + i 
                     + " Rp." + TargetSaldoTabungan.formatter(saldo));
              
              i++;
          }
              
    }

    private static String formatter(Double saldo) {
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat
                .getIntegerInstance();
        DecimalFormatSymbols formatIDR = new DecimalFormatSymbols();
        
        formatIDR.setGroupingSeparator('.');
        
        kursIDR.setDecimalFormatSymbols(formatIDR);
        
        return kursIDR.format(saldo);
    }
}