/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_LopTruuTuong;

/**
 *
 * @author LegendNguyen
 */
public interface IService {
    //Trong interface không được phép private các hàm và thuộc tính
    int a = 1;
    //Hàm của bên interface rất giống với abstract class
    //Không được phép hàm có body code
    void them(String name, int a);
    void sua();
    void xoa();
    void timkiem();
}
