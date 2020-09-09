/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benja
 */
public class Task2_1 
{
    public static void main(String[] args)
    {
        int max = 9;
        Task2_1 aStar = new Task2_1();
        aStar.printStar(max);
    }
    
    private void printStar(int rowNumber)
    {
        for (int i = 1; i<= rowNumber; i++)
        {
            for(int k = 0; k<(9-i); k++)
            {
                System.out.print(" ");
            }
            for (int k = 0;k<(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
