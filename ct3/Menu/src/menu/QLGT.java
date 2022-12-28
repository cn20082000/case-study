/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLGT {
    private List<PTGT> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    private int tonTai (String ma) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;   
            }
        }
        return -1;
    }
    private PTGT nhap() {
        String ma, hang;
        int nam;
        double gia;
        String mau;
        String reg = "^VN\\d{3}";
        while (true) {
            System.out.println("nhap ma: ");
            ma = sc.nextLine().toUpperCase();
            if (tonTai(ma) == -1 && ma.matches(reg)){
                break;
            } else {
                System.err.println("nhap lai!!");
            }
        }
        System.out.println("nhap hang: ");
        hang = sc.nextLine();
        System.out.println("nhap nam: ");
        nam = Integer.parseInt(sc.nextLine());
        System.out.println("nhap gia: ");
        gia = Double.parseDouble(sc.nextLine());
        System.out.println("nhap mau: ");
        mau = sc.nextLine();
        return new PTGT(ma, hang, nam, gia, mau);
    }
    
    public void nhapOto() {
        PTGT oto = nhap();
        System.out.println("nhap kieu: ");
        String kieu =  sc.nextLine();
        System.out.println("nhap so cho: ");
        int soCho = Integer.parseInt(sc.nextLine());
        list.add(new Car(oto.getMa(), oto.getHang(), oto.getNam(), oto.getGia(), 
                oto.getMau(), kieu, soCho));
    }

  
    public void nhapXeMay() {
        PTGT xeMay = nhap();
        System.out.println("nhap cong suat: ");
        double congSuat =  Double.parseDouble(sc.nextLine());
        list.add(new Moto(xeMay.getMa(), xeMay.getHang(), xeMay.getNam(), xeMay.getGia(), 
                xeMay.getMau(), congSuat));
    }


    public void xemDS() {
        System.out.println("Danh sach Oto: ");
        for (PTGT i:list)
            if (i instanceof Car) {
                System.out.println(i);
            }
        
        System.out.println("Danh sach Xe may: ");
        for (PTGT i:list)
            if (i instanceof Moto) {
                System.out.println(i);
            }
    }


    public void xoa() {
        System.out.println("nhap ma can xoa: ");
        String ma = sc.nextLine();
        int viTri = tonTai(ma);
        if (viTri == -1) {
            System.out.println("Khong ton tai!");
        } else {
            list.remove(viTri);
            System.out.println("Xoa thanh cong!");
        }
    }


    public void sua() {
        System.out.println("nhap ma can sua: ");
        String ma = sc.nextLine();
        int viTri = tonTai(ma);
        if (viTri == -1) {
            System.out.println("Khong ton tai!");
        } else {
            PTGT ptgt = list.get(viTri);
           System.out.println("nhap hang: ");
           String hang = sc.nextLine();
           System.out.println("nhap nam: ");
           int nam = Integer.parseInt(sc.nextLine());
           System.out.println("nhap gia: ");
           double gia = Double.parseDouble(sc.nextLine());
           System.out.println("nhap mau: ");
           String mau = sc.nextLine();
           ptgt.setHang(hang);
           ptgt.setNam(nam);
           ptgt.setGia(gia);
           ptgt.setMau(mau);
            System.out.println("Sua thanh cong");
        }
    }


    public void timTheoHang() {
        System.out.println("nhap hang can tim: ");
        String hang = sc.nextLine();
        boolean coHang = false;
        for (PTGT i : list) {
            if (i.getHang().toLowerCase().contains(hang)) {
                System.out.println(i);
                coHang = true;
            }
        }
        if (coHang == false) {
            System.out.println("khong tim thay hang");
        }
    }


    public void sapXepTheoNam() {
        Collections.sort(list);
    }
    
}
