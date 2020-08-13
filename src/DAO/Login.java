/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.connection;
import DTO.NhanVien;

/**
 *
 * @author Admin
 */
public class Login extends connection{
    
    public NhanVien Login(String taikhoan,String matkhau) throws SQLException, ClassNotFoundException
    {
       NhanVien nv = null;
       try(Connection conn = this.connect()){
           Statement stament = conn.createStatement();
           String sql = "SELECT maNV,matKhau,quyen FROM Nhan_Vien WHERE maNV ='" +taikhoan+ "' and matKhau ='" +matkhau+ "'";
           ResultSet rs = stament.executeQuery(sql);
           while(rs.next())
           {
               nv = new NhanVien();
               nv.setId(rs.getString("maNV"));
               nv.setMatKhau(rs.getString("matKhau"));
               nv.setQuyen(rs.getInt("quyen"));
           }
       }
       return nv;
    }
    
}
