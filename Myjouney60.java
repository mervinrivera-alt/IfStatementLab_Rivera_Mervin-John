/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myjouney6.pkg0;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Myjouney60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.");
        System.out.println("Hello User!!");
        System.out.println("How old are you?");
        System.out.print("type here= ");
        int A = input.nextInt();

        if (A < 13) {
            System.out.println("bata paka ayaw sa uyab2x2");
        } else if (A < 19) {
            System.out.println("Pagskwela sa bag-o uyab");
        } else if (A >= 20) {
            System.out.println("You are ready :)");
        }

        System.out.println("2.");
        System.out.println("Hello User!!");
        System.out.println("How is today's temperature (c)?");
        System.out.print("type here= ");
        int B = input.nextInt();

        if (B < 0) {
            System.out.println("katugnaw!!");
        } else if (B <= 25) {
            System.out.println("ahh, yahay");
        } else if (B > 25) {
            System.out.println("KAINIT!!!!!");
        }

        System.out.println("3.");
        System.out.println("Hello User!!");
        System.out.println("What is your Score?");
        System.out.print("type here= ");
        int C = input.nextInt();

        if (C > 90) {
            System.out.println("happy asian parent");
        } else if (C >= 75) {
            System.out.println("init na kaayo ang tsinelas");
        } else if (C < 75) {
            System.out.println("HALA, DAGAN!!!!,NAGLUPAD NA ANG TSINELAS");
        }

        System.out.println("4.");
        System.out.println("Hello User!!");
        System.out.println("Enter The Radius of a Circle");
        System.out.print("type here= ");
        double r = input.nextInt();
        double E = Math.PI * Math.pow(r, 2);
        double F = 2 * Math.PI * r;

        if (r > 0) {
            System.out.println("the Area of a Circle is:" + E);
            System.out.println("the Circumference of the circle is: " + F);
        } else {
            System.out.println("PALDO!!!");
        }

        System.out.println("5.");
        System.out.println("Hello User!!");
        System.out.println("Pls, Enter any integer number");
        System.out.print("type here= ");
        int G = input.nextInt();

        if (G % 2 == 0) {
            System.out.println(G + " happy life");
        } else {
            System.out.println(G + " hahaha,sad boi");
        }

    }
}
