/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bkpm3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BKPM3 {

    public static void main(String[] args) {
//        Scanner bilangan=new Scanner(System.in);
//        int angka;
//        
//        System.out.println("Masukkan Angka =");
//        angka = bilangan.nextInt();
//        if (angka%2==0){
//            System.out.println("Angka Ini Bilangan Genap ");
//        }
//        else{
//            System.out.println("Angka Ini Bilangan Ganjil ");
//        }
                
                Scanner perulangan = new Scanner(System.in);
                
                int angka,b;
                
                System.out.println("=====PROGRAM LOOP DENGAN BREAK=======");
                b=0;
                do
                {
                    System.out.print("Masukkan bilangan = ");
                    angka = perulangan.nextInt();                   
                    b += angka;
                    if(b>0) break;
                }
                while(true);
                System.out.printf("Angka berhenti pada angka : %d \n ",b);
    }
}
