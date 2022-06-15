/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1.pkg2;

/**
 *
 * @author HE170417
 */
import java.util.Scanner;
public class Workshop12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        float num1,num2,result=0;
        String op;
        System.out.println("Input the number 1: ");
        num1 = obj.nextFloat();
        System.out.println("Input the number 2: ");
        num2 = obj.nextFloat();
        System.out.println("Input the operator");
        op = obj.next();
        switch(op)
        {
            case "+":
                    result = num1+num2;
                    break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.println("Error occur");
                break;
        }
        System.out.println(num1 + op+num2+" = "+result);
        
    }
    
}
