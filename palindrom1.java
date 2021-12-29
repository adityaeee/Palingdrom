package test;

import java.util.Scanner;

public class palindrom1 {
    
    public static boolean cekpalingdrom(String kata){
        return cekpalingdrom(kata, 0, kata.length()-1);   
    }
    
   public static boolean cekpalingdrom(String kata, int low, int high){
        if(high <= low)
            return true;
        
        else if(kata.charAt(low)!=kata.charAt(high))
            return false;
        
        else
            return cekpalingdrom(kata, low+1, high-1);
  }

    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String kata1;
        
        System.out.print("MAsukkan kata : ");
        kata1 = input.nextLine();
        System.out.print("kata '" +kata1+ "' = " );
        
        
        if(cekpalingdrom(kata1)){
            System.out.println("PALINDDROM");
        }else{
            System.out.println("Bukan PALINDROM");
        }
    }
}