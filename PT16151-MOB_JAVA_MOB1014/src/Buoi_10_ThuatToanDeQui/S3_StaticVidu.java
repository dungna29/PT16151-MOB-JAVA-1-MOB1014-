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
public class S3_StaticVidu {
    private static String tempStatic= "Đây là biến Static";
    //khối static
    static {
        System.out.println("Đây là khối static 1");
    }
    static {
        System.out.println("Đây là khối static 2");
    }
    
    public S3_StaticVidu() {
        System.out.println("Đã vào hàm main");
        System.out.println("Đây là " + tempStatic);
    }
    public static void main(String[] args) {
        S3_StaticVidu st = new S3_StaticVidu();
    }
    
}
