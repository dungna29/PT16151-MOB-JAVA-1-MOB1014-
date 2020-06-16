/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_ArrayDoiTuong_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author LegendNguyen
 */
public class S1_ArrayListDoiTuong {

    public static void main(String[] args) {
        //Khởi tạo 1 ArrayList Đối tượng cần làm như sau
        //Phải có 1 đối tượng được tạo sẵn.
        ArrayList<GiaoVien> arrlstGiaoVien = new ArrayList<>();
        //Ở trên là khai báo 1 ArrayList kiểu đối tượng và đối tượng ở đây là kiểu đối tượng GiaoVien do mình tạo ra

        //Thêm 1 đối tượng vào trong ArrayList cần sử dụng hàm add()
        //Hành động ở dưới đây là tạo ra một đới tượng
        GiaoVien giaovien1 = new GiaoVien("dungna29", "Dũng", "0123546", "dungna", "FPT", 80);
        GiaoVien giaovien2 = new GiaoVien("longnt", "long", "0123546", "longnt", "FPT", 80);
        //Thực hiện thêm đối tượng đo vào trong ArrayList
        arrlstGiaoVien.add(giaovien1);
        arrlstGiaoVien.add(giaovien2);

        //Thực hiện lấy một đối tượng trong ArrayList  
        arrlstGiaoVien.get(0).OutputGiaoVien();//Để lấy được đối tượng cần biết vị trí index

        //In nhiều nhiều đối tượng ra màn hình bắt buộc phải dùng vòng lặp
        for (GiaoVien x : arrlstGiaoVien) {
            x.OutputGiaoVien();
        }

        //Muốn biết ArrayList nó có những hàm chức năng nào có thể gọi đến ArrayList và chấm
        //Để xóa 1 đối tượng trong ArrayList thì các bạn sử dụng hàm remove
        System.out.println("-----Xóa index---");
        arrlstGiaoVien.remove(0);
//        for (GiaoVien x : arrlstGiaoVien) {
//            x.OutputGiaoVien();
//        }
        for (int i = 0; i < arrlstGiaoVien.size(); i++) {
            arrlstGiaoVien.get(i).OutputGiaoVien();
        }
        //Kiểm tra 1 danh sách rỗng hay không sử dụng isEmpty()
        arrlstGiaoVien.remove(0);
//        if (arrlstGiaoVien.size() ==0) {
//            System.out.println("Danh sách rỗng");
//        }
        if (arrlstGiaoVien.isEmpty()) {//isEmpty() kiểu trả về là boolean và nếu rỗng thì là true còn false là ngc lại
            System.out.println("Danh sách rỗng");
        }

        //Để xóa toàn bộ ArrayList các bạn dùng hàm clear
        arrlstGiaoVien.clear();//Hàm này sẽ xóa các phần tử có trong ArrayList

        //Hàm sắp xếp sử Collections Sort
        System.out.println("------Collectionns Sort");
        ArrayList<String> arrName = new ArrayList<>();
        arrName.add("Long");
        arrName.add("Thu");
        arrName.add("Dung");
        Collections.sort(arrName);
        //Collections.reverse(arrName);//Collections.reverse dùng để đảo ngược danh sách
        for (String x : arrName) {
            System.out.println(x);
        }

        GiaoVien giaovien5 = new GiaoVien("Long", "Long", "9", "longnt", "FPT", 9);
        GiaoVien giaovien3 = new GiaoVien("Thu", "Thu", "4", "dungna", "FPT", 4);
        GiaoVien giaovien4 = new GiaoVien("Dung", "Dũng", "3", "longnt", "FPT", 3);
        arrlstGiaoVien.add(giaovien5);
        arrlstGiaoVien.add(giaovien3);
        arrlstGiaoVien.add(giaovien4);
        //Sắp xếp 1 đối tượng
        Collections.sort(arrlstGiaoVien);
        Collections.sort(arrlstGiaoVien, new Comparator<GiaoVien>() {
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
                if (o1.getDiemGPA() < o2.getDiemGPA()) {
                    return -1;
                } else if (o1.getDiemGPA() > o2.getDiemGPA()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (GiaoVien x : arrlstGiaoVien) {
            x.OutputGiaoVien();
        }
    }
}
