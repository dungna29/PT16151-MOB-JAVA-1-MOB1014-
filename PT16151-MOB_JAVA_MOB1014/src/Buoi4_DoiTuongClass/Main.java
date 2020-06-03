/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_DoiTuongClass;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    public static void main(String[] args) {
        //Đây là cách khai báo 1 đối tượng đầu tiên
        Student student1 = new Student();
        //Gán giá trị cho các thuộc tính của đối tượng
        student1.msv = "Dungna29";
        student1.name = "Dũng";
        student1.email = "Dungna29@fe.edu.vn";
        student1.diemGPA = 8.6;
        student1.truong = "Fpt POLY";
        student1.sdt = "013346698";
        //Để in các thuộc tính của đối tượng ra màn hình
        // Gọi đến tên biến của đối tượng và chấm ra các thuộc tính
//        System.out.println(student1.msv + " " + student1.email);
        student1.inRaManHinh();//Gọi hàm của lớp student để in ra màn hịm

        //Tạo ra đối tượng sinh viên số 2
        //Cần phải khởi tạo thêm 1 đối tượng class SinhVien
        Student student2 = new Student();
        //Gán thông tin cho sinh viên số 2
        student2.msv = "Longnt23";
        student2.name = "Long";
        student2.email = "longnt23@fe.edu.vn";
        student2.diemGPA = 7.6;
        student2.truong = "Fpt POLY";
        student2.sdt = "08564566";
        student2.inRaManHinh();
        
        //Tạo đối tượng sinh viên
        Student student3 = new Student();
        student3.themSinhVien();//Sử dụng hàm thêm của đối tượng để thêm sinh viên vào đối tượng
        student3.inRaManHinh();//Sử dụng hàm trong đối tượng để in ra màn hình
        
    }

}
