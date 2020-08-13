/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiHang;
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
public class table_LoaiHang extends connection{
      
    public ArrayList<LoaiHang> getData(){
        
        ArrayList<LoaiHang> arrayLoai = new ArrayList<LoaiHang>();
        
        try(Connection conn = this.connect()){
            
            String sql = "SELECT * FROM LOAI_HANG";
            
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                String maLoai = rs.getString("maLoai");
                String tenLoai = rs.getString("tenLoai");
                
                LoaiHang loai = new LoaiHang(maLoai, tenLoai);
                
                arrayLoai.add(loai);
            }
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        return arrayLoai;
    }  

}
