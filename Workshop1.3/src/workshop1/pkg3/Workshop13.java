/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1.pkg3;

/**
 *
 * @author HE170417
 */
import java.util.Scanner;
public class Workshop13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String student[] = new String[10];
        int i;
        for(i =0;i<10;i++)
        {
            System.out.println("Please enter the "+(i+1)+" Student:");
            student[i]= obj.nextLine();
            student[i]= student[i].toUpperCase();
        }
        for(i =0; i <10; i++)
        {
            System.out.println(student[i]);
        }
        
    }
    
}
