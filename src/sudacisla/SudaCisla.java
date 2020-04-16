/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudacisla;
import java.util.Scanner;  
/**
 *
 * @author Dan
 */
public class SudaCisla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Variables
        int a;
        int b;
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte první číslo");
        a = sc.nextInt();
        System.out.println("Zadejte druhé číslo");
        b = sc.nextInt();
        if( a < b && a >= 0){
            while (a <= b){
                if(a %2==0){
                    System.out.println(a);
                }
            a= a+1;
            }
                
            }
        
        else{
            System.out.println("Chyba při zadávání");
        }
        }
    }
  

