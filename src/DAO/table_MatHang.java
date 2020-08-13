/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiHang;
import DTO.MatHang;
import DTO.NCC;
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
public class table_MatHang extends connection{
    
    PreparedStatement pst;
    Statement st;
    ResultSet rs;  
    
    public ArrayList<MatHang> getData() throws SQLException, ClassNotFoundException{
        
       ArrayList<MatHang> arrayMatHang = new ArrayList<MatHang>();
       
       try(Connection conn = this.connect()){
           
           st = conn.createStatement();
           rs = st.executeQuery("Select * from MAT_HANG");
           
           while(rs.next()){
               String maHang = rs.getString("maHang");
               String tenHang = rs.getString("tenHang");
               int soLuong = rs.getInt("soLuong");
               String dvt = rs.getString("dvt");
               int gia = rs.getInt("gia");
               String maLoai = rs.getString("maLoai");
               String maNCC = rs.getString("maNCC");
               
               MatHang mh = new MatHang(maHang, tenHang, dvt, maLoai, maNCC, soLuong, gia);
               
               arrayMatHang.add(mh);
               
           }
                          conn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return arrayMatHang;
    }
    
    public ArrayList<MatHang> searchData(String dk) throws SQLException, ClassNotFoundException{
        
       ArrayList<MatHang> arrayMatHang = new ArrayList<MatHang>();
       
       try(Connection conn = this.connect()){
           
           st = conn.createStatement();
           rs = st.executeQuery("Select * from MAT_HANG where " + dk );
           
           while(rs.next()){
               String maHang = rs.getString("maHang");
               String tenHang = rs.getString("tenHang");
               int soLuong = rs.getInt("soLuong");
               String dvt = rs.getString("dvt");
               int gia = rs.getInt("gia");
               String maLoai = rs.getString("maLoai");
               String maNCC = rs.getString("maNCC");
               
               MatHang mh = new MatHang(maHang, tenHang, dvt, maLoai, maNCC, soLuong, gia);
               
               arrayMatHang.add(mh);
               
           }
           conn.close();
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return arrayMatHang;
    }
    
    public boolean insertMatHang(MatHang mh) throws SQLException, ClassNotFoundException{
        
        try(Connection conn = this.connect()){
            pst = conn.prepareStatement("Insert into MAT_HANG(maHang,tenHang,soLuong,DVT,gia,maLoai,maNCC) values(?,?,?,?,?,?,?)");

            pst.setString(1, mh.getId());
            pst.setString(2, mh.getTenHang());
            pst.setInt(3, mh.getSoLuong());
            pst.setString(4, mh.getDvt());
            pst.setInt(5, mh.getGia());
            System.out.println(mh.getMaNCC());
            pst.setString(6, mh.getMaLoai());
            pst.setString(7, mh.getMaNCC());

            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
    }
    
    public boolean deletetMatHang(String mh) throws SQLException, ClassNotFoundException{
        
        try(Connection conn = this.connect()){
            pst = conn.prepareStatement("Delete from MAT_HANG where maHang = ?");

            pst.setString(1, mh);

            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
    }
        
    public boolean updateMatHang(MatHang mh) throws SQLException, ClassNotFoundException{
        
        try(Connection conn = this.connect()){
            pst = conn.prepareStatement("update MAT_HANG Set tenHang = ?, soLuong = ?, dvt = ?, gia = ?, maLoai = ?, maNCC = ? where maHang = ?");

            pst.setString(7, mh.getId());
            pst.setString(1, mh.getTenHang());
            pst.setInt(2, mh.getSoLuong());
            pst.setString(3, mh.getDvt());
            pst.setInt(4, mh.getGia());
            System.out.println(mh.getMaNCC());
            pst.setString(5, mh.getMaLoai());
            pst.setString(6, mh.getMaNCC());

            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
    }
}
