/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_LamQuenJava_KhaiBaoBien;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Demo {

    public static void main(String[] args) {
        //Biến lúc nào cũng phải khai báo trên đầu
        Scanner sc = new Scanner(System.in);
        String name, monhoc;
        int nam;
        //Có khoảng cách giữa biến và code phía dưới
        System.out.println("Mời bạn nhập tên: ");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập môn học ");
        monhoc = sc.nextLine();
        System.out.println("Mời bạn nhập năm học ");
        nam = sc.nextInt();
        
        //
        System.out.println("Chào bạn " + name + " đến học với môn" + monhoc + " Năm " + nam);
        System.out.printf("Chào bạn %s đến học với môn %s Năm %d", name, monhoc, nam);
    }

}
