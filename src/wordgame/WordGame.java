/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgame;

import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) 
    {
        System.out.print("Try to guess the hidden word and see if you're right!");
        
        Scanner sc = new Scanner(System.in);
        String guess = sc.next();
        
        System.out.println("You guessed: " + guess);
        System.out.println("The hidden word is: Project");
        
        if (guess.equals("Project"))
            System.out.println("Congrats!");
        else
            System.out.println("Try Again!");
    }
}
