/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGit;

import java.util.Scanner;

/**
 *
 * @author ARNAUD KIMA
 */
public class Application {
  
    public static void main(String[] args) {
        
        MesFonctions fct = new MesFonctions();
       
        int x;
        boolean chX;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez choisir un nombre: ");
        System.out.println("1 pour minimum");
        System.out.println("2 pour maximum");
        System.out.println("3 pour factorielle");
        System.out.println("4 pour palindrome");

        //Lit l'entier écrit par l'utilisateur et l'affecte 
        // à  la variable nombre du programme
        int nombre = scanner.nextInt();
        // Affiche le nombre saisit par l'utilisateur
       if (nombre == 1){
           System.out.println("Entrer le nombre a");
           int a = scanner.nextInt();
           System.out.println("Enter le nombre b");
           int b = scanner.nextInt();
        x = fct.minimum(a, b);
        System.out.println("Le minimum est : " + x);
       }
       else if (nombre == 2){
           System.out.println("Entrer le nombre a");
           int a = scanner.nextInt();
           System.out.println("Enter le nombre b");
           int b = scanner.nextInt();
        x = fct.maximum(a, b);
        System.out.println("Le maximum est : " + x);
       }
       else if (nombre == 3){
           System.out.println("Entrer le nombre n");
           int n = scanner.nextInt();
        x = fct.factorielle(n);
        System.out.println("Le factorielle est : " + x);
       }
       else if (nombre == 4){
           System.out.println("Entrer la chaine");
           String ch = scanner.next();
        chX = fct.estPalindrome(ch);
        System.out.println("Le palindrome est : " + chX);
       }
       
       
    }
    
}
