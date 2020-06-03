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
public class HamJAVA {
    public static void main(String[] args) {
        HamJAVA hamJAVA = new HamJAVA();
        hamJAVA.HamSo1();
        System.out.println(hamJAVA.getName3(2022));
    }
    
    //Hàm có 2 loại hàm đấy là hàm trả về và hàm không trả về
    
    //Hàm không trả về là hàm void có body code bên trong
    // Tên hàm không nên viết thường hết
    void HamSo1(){//Tạo ra hàm void và phải có tên hàm
        //Bên trong thực hiện một hành động nào đấy
        System.out.println("Đây là hàm số 1");
    }
    
    //Hàm thứ 2 trả về
    //Hàm có kiểu dữ liệu bao gồm các kiểu nguyên thủy - Collection - Mảng
    String getName(){
        String name = "Dũng";
        return name;
    }
    
    String getName2(){       
        return "1234";
    }   
    
    //Hàm trả về kiểu int
    int getNam(){
        return 2020;
    }
    
    //Trong 1 hàm nó sẽ có thể có tham số truyền vào hoặc không
    //Hàm getNam2 không có tham số truyền vào
    int getNam2(){
        return 2020;
    }
    ///getName3(int nam) Hàm này được gọi là hàm có tham số truyền vào
    // Có thể có nhiều tham số truyền vào
    // Tham số truyền vào có thể là các kiểu nguyên thủy - đối tượng - collection - mảng
    int getName3(int nam){
        return nam;
    }
}
