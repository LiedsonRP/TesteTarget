/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetarget.reverse_string;
import java.util.Scanner;

/**
 *
 * @author liedson
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        String string = "";
        String reverse_string = "";
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma string qualquer: ");
        string = scan.nextLine();
        
        for (int i = string.length()-1; i >= 0 ; i--) {
            reverse_string+=string.charAt(i);
        }
        
        System.out.println("A string reversa é: " + reverse_string);
    }    
}
