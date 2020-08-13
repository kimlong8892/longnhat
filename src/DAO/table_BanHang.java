/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HoaDon;
import DTO.MatHang;
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
public class table_BanHang extends connection{
    
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public ArrayList<MatHang> getDataMatHang() throws SQLException, ClassNotFoundException{
        
       ArrayList<MatHang> arrayHang = new ArrayList<MatHang>();
       
       try(Connection conn = this.connect()){
           
           st = conn.createStatement();
           rs = st.executeQuery("Select maHang,tenHang,gia from MAT_HANG");
           
           while(rs.next()){
               String maHang = rs.getString("maHang");
               String tenHang = rs.getString("tenHang");
               int gia = rs.getInt("gia");

               MatHang mh = new MatHang(maHang, tenHang,gia);
               
               arrayHang.add(mh);
           }
           conn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return arrayHang;
    }
    
   public ArrayList<MatHang> getDataCTBanHang() throws SQLException, ClassNotFoundException{
        
       ArrayList<MatHang> arrayHang = new ArrayList<MatHang>();
       
       try(Connection conn = this.connect()){
           
           st = conn.createStatement();
           rs = st.executeQuery("Select maHang,tenHang,gia,soluong,ngayban from HOA_DON hd INNER JOIN CHITIET_HOADON ct ON hd.MaHD = ct.MaHD");
           
           while(rs.next()){
               String maHang = rs.getString("maHang");
               String tenHang = rs.getString("tenHang");
               int gia = rs.getInt("gia");

               MatHang mh = new MatHang(maHang, tenHang,gia);
               
               arrayHang.add(mh);
           }
           conn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return arrayHang;
    }
    
    public ArrayList<HoaDon> getDataCTHoaDon() throws SQLException, ClassNotFoundException{
        
       ArrayList<HoaDon> arrayHoaDon = new ArrayList<HoaDon>();
       
       try(Connection conn = this.connect()){
           
           st = conn.createStatement();
           rs = st.executeQuery("Select * from CHITIET_HOADON");
           
           while(rs.next()){
               String maHD = rs.getString("maHD");
               String maHang = rs.getString("maHang");
               int soLuong = rs.getInt("soLuong");
               int gia = rs.getInt("thanhTien");

               HoaDon hd = new HoaDon(maHD, maHang, soLuong, gia);
               
               arrayHoaDon.add(hd);
           }
           conn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return arrayHoaDon;
    }
    
    public HoaDon getDataHoaDon() throws SQLException, ClassNotFoundException{
       
       HoaDon hd= null;
       
       try(Connection conn = this.connect()){
           
           st = conn.createStatement();
           rs = st.executeQuery("Select top 1 maHD,maNV from HOA_DON ORDER BY  maHD DESC");
           
           while(rs.next()){
               String maHD = rs.getString("maHD");
               String maNV = rs.getString("maNV");  

               hd = new HoaDon(maHD, maNV);
               
           }
           conn.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return hd;
    }
    
    
    public void insertHoaDon(String maNV) throws SQLException, ClassNotFoundException{
        
        try(Connection conn = this.connect()){
            pst = conn.prepareStatement("Insert into HOA_DON(maNV) values(?)", Statement.RETURN_GENERATED_KEYS);

            pst.setString(1, maNV);

            
            
            pst.executeUpdate();
            //this.insertCTHoaDon(hd, arrayMH);
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
         
        }
        
    }
    
    public void insertCTHoaDon(HoaDon hd) throws SQLException, ClassNotFoundException{
        System.out.println(hd.getMaHD());
        try(Connection conn = this.connect()){
            
                pst = conn.prepareStatement("Insert into CHITIET_HOADON(maHD,maHang,soLuong,gia) values(?,?,?,?)");

                pst.setInt(1, Integer.parseInt(hd.getMaHD()));
                pst.setString(2, hd.getMaHang());
                pst.setInt(3, hd.getSoLuong());
                pst.setInt(4, hd.getGia());
                pst.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    
}
