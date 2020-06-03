/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_DoiTuongClass;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
// Đây được gọi là 1 lớp đối tược bao gồm thuộc tính và hành vi của đối tượng đấy
// Đặt tên class phải danh từ và viết hoa chữ cái đầu hoặc sau nếu có 2 từ trở lên
public class Student {

    //Luôn khai báo thuộc tính ở trên đầu
    //Các thuộc tính cũng phải là danh từ
    String msv;//Thuộc tính của sinh viên
    String name;//Thuộc tính tên của sinh viên
    String sdt;//Thuộc tính số điện thoại của sinh viên
    String email;//Thuộc tính email của sinh viên
    String truong;//Thuộc tính trường học của sinh viên
    double diemGPA;//Thuộc tính điểm của sinh viên   
    
    
    

    //Hành vi chính là các hàm bên trong của đối tượng.
    //Các tên hàm thông thường là động từ
    //Các hàm của đối tượng viết ở cuối trong class
    // Đây được gọi là không trả về
    void inRaManHinh() {
        System.out.println(msv + " " +name + " " +sdt + " " +email + " " +truong + " " +diemGPA);
    }
    
    //Hàm void là hàm không trả về
    void themSinhVien(){
        //Bên trong có thể code phần thêm thông tin add vào các thuộc tính
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã sinh viên vào : ");
        msv = scanner.nextLine();
        System.out.println("Mời bạn nhập tên sinh viên vào : ");
        name = scanner.nextLine();
        ///................
    }

}
