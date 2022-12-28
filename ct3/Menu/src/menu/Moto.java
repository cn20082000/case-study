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
public class Moto extends PTGT {
    private double congsuat;

    public Moto() {
    }

    public Moto(String ma, String hang, int nam, double gia, String mau,
            double congsuat) {
        super(ma, hang, nam, gia, mau);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
    
    @Override
    public double getGia () {
        if ((2022 - super.getNam()) >= 2){
            return super.getGia() * 0.95;
        } else {
            return super.getGia();
        }        
    }
    public String toString() {
        return super.getMa() + "\t" + super.getHang() + "\t" + super.getNam() 
                +  super.getMau() + "\t" + congsuat + "\t" + super.getGia();
    }
}
