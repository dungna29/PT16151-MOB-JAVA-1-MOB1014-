
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_VongLap_Mang;

/**
 *
 * @author LegendNguyen
 */
public class Demo2 {

    public static void main(String[] args) {
//        int i = 1;
//        while (true) {            
//            System.out.println("Chào các bạn học vòng lặp" + i);
//            i++;
//            if (i == 100) {
//                break;
//            }
//        }

        do {
            System.out.println("Chào các bạn học vòng lặp");
            break;
        } while (true);

        int a = 9, b = 10;
        while (a > b) {
            System.out.println("Chào các bạn học vòng lặp");

        }

        do {
            System.out.println("Chào các bạn học vòng lặp");
        } while (a > b);

    }
}
