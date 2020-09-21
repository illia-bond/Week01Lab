/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author absde
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World !");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Your clothes, give them to me (In Arnold Schwarzenegger voice) !");
        System.out.println("Y/N");

        String yn = in.nextLine();
        
        switch(yn.toLowerCase()) {
            case ("y"):
                System.out.println("Ok, goodbye (In Arnold Schwarzenegger voice)");
                break;
            case ("n"):
                System.out.println("You are dead. Try again");
                break;
            default:
                System.out.println("It's a yes or no question");
        } 
    }
    
}
