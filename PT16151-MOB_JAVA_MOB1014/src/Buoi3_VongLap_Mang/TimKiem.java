/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_VongLap_Mang;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class TimKiem {

    public static void main(String[] args) {
        String[] arrLOP = {"Phuongbd", "Dungna", "Longnt", "Thudq"};
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Mời bạn nhập vào tên học sinh: ");
            String input = scanner.nextLine();
            boolean temp = true;
            for (String x : arrLOP) {
                String phanTuVietThuong = x.toLowerCase();
                if (phanTuVietThuong.equals(input.toLowerCase())) {
                    System.out.println("Bạn này có trong lớp" + x);
                    temp = false;                    
                }
            }
            if (temp) {
                System.out.println("Bạn này không có trong lớp");
            }
        }

    }
}
