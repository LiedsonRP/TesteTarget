/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetarget.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author liedson
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean confirm = false;
        int number = 0;
        int actual_number = 1;
        int previous_number = 0;

        System.out.println("Digite um número: ");
        try {

            number = scan.nextInt();

            if (number < 0) {
                throw new InputMismatchException();
            }

            if (number != 0 && number != 1) {
                while (actual_number < number) {
                    actual_number = previous_number + actual_number;
                    previous_number = actual_number - previous_number;

                    if (actual_number == number) {
                        confirm = true;
                        break;
                    }
                }
            }

            if (confirm || number == 0 || number == 1) {
                System.out.println("O número informado faz parte da sequencia de Fibonacci");
            } else {
                System.out.println("O número informado não faz parte da sequencia de Fibonacci");
            }

        } catch (InputMismatchException ex) {
            System.out.println("O valor digitado não é um número inteiro positivo");
        }
    }
    
}
