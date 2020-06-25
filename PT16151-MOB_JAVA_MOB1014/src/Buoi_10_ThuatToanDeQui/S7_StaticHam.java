/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_10_ThuatToanDeQui;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S7_StaticHam {
    //static methods
    //Phương thức static (static methods): khi bạn khai báo một phương thức là static, thì phương thức đó gọi là phương thức static.
    //                      Một số đặc điểm:
    //Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
    //Một phương thức static có thể được gọi mà không cần tạo khởi tạo (instance) của một lớp.
    //Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.
    //Một phương thức static chỉ có thể gọi một phương thức static khác, không thể gọi được một phương thức non-static.
    //Một phương thức static không thể được sử dụng từ khóa this và super.
    //Người dùng không thể override (đè) phương thức static trong Java, bởi vì kỹ thuật đè (overriding) phương thức được dựa trên quá trình gán (binding) động khi khi chương trình đang chạy (runtime) và những phương thức static  được gán tĩnh trong thời gian biên dịch. Phương thức tĩnh không ràng buộc với thực thể của lớp nên phương thức tĩnh sẽ không thể override (đè).
    //                  Khi nào sử dụng từ khóa static cho một phương thức?
    //Khi phương thức không phụ thuộc vào trạng thái của đối tượng, nghĩa là không cần sử dụng bất kỳ dữ liệu thành viên nào của đối tượng, mọi thứ được truyền như các tham số (parameter).
    //Các phương thức tiện ích là một trường hợp thường được sử dụng nhất trong Java vì chúng có thể được truy cập trực tiếp bằng tên lớp mà không cần tạo bất thể hiện nào. Lớp java.lang.Math là một ví dụ trường hợp sử dụng static method.
   private String subject;
     
    S7_StaticHam (String subject) {
        this.subject = subject;
    }
     
    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("TRƯỜNG = " + S11_ClassTemp.Temp);
    }
     
    public static void thayDoiTen(String website) {
        S11_ClassTemp.Temp = website;
    }
     
    public static void main(String[] args) {       
        S7_StaticHam ex1 = new S7_StaticHam("CHÀO MỪNG ĐẾN VỚI HÀM STATIC");
        ex1.thayDoiTen("ĐẠI HỌC BÁCH KHOA");
        ex1.print();
        System.out.println("----");
        S7_StaticHam.thayDoiTen("ĐẠI HỌC FPT");
        ex1.print();
    }
    
}
