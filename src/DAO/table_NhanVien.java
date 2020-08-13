/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class table_NhanVien extends connection{
    
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public ArrayList<NhanVien> getData() throws SQLException, ClassNotFoundException{
        
       ArrayList<NhanVien> arrayMatHang = new ArrayList<NhanVien>();
       
       try(Connection conn = this.connect()){
           
           st = conn.createStatement();
           rs = st.executeQuery("Select * from Nhan_Vien");
           
           while(rs.next()){
               String maNV = rs.getString("maNV");
               String tenNV = rs.getString("tenNV");
               String matKhau = rs.getString("matKhau");
               String chuc = rs.getString("chuc");
    
               NhanVien mh = new NhanVien(maNV, matKhau,tenNV, chuc);
               
               arrayMatHang.add(mh);
               
           }
                          conn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return arrayMatHang;
    }
    public boolean insertMatHang(NhanVien nv) throws SQLException, ClassNotFoundException{
        
        try(Connection conn = this.connect()){
            pst = conn.prepareStatement("Insert into NHAN_VIEN(maNV,tenNV,matKhau,chuc) values(?,?,?,?)");

            pst.setString(1, nv.getId());
            pst.setString(2, nv.getTenNV());
            pst.setString(3, nv.getMatKhau());
            pst.setString(4, nv.getChuc());

            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
    }
    
    public boolean deletetMatHang(String maNV) throws SQLException, ClassNotFoundException{
        
        try(Connection conn = this.connect()){
            pst = conn.prepareStatement("Delete from NHAN_VIEN where maNV = ?");

            pst.setString(1, maNV);

            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
    }
        
    public boolean updateMatHang(NhanVien nv) throws SQLException, ClassNotFoundException{
        
        try(Connection conn = this.connect()){
            pst = conn.prepareStatement("update NHAN_VIEN Set tenNV = ?, matKhau = ?, chuc = ? where maNV = ?");

            pst.setString(4, nv.getId());
            pst.setString(1, nv.getTenNV());
            pst.setString(3, nv.getChuc());
            pst.setString(2, nv.getMatKhau());

            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
    }
}
