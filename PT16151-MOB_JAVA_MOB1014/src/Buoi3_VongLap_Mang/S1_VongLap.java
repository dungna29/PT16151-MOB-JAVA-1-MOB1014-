/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_VongLap_Mang;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S1_VongLap {
    //Bài tập xuất bảng cửu chương do người dùng nhập vào
    //Xuất 9 bảng cửu chương ra

    public static void main(String[] args) {
        //Vòng Lặp
        //In ra tên Nguyễn thị thanh phương 10 lần (Cách in ra chưa được học vòng lặp)
//        System.out.println("Nguyễn Thị Thanh Phương");
//        System.out.println("Nguyễn Thị Thanh Phương");
//        System.out.println("Nguyễn Thị Thanh Phương");
//        System.out.println("Nguyễn Thị Thanh Phương");
//        System.out.println("Nguyễn Thị Thanh Phương");
//        System.out.println("Nguyễn Thị Thanh Phương");
//        System.out.println("Nguyễn Thị Thanh Phương");
//        System.out.println("Nguyễn Thị Thanh Phương");
        //Cả 3 vòng lặp đều thực hiện lặp đi lặp lại một hành nào đó mà người lập trình cần thực hiện
        //và có điều kiện để dừng lại vòng lặp
        //1.Vòng lặp While (Nếu để true trong điện kiện while thì đây là vòng lặp vô hạn)
//        int a = 3;
//        while (a < 10) {
//            System.out.println("Số lần in" + a++); //Chức năng bạn cần thực hiện bên trong vòng lặp
//            System.out.println("Nguyễn Thị Thanh Phương");
//        }
//        System.out.println("--------------------Do While");
        //2.Vòng lặp Do While
//        a = 3;
//        do {//Với vòng lặp do while sẽ thực hiện tối thiểu 1 lần chạy
//            System.out.println("Số lần in" + a++);//Chức năng bạn cần thực hiện bên trong vòng lặp
//            System.out.println("Nguyễn Thị Thanh Phương");
//        } while (a < 10);
//         System.out.println("--------------------For");
        //3.Vòng lặp for    

//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Số lần in" + i);//Chức năng bạn cần thực hiện bên trong vòng lặp
//            System.out.println("Nguyễn Thị Thanh Phương");
//        }
        //Bài tập
        //Cho người dùng nhập vào bảng cửu chương họ muốn
        //In ra màn hình mời người dùng nhập số bảng cửu chương
        //Sau đó in ra 
//        Scanner sc = new Scanner(System.in);
//        int input, a, b;
//        System.out.println("Mời người dùng chọn bảng cửu chương muốn in: ");
//        input = sc.nextInt();
//        System.out.printf("Bảng cửu chương Nhân: %d dưới đây", input);
//        a = 1;        
//        while (a <= 10) {            
//            System.out.printf("\n %d * %d = %d ", input, a, (input * a));
//            ++a;            
//        }
//        do {            
//            System.out.printf("\n %d * %d = %d ", input, a, (input * a));
//            ++a;    
//        } while (a <= 10);
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("\n %d * %d = %d ", input, i, (input * i));
//        }
        for (int i = 1; i < 10; i++) {
            System.out.println("\n BẢNG NHÂN " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("\n %d * %d = %d ", i, j, (i * j));
            }
        }

    }

}
