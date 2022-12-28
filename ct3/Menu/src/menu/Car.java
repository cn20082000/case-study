/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Admin
 */
public class Car extends PTGT {
    private String kieu;
    private int socho;

    public Car() {
    }

    public Car (String ma, String hang, int nam, double gia, String mau,
            String kieu, int socho) {
        super(ma, hang, nam, gia, mau);
        this.kieu = kieu;
        this.socho = socho;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    @Override
    public double getGia () {
        if ((2022 - super.getNam()) >= 2){
            return super.getGia() * 0.85;
        } else {
            return super.getGia();
        }        
    }
    public String toString() {
        return super.getMa() + "\t" + super.getHang() + "\t" + super.getNam() 
                + "\t" + super.getMau() + "\t" + socho + "\t" + super.getGia();
    }
}
