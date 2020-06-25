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
public class S9_FINAL{

    //Trong Java, biến có thể được khai báo cùng với từ khóa static, 
    //và lúc đó bạn sẽ không thể thay đổi giá trị của biến final (nó được gọi là hằng số).
    public final String TEN_TRUONG = "FPT POLY";
    public final String TEN_TRUONG2;

    public S9_FINAL() {
         TEN_TRUONG2 = "POLY2";
    }
   
    public static final String TEN_MON = "JAVA1";
    //Một biến static final mà không được khởi tạo tại thời điểm khai báo thì đó là 
    //biến static final trống. Nó chỉ có thể được khởi tạo trong khối static và một khi nó đã được khởi tạo thì không thể bị thay đổi.
    public static final String TEN_GIAO_VIEN;
    static {
        TEN_GIAO_VIEN ="DUNGNA";
    }

    public static void main(String[] args) {
        S10_ClassFinal cf = new S10_ClassFinal();
        cf.temp = "2";
       
        
        
    }

}
