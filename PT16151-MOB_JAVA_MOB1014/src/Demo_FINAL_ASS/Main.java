/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_FINAL_ASS;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        do {
            Menu();
            System.out.println("Mời bạn chọn chức năng: ");
            String input = sc.nextLine();
            switch (Integer.parseInt(input)) {
                case 1:
                    service.themSinhVien();
                    break;
                case 2:
                    service.xuatDsSinhVien();
                    break;
                case 3:
                    service.suaSinhVien();
                    break;
                case 4:
                    service.xoaSinhVien();
                    break;
                case 5:
                    service.timKiemSinhVien();
                    break;
                case 6:
                    service.sortSinhVien();
                    break;            
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không tồn tại");
                    break;
            }
        } while (true);
    }

    static void Menu() {
        System.out.println("****** Chương Trình Quản Lý SV                                  ******");
        System.out.println("****** 1.Thêm Mới Sinh Viên                                     ******");
        System.out.println("****** 2.Danh Sách Sinh Viên                                    ******");
        System.out.println("****** 3.Chỉnh Sửa Sinh Viên Theo Mã SV                         ******");
        System.out.println("****** 4.Xóa Sinh Viên Theo Mã SV                               ******");
        System.out.println("****** 5.Tìm Kiếm Viên Theo Mã                                  ******");
        System.out.println("****** 6.Sắp Xếp Sinh Viên Theo Tên                             ******");
        System.out.println("****** 7.Thoát                                                  ******");
    }
}
