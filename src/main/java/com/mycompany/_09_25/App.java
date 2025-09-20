/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._09_25;

import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]A=new int[3][4];
        int [][]B=new int[3][4];
        int [][]C=new int[3][4];   
        int i,j;
        System.out.println("Ingrese valores del Matriz A");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ingrese valores del Matriz B");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("++++++++++++++++++++++++++++");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print("|"+C[i][j]+"|");
             }
            System.out.println("a");
        }
        
    }
    
}

    