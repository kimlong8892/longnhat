/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NCC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class table_NCC extends connection{
    
    public ArrayList<NCC> getData(){
        
        ArrayList<NCC> arrayNCC = new ArrayList<NCC>();
        
        try(Connection conn = this.connect()){
            
            String sql = "SELECT * FROM NCC";
            
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                String maNCC = rs.getString("maNCC");
                String tenNCC = rs.getString("tenNCC");
                String sdt = rs.getString("sdt");
                String diaChi = rs.getString("diaChi");
                
                NCC ncc = new NCC(maNCC, tenNCC, sdt, diaChi);
                
                arrayNCC.add(ncc);
            }
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        return arrayNCC;
    }  
    
    public ArrayList<NCC> getNCC(){
        
        ArrayList<NCC> arrayNCC = new ArrayList<NCC>();
        
        try(Connection conn = this.connect()){
            
            String sql = "SELECT maNCC,tenNCC FROM LOAI_HANG";
            
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                String maNCC = rs.getString("maNCC");
                String tenNCC = rs.getString("tenNCC");

                NCC ncc = new NCC(maNCC,tenNCC);
                
                arrayNCC.add(ncc);
            }
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        return arrayNCC;
    }  
    
    public boolean insertLoaiHang(NCC ncc){
        
        try(Connection conn = this.connect()){
            
            String sql = "INSERT INTO LOAI_HANG (maNCC,tenNCC,sdt,diaChi) VALUES (?,?,?,?)";
            
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1,ncc.getId());
            pstatement.setString(2, ncc.getTenNCC());
            pstatement.setString(3, ncc.getSdt());
            pstatement.setString(4, ncc.getDiaChi());
            
            pstatement.execute();
            return true;
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public boolean updateLoaiHang(NCC ncc){
        
        try(Connection conn = this.connect()){
            
            String sql = "UPDATE LOAI_HANG "
                    + "SET maNCC = ?, tenNCC = ?,sdt = ?,diaChi = ?";
            
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1,ncc.getId());
            pstatement.setString(2, ncc.getTenNCC());
            pstatement.setString(3, ncc.getSdt());
            pstatement.setString(4, ncc.getDiaChi());
            
            pstatement.execute();
            return true;
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
        
    public boolean deleteLoaiHang(NCC ncc){
        
        try(Connection conn = this.connect()){
            
            String sql = "DELETE FROM NCC WHERE maNCC = ?";
            
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1,ncc.getId());
            
            pstatement.executeUpdate();
            
            conn.close();
            return true;
            
        }catch(Exception e){
            e.getMessage();
            return false;
        }
    }
}
