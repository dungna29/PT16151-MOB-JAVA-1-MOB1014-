/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_VongLap_Mang;

import java.io.SyncFailedException;
import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class DemoArrays {
    
    public static void main(String[] args) {
        int input;
        String arrName[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng tên mà bạn muốn nhập: ");
        input = sc.nextInt();
        sc.nextLine();
        arrName = new String[input];
        for (int i = 0; i < input; i++) {
            System.out.println("Mời bạn nhập tên thứ " + (i + 1));
            //Thêm giá trị vào mảng
            arrName[i] = sc.nextLine();
        }
        System.out.println("Danh sách tên bạn đã nhập là: ");
//        for (String x : arrName) {
//            System.out.println(x);
//        }
        for (int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i]);
        }
    }
    
}
