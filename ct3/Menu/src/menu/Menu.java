/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    public static void main(String[] args) {
        QLGT qlgt = new QLGT();
        while(true){
            System.out.println("MENU");
            System.out.println("1. nhap Oto");
            System.out.println("2. nhap xe may");
            System.out.println("3. xem danh sach");
            System.out.println("4. xoa");
            System.out.println("5. sua");
            System.out.println("6. tim kiem theo hang");
            System.out.println("7. sap xep theo nam");
            System.out.println("0. thoat");
            
            Scanner sc = new Scanner(System.in);
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0: System.out.println("BYE!!!");
                        break;
                case 1: qlgt.nhapOto();
                        break;
                case 2: qlgt.nhapXeMay();
                        break;        
                case 3: qlgt.xemDS();
                        break;  
                case 4: qlgt.xoa();
                        break;    
                case 5: qlgt.sua();
                        break;  
                case 6: qlgt.timTheoHang();
                        break; 
                case 7: qlgt.sapXepTheoNam();
                        break; 
            }
        }
    }
    
}
