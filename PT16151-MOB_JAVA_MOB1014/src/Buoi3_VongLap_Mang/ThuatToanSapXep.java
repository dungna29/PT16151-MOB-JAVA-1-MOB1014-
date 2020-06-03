/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_VongLap_Mang;

import java.util.Arrays;

/**
 *
 * @author LegendNguyen
 */
public class ThuatToanSapXep {

    public static void main(String[] args) {
        int[] arrNumber = {9, 8, 7, 6, 5, 1, 2};
        System.out.println("Mảng chưa sắp xêp");
        for (int x : arrNumber) {
            System.out.print(x + " ");
            System.out.println("");
        }
        Arrays.sort(arrNumber);     

//        for (int i = 0; i < arrNumber.length; i++) {
//            for (int j = i + 1; j < arrNumber.length; j++) {
//                System.out.println("Vị trí thứ: " + i + "Giá trị: " + arrNumber[i]);
//                System.out.println("Vị trí thứ: " + j + "Giá trị: " + arrNumber[j]);
//                int temp = arrNumber[i];
//                if (arrNumber[i] > arrNumber[j]) {
//                    arrNumber[i] = arrNumber[j];
//                    arrNumber[j] = temp;
//                }
//                System.out.println("Mảng sắp xếp lần thứ " + i);
//                for (int x : arrNumber) {
//                    System.out.print(x + " ");
//                }
//                System.out.println("");
//            }
//            System.out.println("Vòng 2");
//            for (int x : arrNumber) {
//                System.out.print(x + " ");
//            }
//            System.out.println("");
//        }
        System.out.println("Mảng đã sắp xếp");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }

    }

}
