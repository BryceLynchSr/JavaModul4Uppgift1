/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4inlämningsuppgift1;
import java.util.Scanner;


public class Modul4inlämningsuppgift1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("DETTA ÄR ETT PROGRAM SOM JÄMFÖR TVÅ STRÄNGAR");
        //Användaren matar in hur många gånger två strängar ska jämföras
        System.out.print("Ange antal testfall (max 10 st): ");
        int antal_strängar = input.nextInt();
        input.nextLine();
        
        //Det kontrolleras att användaren har angett antal 1-10, annars avslut
        if (antal_strängar<1 || antal_strängar>10){
            System.out.print("Antalet måste vara mellan 1-10");
             System.exit(0);}
        
        //Användaren matar in första strängen
        for (int i=1; i<=antal_strängar; i++){
            System.out.print("Ange sträng 1 (max 50 tecken lång, endast siffror"
                             + " eller bokstäver): ");
            String sträng1 = input.nextLine();
            
            //Det skapas en array med tecken av sträng 1
            char[] charArray1 = sträng1.toCharArray();
            //Det kontrolleras att endast siffror eller bokstäver angivits
            //om inte så avslutas programmet
            for (int k = 0; k<charArray1.length; k++){
                int k1 = (int)charArray1[k];
                if(k1>0 && k1<48){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(k1>57 && k1<65){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(k1>90 && k1<97){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(k1>122 && k1<196){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(k1>197 && k1<214){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(k1>214 && k1<228){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(k1>229 && k1<246){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(k1>246){
                System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                }
            
            //Användaren matar in andra strängen    
            System.out.print("Ange sträng 2 (lika många tecken som sträng 1,"
                             + " endast siffror eller bokstäver): ");
            String sträng2 = input.nextLine();
            
            //Det skapas en array med tecken av sträng 2
            char[] charArray2 = sträng2.toCharArray();
            //Längden på vardera sträng beräknas
            int längd1 = sträng1.length();
            int längd2 = sträng2.length();
            //Om strängarna inte är lika långa eller om antal tecken 
            //är 0 eller överskrider 50 avslutas programmet
            if ((längd1<1 || längd1>50)|| (!(längd2 == längd1))){
               System.exit(0);}
            //Det kontrolleras att endast siffror eller bokstäver angivits 
            //om inte så avslutas programmet
            for (int h = 0; h<charArray2.length; h++){
                int h1 = (int)charArray2[h];
                if(h1>0 && h1<48){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(h1>57 && h1<65){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(h1>90 && h1<97){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(h1>122 && h1<196){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(h1>197 && h1<214){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(h1>214 && h1<228){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(h1>229 && h1<246){
                    System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                else if(h1>246){
                System.out.print("Inte en siffra eller bokstav");
                    System.exit(0);}
                }
            
            //Båda arrays skrivs ut som tecken
            for (char char1 : charArray1) {
            System.out.print(char1);}
            System.out.print("\n");
            for (char char2 : charArray2){
            System.out.print(char2);}
            System.out.print("\n");
            
            //En tredje array med tecken skapas, sedan jämförs varje tecken i
            //array1 och array2, vid matchning tilldelas array3 tecken 'x',
            //vid ej matchning tilldelas array3 tecken '*'
            char [] charArray3 = new char[51];
            for (int j = 0; j<charArray1.length; j++){
                if(charArray1[j] == charArray2[j]){
                   charArray3[j] = 'x';}
                else {charArray3[j] = '*';}
                }
            
            //Array3 skrivs ut för att visa vilka tecken som matchar och vilka
            //som inte matchar
            for (char char3 : charArray3){
                System.out.print(char3);}
                System.out.print("\n");
            System.out.print("x = samma tecken, * = ej samma tecken" +"\n");
            } 
        //Om användaren angett fler än 1 jämförelse börjar programmet om,
        //annars avslutas programmet
       }
       
    }

    
       
            
        
          
      
        
        
    
    

