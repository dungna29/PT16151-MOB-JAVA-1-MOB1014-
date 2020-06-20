/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8_XuLyChuoi;

/**
 *
 * @author LegendNguyen
 */
public class S3_DemoXuLyChuoi {

    public static void main(String[] args) {
        String name = "   nguyen Anh dung     ";
        System.out.println(VietHoaChuCaiDauTien(name));

    }

   static String VietHoaChuCaiDauTien(String input) {
        //Bước 1: name mang vào sẽ được xử lý cắt khoảng trắng 2 đầu
        //Viết thường toàn bộ chữ trong chuỗi
        String name = input.trim().toLowerCase();
        //Bước 2: Convert chuỗi thành mảng với điều kiện theo khoảng trắng
        String arrName[] = name.split("\\s+");
        String Ho;
        String Dem;
        String Ten;

        Ho = String.valueOf(arrName[0].charAt(0)).toUpperCase() + arrName[0].substring(1);
        Dem = String.valueOf(arrName[1].charAt(0)).toUpperCase() + arrName[1].substring(1);
        Ten = String.valueOf(arrName[2].charAt(0)).toUpperCase() + arrName[2].substring(1);

        return Ho + " " + Dem + " " + Ten;
    }
}
