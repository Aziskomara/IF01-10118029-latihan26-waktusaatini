/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program waktu saat ini
 */
public class Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateformatted = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH : mm : ss");
        String formattedDate = date.format(dateformatted);
        System.out.println(formattedDate);
        
    }
    
}
