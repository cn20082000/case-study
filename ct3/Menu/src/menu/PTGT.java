/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author Admin
 */
public class PTGT implements Comparable<PTGT> {
    private String ma, hang;
    private int nam;
    private double gia;
    private String mau;

    public PTGT() {
    }

    public PTGT(String ma, String hang, int nam, double gia, String mau) {
        this.ma = ma;
        this.hang = hang;
        this.nam = nam;
        this.gia = gia;
        this.mau = mau;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public int compareTo(PTGT ptgt) {
        return Integer.compare(nam, ptgt.nam);
    } 
}
