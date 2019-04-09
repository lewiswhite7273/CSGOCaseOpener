/*
 * Lewis White
 * April 4
 * This program will simulate a case opening, like seen in Counter-Strike: Global Offensive
 */

package csgocaseopener;
import java.io.*;
import java.util.*;
/**
 *
 * @author lewhi7273
 */
public class CsgoCaseOpener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        int nOCases, casePick;
        String weapon;
        //get ready to read the file
        BufferedReader readFile = new BufferedReader(
       new FileReader("opened"));
        //get ready to be able to print to the file
        PrintWriter fileOut = new PrintWriter(new FileWriter(
      "opened", true));
        
        
        System.out.println("Welcome to a CSGO Case Opening Simulator!");
        System.out.println("Rarity from cases goes as follows: \n"
                + "(*) - Common \n"
                + "(**) - Rare \n"
                + "(*!*) - Legendary!");
       
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------");
        //get number of cases to open
        System.out.println("How many cases would you like to open?:");
        nOCases = input.nextInt();
        System.out.println("Current avalible cases to open: ");
        System.out.println("1.Bravo -- 2.Vanguard -- 3.Phoenix -- 4.Clutch -- 5.Bloodhound");
       
        while(nOCases > 0){
             
        System.out.println("-----------------------------------------------------------");
        System.out.println("Please pick " + nOCases + " cases!");
        casePick = input.nextInt();
           if(casePick == 1){
               System.out.println("You opened: ");
               Case case1 = new Case();
               weapon = case1.Bravo();
               System.out.println(weapon);
               //print the weapon to the file
               fileOut.append(weapon);
               fileOut.println();
               
           }else if(casePick == 2){
               System.out.println("You opened: ");
               Case case2 = new Case();
                weapon = case2.Vanguard();
               System.out.println(weapon);
               //print the weapon to the file
               fileOut.append(weapon);
               fileOut.println();
               
           }else if(casePick == 3){
               System.out.println("You opened: ");
                Case case3 = new Case();
                weapon = case3.Phoenix();
                System.out.println(weapon);
                //print the weapon to the file
                fileOut.append(weapon);
                fileOut.println();
                
           }else if(casePick == 4){
               System.out.println("You opened: ");
                Case case4 = new Case();
                weapon = case4.Clutch();
                System.out.println(weapon);
                //print the weapon to the file
                fileOut.append(weapon);
                fileOut.println();
                
           }else if(casePick == 5){
               System.out.println("You opened: ");
                Case case5 = new Case();
                weapon = case5.Bloodhound();
                System.out.println(weapon);
                //print the weapon to the file
                fileOut.append(weapon);
                fileOut.println();
                
           }else{
               System.out.println("Please pick a case between numbers 1 - 5!");
    }          
           //subtract 1 from remaining cases
           nOCases--;
           
           
    }     fileOut.close();
        //ask the user if they would like to see the weapons they have opened
        System.out.println("Would you like to see all of the weapons you have ever opened?: 1.Yes 2.No");
        int pick = input.nextInt();
        String lines = "";
        if(pick == 1){
         while((lines = readFile.readLine()) != null){
            System.out.println(lines);
        }
        }else{
            System.out.println("OK. Goodbye!");
        }
     }
  }
