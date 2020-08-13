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
public class MatHang {
    
    private String id, tenHang, dvt, maLoai, maNCC;
    private int soLuong, gia;

    public MatHang() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    public MatHang(String maHang, String tenHang,int gia) {
        this.id = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }
    public MatHang(String maHang, String tenHang,int gia, int soluong) {
        this.id = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
        this.soLuong = soluong;
    }

    public MatHang(String id, String tenHang, String dvt, String maLoai, String maNCC, int soLuong, int gia) {
        this.id = id;
        this.tenHang = tenHang;
        this.dvt = dvt;
        this.maLoai = maLoai;
        this.maNCC = maNCC;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    
}
