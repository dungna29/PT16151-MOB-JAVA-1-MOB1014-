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
public class S5_StaticBien {
    //Biến static (static variables): khi bạn khai báo một biến là static, thì biến đó được gọi là biến tĩnh, hay biến static.
    //Trong Java, biến có thể được khai báo cùng với từ khóa static, và lúc đó nó có thể được gọi là class variable.
    //Việc cấp phát bộ nhớ cho biến static chỉ xảy ra một lần khi class được nạp vào bộ nhớ
    //Giá trị mặc định khi khai báo và khởi tạo biến static và non-static là giống nhau, cụ thể:
    //    primitive integers (long, int, short, byte): 0
    //    primitive floating points (double, float): 0.0
    //    boolean: false
    //    object references: null
    //Biến static có thể được sử dụng làm thuộc tính chung, để dùng chung dữ liệu cho tất cả objects (hoặc instances ) 
    //của lớp đó và điều đó giúp cho chương trình tiết kiệm bộ nhớ hơn


    private static int tempStatic = 0;//Được khởi tạo 1 lần duy nhất và có thể thay đổi giá trị
   // private int tempStatic = 0;

    void demsoSinhVien() {
        tempStatic++;
        this.inra();
    }

    void inra() {
        System.out.println("Sinh viên số:" + tempStatic);
    }

    public static void main(String[] args) {
        S5_StaticBien st = new S5_StaticBien();
        st.demsoSinhVien();
        S5_StaticBien st2 = new S5_StaticBien();
        st2.demsoSinhVien();
        S5_StaticBien st3 = new S5_StaticBien();
        st3.demsoSinhVien();
    }

}
