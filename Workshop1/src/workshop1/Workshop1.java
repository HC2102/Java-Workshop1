/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;
import java.util.Scanner;
/**
 *
 * @author HE170417
 */
public class Workshop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row,column;
        Scanner obj = new Scanner(System.in);
        int arr[][];
        int i,j;
        System.out.println("Enter number of rows: ");
        row = obj.nextInt();
        System.out.println("Enter the number of columns: ");
        column = obj.nextInt();
        arr =  new int [row][column];
        System.out.println("Enter the matrix");
        for (i = 0; i <row;i++){
            for(j=0;j<column;j++){
                System.out.print("arr["+i+"]["+j+"]=");
                arr[i][j]=obj.nextInt();
            }
        }
        for (i = 0; i <row;i++){
            for(j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum: "+ sum(arr));
        System.out.println("Average: "+ ave(arr));
    }
    public static int sum(int a[][])
    {
        int length = a.length;
        int i,j,k, result =0;       
        for(i=0;i<length;i++)
        {
            j = a[i].length;
            for(k=0;k<j;k++)
            {
                result += a[i][k];
            }
        }
        return result;
    }
    public static double ave(int a[][])
    {
        int length = a.length;
        int i,j=0,k, sum =0;       
        for(i=0;i<length;i++)
        {
            j = a[i].length;
            for(k=0;k<j;k++)
            {
                sum += a[i][k];
            }
        }
        return ((double)sum /(double)(length*j));
    }
    
}
