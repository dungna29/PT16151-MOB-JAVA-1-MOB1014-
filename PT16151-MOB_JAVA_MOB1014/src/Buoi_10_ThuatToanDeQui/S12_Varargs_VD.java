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
public class S12_Varargs_VD {
    //Variable Argument – Varargs trong Java cho phép phương thức chấp nhận các đối số zero hoặc multiple . 
    //Điều đó có nghĩa là không hoặc nhiều đối tượng Chuỗi (hoặc một mảng của chúng) 
    //có thể được truyền làm đối số cho phương thức đó.
    //Chỉ có thể chỉ định một đối số varargs cho phương thức.
    //Đối số varargs phải ở vị trí cuối cùng.
    //Tiết kiệm code vì chúng ta không cần phải overload phương thức.
    //return_type method_name(data_type... variableName) {
    // body code
    //}
    //void method(String... a, int... b) {} //Compile time error
    //void method(int... a, String b) {}    //Compile time error
    static void VarargsString(String... mangString) {   
        for (int i = 0; i < mangString.length; i++) {
            System.out.println(mangString[i]);
        }
    }

    public static void main(String[] args) {
        VarargsString();//Không cần truyền tham số vào
        VarargsString("JAVA1","POLY");
        System.out.println("----");
        VarargsString("JAVA1","POLY","HTML");
        System.out.println("----");
        VarargsString(new  String[]{"HTML5","POLY","HTML"});
        //inramanhinh();
    }
    static void inramanhinh(String name1,String nam2){
        
    }

}
