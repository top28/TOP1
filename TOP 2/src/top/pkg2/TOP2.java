/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.pkg2;

/**
 *
 * @author Lenovo
 */
public class TOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiAndroid = 85;
    String wajah = "cantik" ;
    String asal = "malang" ;
    
     char nilaiAndroidhuruf;
     if (nilaiAndroid >= 85 ){
            nilaiAndroidhuruf = 'A' ;
            System.out.println("IPK "+nilaiAndroidhuruf);
        }
     else if (nilaiAndroid < 85 && nilaiAndroid >= 75){
            nilaiAndroidhuruf = 'B' ;
            System.out.println("IPK "+nilaiAndroidhuruf);
        }
     else if (nilaiAndroid < 75 && nilaiAndroid >= 65){
            nilaiAndroidhuruf = 'C' ;
            System.out.println("IPK "+nilaiAndroidhuruf);
        }
     else if (nilaiAndroid < 65 && nilaiAndroid >= 55){
            nilaiAndroidhuruf = 'D' ;
            System.out.println("IPK "+nilaiAndroidhuruf);
        }
     else {nilaiAndroidhuruf = 'E' ;
           System.out.println("IPK "+nilaiAndroidhuruf);
        }
     
     System.out.println("apakah mau menikah?");
     
     if (nilaiAndroidhuruf == 'A' && wajah == "cantik" && asal == "malang" ){
         System.out.println("Mau Banget");
     }
     else if (nilaiAndroidhuruf == 'A' || nilaiAndroidhuruf == 'C' && wajah == "cantik" && asal == "malang" ){
         System.out.println("Boleh Lah...");
     }
     else if (asal == "malang" ){
         System.out.println("Saya Pikir dulu");
     }
     else {
         System.out.println("Absolutly No!");
     }    
    }
    
}
