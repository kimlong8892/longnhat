/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String maHD, maHang, maNV;
    private Integer soLuong, gia, thanhtien;
    
        public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }
    
    public HoaDon(String manv){
        this.maNV = manv;
    }
    
    public HoaDon(String mahd,String manv){
        this.maHD = mahd;
        this.maNV = manv;
    }

    public HoaDon(String maHD, String maHang, Integer soLuong, Integer gia) {
        this.maHD = maHD;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    
}
