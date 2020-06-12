/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Service {

    DongVat dongvat;
    DongVat arrDongVat[];
    Scanner scanner = new Scanner(System.in);

    void inputDongVat() {
        System.out.println("Mời bạn nhập vào số lượng động vật muốn thêm");
        //Mời người dùng nhập vào số lượng động vật để khởi tạo mảng
        int input = scanner.nextInt();
        scanner.nextLine();
        arrDongVat = new DongVat[input];//Khởi tạo mảng với số lượng phần tử nhập vào
        for (int i = 0; i < input; i++) {
            dongvat = new DongVat();
            System.out.println("Mời bạn nhập Tên động vật: ");       
            dongvat.setTenDV(scanner.nextLine());
            System.out.println("Mời bạn nhập Mã động vật: ");
            dongvat.setMaDV(scanner.nextLine());
            System.out.println("Mời bạn nhập Tuổi động vật: ");
            dongvat.setTuoiDV(Integer.parseInt(scanner.nextLine()));
            System.out.println("Mời bạn nhập Giới Tính động vật: ");
            dongvat.setGioiTinh(scanner.nextLine());
            System.out.println("Mời bạn nhập Chủng Loại động vật: ");
            dongvat.setChungLoai(scanner.nextLine());
            System.out.println("Mời bạn nhập Thức Ăn động vật: ");
            dongvat.setThucAn(scanner.nextLine());
            arrDongVat[i] = dongvat;//Sau mỗi lần thêm động vật sẽ add đối tượng động vật vào mảng

        }
    }

    void inRaManHinh() {
        for (DongVat x : arrDongVat) {
            x.inRaDongVat();
        }
    }

}
