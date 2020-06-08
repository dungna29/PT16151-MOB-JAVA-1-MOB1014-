/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Ham_Class;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Ham {

    public static void main(String[] args) {
        //Khai báo biến cục bộ khai báo trên cùng của hàm
//        int a,b,c,d,e;
//        outPutScreen1();
//        //Khi gọi có tham số truyền vào phải truyền đúng kiểu dữ liệu
//        outPutScreen2("Tuấn", 2020);
//        System.out.println("");
//        int[] arrNumber = {1, 3, 5, 6};
//        outPutScreen3(arrNumber);

        //HamTraVeKieuChuoi(0) Không in ra được nó chỉ là giá trị
        HamTraVeKieuChuoi(0);
        System.out.println(HamTraVeKieuChuoi(12));
        System.out.println(HamTraVeTinhDienTichCN(2, 2));

        for (int x : HamTraVe1MangArray(false)) {
            System.out.print(x + " ");
        }
        
        HamTraVeMotDoiTuong().OutputGiaoVien();
    }

    //Không được đặt tên hàm giống nhau
    //Hàm số 1 hàm không có kiểu không trả về
    // và hàm này không có tham số truyền vào
    //Nhìn thầy void là biết hàm không có kiểu trả về
    static void outPutScreen1() {
        //Body code
        //Code bên trong này
        System.out.println("Chào mừng bạn LONG học Hàm của JaVa");
    }

    //Hàm số 2 hàm không có kiểu trả về
    // và hàm này là hàm có 2 tham số truyền vào
    // Với có tham số bọn em có thể truyền nhiều biến tùy theo bài toán
    // Biến thì nó củ đủ các kiểu trong java mà có thể chứa dữ liệu
    static void outPutScreen2(String name, int nam) {
        //Body code
        //Code bên trong này
        System.out.printf("Chào mừng bạn %s học Hàm của JaVa năm %d ", name, nam);
    }

    //Tham số của hàm là một mảng
    static void outPutScreen3(int[] arrNumber) {
        for (int x : arrNumber) {
            System.out.println(x);
        }
    }

    //Hàm có trả về kiểu chuỗi
    //Có tham số truyền vào là kiểu số nguyên
    static String HamTraVeKieuChuoi(int gioitinh) {
        if (gioitinh == 0) {
            return "Nữ";
        } else if (gioitinh == 1) {
            return "Nam";
        } else {
            return "Không xác định";
        }
    }

    static double HamTraVeTinhDienTichCN(double canh1, double canh2) {
        double dienTich = 0;
        dienTich = canh1 * canh2;
        return dienTich;
    }

    //Hàm này trả về một mảng
    static int[] HamTraVe1MangArray(boolean temp) {
        int[] a = {1, 5, 6, 7, 87, 9};
        int[] b = {9, 8, 7, 6, 5, 7};
        if (temp) {
            return a;
        } else {
            return b;
        }
    }

    //Hàm trả về một đối tượng
    static GiaoVien HamTraVeMotDoiTuong() {
        Scanner sc = new Scanner(System.in);
        GiaoVien giaoVien = new GiaoVien();
        System.out.println("Mời bạn nhập vào Mã Giáo Viên: ");
        giaoVien.setName(sc.nextLine());
        System.out.println("Mời bạn nhập vào Số điện thoại: ");
        giaoVien.setSdt(sc.nextLine());        
        return giaoVien;
    }
    

}
