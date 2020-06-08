/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Ham_Class;

/**
 *
 * @author LegendNguyen
 */
public class Main {
    //OOP (LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG) (OBJECT ORIENTED PROGRAMMING)
    //Class: Một tập hợp các đối tượng bên trong gọi là Class. 
    //Đối tượng (Object): được xem là một thực thể trong thế giới thực.
    //Object bao gồm: Thuộc tính (Attribute/Properties) và Phương Thức (Hàm) (Method)
    //Attribute: Các thuộc tính của đối tượng

    //***4 Tính chất quan trọng của OOP***
    //Tính trừu tượng (abstraction):
    //Trừu tượng có nghĩ là tổng quát hóa một cái gì đó lên. không cần chú ý chi tiết bên trong.
    //Tính đóng gói (encapsulation):
    //Tính chất này nhằm bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay
    //đổi giá trị các thuốc tính hay có thể truy cập trực tiếp. Việc này do người lập trình
    //viết ra để bảo mật lớp. Tính chất này giúp bảo vệ toàn vẹn đối tượng trong java.        
    //Tính đa hình (polymorphism): 
    //Đối với tính chất đa hình, nó được thể hiện rõ qua việc gọi phương thức của đối tượng.
    //Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau.
    //Overiding và OverLoading
    //Tính kế thừa (inheritance): 
    //Tính kế thừa cho phép ta xây dựng một lớp mới dựa trên các định nghĩa của một lớp đã có. 
    public static void main(String[] args) {
        //Khai báo 1 đối tượng
        GiaoVien giaoVien = new GiaoVien();//new GiaoVien() khởi tạo Contructor - hàm tạo 
        //Gán giá trị cho thuộc tính của lớp giáo viên cần phải sư dụng phương set
        giaoVien.setName("Hoàng");
        giaoVien.setSdt("1234566789");
        System.out.println(giaoVien.getName());//Để lấy được giá trị của thuộc tính trong lớp cần phải sử dụng hàm get
        giaoVien.OutputGiaoVien();
        //Contructor bắt buộc phải giống với tên class
        
        //Khai báo 1 đối tượng và sử dụng contructor có tham số chính là việc khai báo các giá trị cho các thuộc tính của đối tượng
        GiaoVien giaoVien1 =new GiaoVien("", "", "", "", "", 0);
        
    }   
    
}
