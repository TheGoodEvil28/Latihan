/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemogramandasar;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {
        int data[] = {3,5,6,2,1};
        Scanner input = new Scanner(System.in);
        System.out.println("cari angka berapa");
        int y = input.nextInt();
        for (int i = 0; i <data.length; i++) {
            if (y==data[i]) {
                System.out.println("ada");
                
                System.out.println("ditentukan di index ke" + i);
                break;
            }
            System.out.println("scan==>"+data[i] + "bukan data yang di maksud ");
            
        }
//        
//        for (int i = 1; i < 10; i++) {
//            if (i%2==0) {
//                break;
//                
//            }
//            System.out.println(""+i);
//            System.out.println("i="+i);
//            if (i==4) break;{
//            System.out.println("hallo");   
            }
            

//            continue;
//            System.out.println("i ="+ i);
            
        }

//        System.out.println("keluar kur awal");
//    }
//}
//        
//        
//        for (int i = 0; i < 4; i++) 
//        {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("i:" +i +"j:" + j);
//                
//            }
//            System.out.println("------------------");
//        }
//        int i = 0;
////        int j = 0;
////        
//        while (i>4) {
////            System.out.println("halloooo");
////            
//            
////                for (int j = 0; j < 4; j++) 
////                {
////                    System.out.println("i:" +i +"j:" + j);
////                    
////                }
//// 
////            System.out.print("");
////            i++;
//            }
//        do {            
//            System.out.println(i);
//            
//        } while (i<4);
//        
//            }
//            
//
//            
//            
//        }
            
  
//        int x = 0;
//        int y=10;
//        
//        while (x<10) {}
//             System.out.println("xxxxxxxxxxx");
//            while (y>7) {
//               //x=0 y=10 
//                System.out.println(y);
////                //{System.out.println("x :" + x +"Y: "+ y);
//                y--;
//                x++;
//                 System.out.println("x :" + x +"Y: "+ y);
//            }
//            System.out.println("yyyyyyyyyyy");
////            System.out.println(x);
//             //break;
//              
//        }
        
//        System.out.println("-------------------");
//        for (int y = 10; y < 10; y++) {
//            System.out.println(y);
//        }
 

