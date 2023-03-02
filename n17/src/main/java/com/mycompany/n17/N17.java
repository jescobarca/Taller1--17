/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.n17;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class N17 {

    public static void main(String[] args) {
        double r;
        Scanner ent=new Scanner(System.in);
        r=ent.nextDouble();
        System.out.println("Area:"+(Math.PI*Math.pow(r,2)));
        System.out.println("Perimetro:"+(2*Math.PI*r));
    }
}
