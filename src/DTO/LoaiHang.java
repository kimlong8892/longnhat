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
public class LoaiHang {
    
    private String id,tenLoai;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenHang) {
        this.tenLoai = tenHang;
    }

    public LoaiHang() {
    }

    public LoaiHang(String id, String tenLoai) {
        this.id = id;
        this.tenLoai = tenLoai;
    }
    
}
