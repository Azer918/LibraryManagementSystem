/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.CS151.librarymanagementsystem;
import java.util.Scanner;
/*@Brandon Price CS151
 */
public class LibraryManagementSystem 
{
    public static void main(String[] args) 
    {        int selection=0;
       Scanner scanner = new Scanner(System.in);          
       do             
       {
           printMenuList();           
           selection = scanner.nextInt();
           switch(selection)
           {
           case 1:
               break;
           case 2:
               break;
           case 3:
               break;                       
           case 4:
               break;
           case 5: 
               break;
           case 6:
               Library lib = new Library();
               lib.listBooks();
               break;
           case 7: 
               System.out.println("See you next time!");
               break;
           default:
               System.out.println("Please enter a valid input on the menu!\n\n");
           }      
       }
       while (selection != 7 );     
    }
    private static  void printMenuList()
    {
    System.out.println("\n\n\n Please select what you would like to do today!\n"
                   + "- 1. Add a Book\n" +
                     "- 2. Remove a Book\n" +
                     "- 3. Search for a Book\n" +
                     "- 4. Borrow a Book\n" +
                     "- 5. Return a Book\n" +
                     "- 6. List All Books\n" +
                     "- 7. Exit");    
        
        
        
        
        
    }
}
