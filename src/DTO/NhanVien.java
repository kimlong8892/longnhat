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
public class NhanVien {
    
    private String id, matKhau, tenNV, chuc;
    private int quyen;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChuc() {
        return chuc;
    }

    public void setChuc(String chuc) {
        this.chuc = chuc;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public NhanVien() {
    }

    public NhanVien(String id, String matKhau, String tenNV, String chuc) {
        this.id = id;
        this.matKhau = matKhau;
        this.tenNV = tenNV;
        this.chuc = chuc;
    }
    
    public NhanVien(String id, String matKhau, String tenNV, String chuc, int quyen) {
        this.id = id;
        this.matKhau = matKhau;
        this.tenNV = tenNV;
        this.chuc = chuc;
        this.quyen = quyen;
    }
    
}
