/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_ArrayDoiTuong_ArrayList;

/**
 *
 * @author LegendNguyen
 */
public class ArrayDoiTuong {

    public static void main(String[] args) {
        GiaoVien[] arrGiaoVien = new GiaoVien[100];//Khai báo 1 mảng đối tượng giáo viên có khởi tạo kích thước à 5 phần tử
        //Cách số 1:
        // Gán phần tử đầu tiên vào mảng đối tượng và phần tử ở đây chính là 1 đối tượng
        arrGiaoVien[0] = new GiaoVien("Dungna", "Dung", "", "", "", 0);

        //Cách số 2:
        //Khởi tạo 1 đối tượng từ lớp Giáo Viên
        GiaoVien GiaoVien1 = new GiaoVien("Longnt", "Long", "", "", "", 0);
        //Gán phần tử đối tượng số 1 bằng với 1 lớp GiaoVien
        //Bắt buộc phải gán đúng kiểu đối tượng
        arrGiaoVien[1] = GiaoVien1;
        //Cách để in 1 phần tử là đối tượng ở trong mảng phải chấm phương thức ra
        //System.out.println(arrGiaoVien[1].getName() + arrGiaoVien[1].getMgv());

//        for (GiaoVien x : arrGiaoVien) {
//            x.OutputGiaoVien();
//        }
        for (int i = 0; i < arrGiaoVien.length; i++) {
            if (arrGiaoVien[i] != null) {
                arrGiaoVien[i].OutputGiaoVien();
            }
        }

    }
}
