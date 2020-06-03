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
public class NhacLaiKienThucMang {

    public static void main(String[] args) {
        int arrYear[];//Khai báo mảng chưa có khởi tạo giá trị
        //Để khởi tạo được mảng arrYear có kích thước là 10 phần tử
        arrYear = new int[10];
        //Để gán phần tử đầu tiên vào mảng arrYear ở trên
        arrYear[0] = 2020;//Gán phần tử vào vị trí đầu tiên
        //Gán phần tử thứ 1 vào mảng arrYear
        arrYear[1] = 2019;
        //Muốn gán lại phần tử đầu tiên bằng năm khác 
        arrYear[0] = 1988;
        arrYear[7] = 1997;
        System.out.println("Phần tử số 1 trong mảng arrYear là: " + arrYear[1]);
        System.out.println("Phần tử số 0 trong mảng arrYear là: " + arrYear[0]);
        System.out.println("Số phần tử có trong mảng arrYear là: " + arrYear.length);
        for (int i = 0; i < arrYear.length; i++) {
            if (arrYear[i]!=0) {//Dùng để không in những phần tử không có giá trị
                System.out.println("Phần tử thứ: " + i + "Có giá trị là: " + arrYear[i]);
            }
        }

        //Khai báo mảng có khởi tạo giá trị ban đầu
        int[] arrYear1 = {2020, 1989, 1988, 2001};
    }

}
