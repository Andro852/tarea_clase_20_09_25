/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._09_25;

import java.util.Scanner;

/**
 *
 * @author Jonatan y Gabriel
 */
public class ejercicio_2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("+++++++++++++ Calculadora de Matrices +++++++++++++++");
            System.out.println("1. 2C - 5A");
            System.out.println("2. 2A - 3B + 4C");
            System.out.println("3. 7C - B + 2A");
            System.out.println("4. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("Opción 1: 2C - 5A");
                    opcion1();
                    break;
                }
                case 2: {
                    System.out.println("Opción 2: 2A - 3B + 4C");
                    opcion2();
                    break;
                }
                case 3: {
                    System.out.println("Opción 3: 7C - B + 2A");
                    opcion3();
                    break;
                }
                case 4: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("Revisar la opción");
                }
            }
        } while (opc != 4);
    }

    public static void opcion1() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][2];
        int[][] C = new int[3][2];
        int[][] R = new int[3][2];
        int i, j;

        System.out.println("Ingrese valores de la Matriz C:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                C[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de 2C - 5A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                R[i][j] = 2 * C[i][j] - 5 * A[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        }
    }

    public static void opcion2() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][2];
        int[][] B = new int[3][2];
        int[][] C = new int[3][2];
        int[][] R = new int[3][2];
        int i, j;

        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz C:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de 2A - 3B + 4C:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                R[i][j] = 2 * A[i][j] - 3 * B[i][j] + 4 * C[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        }
    }

    public static void opcion3() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][2];
        int[][] B = new int[3][2];
        int[][] C = new int[3][2];
        int[][] R = new int[3][2];
        int i, j;

        System.out.println("Ingrese valores de la Matriz C:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                C[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ingrese valores de la Matriz A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultado de 7C - B + 2A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                R[i][j] = 7 * C[i][j] - B[i][j] + 2 * A[i][j];
                System.out.print("|" + R[i][j] + "|\t");
            }
            System.out.println();
        }
    }
}
         

