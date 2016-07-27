/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds1.design;

import java.util.Scanner;

/**
 *
 * @author patel
 */
public class DS1Design {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        String str,output;
        Scanner sc=new Scanner(System.in);
        //check number is prime or not
        checkPrime();
        //parse special characters from string
        System.out.println("Enter string :");
        str=sc.nextLine();
        output=checkSpecialCharacter(str);
        System.out.println("Originals String : "+str+"\nSpecial Characters in string : "+output);
        
    }

    private static void checkPrime() {
        int number;
        int count=0;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter Number :");
       //get number from user
       number=in.nextInt();
       //check number is positive or nor
       if(number>0){
       for(int i=1;i<=number;i++){
           if(number%i==0){
               count++;
           }
       }
       //count is 2 that means number is prime
       if(count==2)
       {
           System.out.println("Number "+number+" is prime");
       }
       else{
           System.out.println("Number "+number+" is not prime");
       }}
       else{
           System.out.println("Enter Positive Number");
           //call function again
           checkPrime();
       }
       
       
    }

    private static String checkSpecialCharacter(String str) {
        String output="";
        for(int i=0;i<str.length();i++){
            //check if is number or letter
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)))
            {
            output+=str.charAt(i);
            }
        }
        return output;
    }
    
}
