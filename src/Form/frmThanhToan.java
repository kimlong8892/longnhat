/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.table_BanHang;
import DTO.HoaDon;
import DTO.MatHang;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmThanhToan extends javax.swing.JFrame{

    private String manv, mahd = "";
    private int access, price = 0;
    private boolean search = false, insertMaHD = true;
    private ActionEvent event;
    
    private table_BanHang table_ThanhToan;
    
    private ArrayList<MatHang> arrayMatHang;
    private ArrayList<HoaDon> arrayHoaDon;
    
    private DefaultTableModel dftTable;
    
    /**
     * Creates new form frmThanhToan
     */
    public frmThanhToan() {
        initComponents();
        setDefault();
        
    }
    
    //Tạo constructor đưa thông tin mã nhân viên và quyền truy cập vào frmThanhToan
    public frmThanhToan(String manv,int access){
        this.manv = manv;
        this.access = access;
        initComponents();
        getArrayMatHang();
        setDefault();
    }
    
    private void setDefault(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        int widthScreen = (int) screenSize.getWidth();
        int heightScreen = (int) screenSize.getHeight();
        
        setSize(widthScreen,heightScreen);       
        setLocationRelativeTo(null);
        setTitle("Cửa hàng tiện lợi Nhật Long");
        txtMaHang.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThanhToan = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHoaDon = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnThanhToan = new javax.swing.JButton();
        btnClearText = new javax.swing.JButton();
        btnXoaDong = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JLabel();
        txtGia = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1600, 800));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 156), 4));
        jPanel6.setPreferredSize(new java.awt.Dimension(1600, 800));

        tblThanhToan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tblThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ HÀNG", "TÊN HÀNG", "GIÁ", "SỐ LƯỢNG", "THÀNH TIỀN"
            }
        ));
        tblThanhToan.setRowHeight(50);
        jScrollPane2.setViewportView(tblThanhToan);
        tblThanhToan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblThanhToan.getColumnModel().getColumnCount() > 0) {
            tblThanhToan.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblThanhToan.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblThanhToan.getColumnModel().getColumn(3).setResizable(false);
            tblThanhToan.getColumnModel().getColumn(4).setResizable(false);
            tblThanhToan.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 156), 4));
        jPanel7.setPreferredSize(new java.awt.Dimension(1600, 800));

        txtHoaDon.setColumns(20);
        txtHoaDon.setRows(5);
        jScrollPane1.setViewportView(txtHoaDon);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 156), 4));
        jPanel8.setPreferredSize(new java.awt.Dimension(1600, 800));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn2.setText("2");
        jPanel8.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 15, 130, 90));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn3.setText("3");
        jPanel8.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 15, 130, 90));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn1.setText("1");
        jPanel8.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 130, 90));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn4.setText("4");
        jPanel8.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 207, 130, 90));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn5.setText("5");
        jPanel8.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 111, 130, 90));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn6.setText("6");
        jPanel8.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 111, 130, 90));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn8.setText("8");
        jPanel8.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 207, 130, 90));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn9.setText("9");
        jPanel8.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 207, 130, 90));

        btn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn0.setText("0");
        jPanel8.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 303, 130, 53));

        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnEnter.setText("ENTER");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel8.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 303, 265, 53));

        btn10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn10.setText("4");
        jPanel8.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 111, 130, 90));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 156), 4));
        jPanel9.setRequestFocusEnabled(false);

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnThanhToan.setText("RECEIPT");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnClearText.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnClearText.setText("CLEAR");
        btnClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTextActionPerformed(evt);
            }
        });

        btnXoaDong.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnXoaDong.setText("DELETE");
        btnXoaDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDongActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnThoat.setText("RETURN");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(95, 150, 156));
        jSeparator1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setText("Mã hàng:");

        txtMaHang.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        txtMaHang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaHangKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaHangKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel2.setText("Tên hàng:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel3.setText("Số lượng:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel4.setText("Giá:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel5.setText("Thành tiền:");

        txtThanhTien.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N

        txtTenHang.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N

        txtGia.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnXoaDong, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaDong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

        if(tblThanhToan.getRowCount() != 0){
            print();
            String str = "";

            try{

                HoaDon maHD = table_ThanhToan.getDataHoaDon();
                mahd = maHD.getMaHD();

                for(int i = 0; i < tblThanhToan.getRowCount(); i++){
                    String maHang = tblThanhToan.getValueAt(i, 0).toString();
                    int gia = Integer.valueOf(tblThanhToan.getValueAt(i, 2).toString());
                    int soLuong = Integer.valueOf(tblThanhToan.getValueAt(i, 3).toString());
                    int thanhTien = gia * soLuong;

                    str += searchTenHang(maHang)+"\t" +  soLuong +"\t"+ thanhTien +"\n";

                    HoaDon insertCTHD = new HoaDon(mahd,maHang,soLuong,gia);
                    table_ThanhToan.insertCTHoaDon(insertCTHD);
                }
                txtHoaDon.setText(str);



                System.out.println(mahd);
            }
            catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(frmThanhToan.class.getName()).log(Level.SEVERE, null, ex);
            }
            insertMaHD = true;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Chưa nhập sản phẩm vào");
            return;
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed
    //Tạo sự kiện xóa nội dung cho Button clear
    private void btnClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTextActionPerformed
        Clear();
        dftTable.setNumRows(0);
        txtHoaDon.setText("");
    }//GEN-LAST:event_btnClearTextActionPerformed
    //Tạo sự kiện xóa dòng
    private void btnXoaDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDongActionPerformed
        // TODO add your handling code here:
        int index = tblThanhToan.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(rootPane, "Chưa chọn dòng xóa");
            return;
        }
        if(tblThanhToan.getRowCount() <= 1){
            JOptionPane.showMessageDialog(rootPane, "Không thể xóa hết sản phẩm ");
            return;
        }
        else{
            dftTable.removeRow(index);
        }
    }//GEN-LAST:event_btnXoaDongActionPerformed
    //Tạo sự kiện trở về form chức năng cho Button thoát
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        frmFunction func = new frmFunction(access);
        func.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed
    //Tạo sự kiện chỉ hiện chữ số cho textBox mã hàng
    private void txtMaHangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaHangKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) || (c == evt.VK_BACK_SPACE || c == evt.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtMaHangKeyTyped

       //Tạo sự kiện nhấn Enter cho textBox mã hàng
    private void txtMaHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaHangKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            btnEnterActionPerformed(event);
        }
    }//GEN-LAST:event_txtMaHangKeyPressed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        String maHang = txtMaHang.getText();
        String tenHang = searchTenHang(maHang);

        if(txtMaHang.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa nhập mã sản phẩm");

            return;
        }    
        if(!search)
        {
            txtSoLuong.requestFocus();
            if(tenHang.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Mã không tồn tại");
                txtMaHang.setText("");
                txtMaHang.requestFocus();
                return;
            }
            
            txtTenHang.setText(tenHang);
            txtGia.setText(String.valueOf(price));
            search = true;
        }
        else if(search){
            if(txtSoLuong.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Nhập số lượng hàng");
                            return;
            }
            
            int soLuong = Integer.valueOf(txtSoLuong.getText());
            int gia = Integer.valueOf(txtGia.getText());
            int thanhTien = soLuong*gia;
            

        
            dftTable = (DefaultTableModel)tblThanhToan.getModel();
            
            String[] hang = {txtMaHang.getText(),tenHang,txtGia.getText(),txtSoLuong.getText().trim(),String.valueOf(thanhTien)};
            
            arrayHoaDon = new ArrayList<>();

            dftTable.addRow(hang);
                 
            search = false;
            Clear();
            event = evt;
        }
        if(insertMaHD)
        {
            try {
                table_ThanhToan.insertHoaDon(manv);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frmThanhToan.class.getName()).log(Level.SEVERE, null, ex);
            }
            insertMaHD = false;
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void txtSoLuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            btnEnterActionPerformed(event);
            txtMaHang.requestFocus();
        }
    }//GEN-LAST:event_txtSoLuongKeyPressed

    private void txtSoLuongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) || (c == evt.VK_BACK_SPACE || c == evt.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtSoLuongKeyTyped

       //Phương thức lấy mảng dữ liệu Mặt hàng
    private void getArrayMatHang(){
        table_ThanhToan = new table_BanHang();  

        try{
            arrayMatHang = new ArrayList<MatHang>();
            //Đưa dữ liệu lên table
            for(MatHang mh: table_ThanhToan.getDataMatHang()){
                System.out.println(mh.getId());
                arrayMatHang.add(mh);
            }  
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    public void print(){
        for(HoaDon hd: arrayHoaDon){
            System.out.println(arrayHoaDon.size());
            System.out.println(hd.getMaHD() +"\t"+hd.getMaHang()+"\t"+hd.getGia()+"\t"+hd.getSoLuong());
        }
    }
    
    //Phương thức tìm tên hàng
    private String searchTenHang(String maHang){
        
        String tenHang = "";
        for(MatHang mh: arrayMatHang){
            if(maHang.equals(mh.getId())){
                tenHang = mh.getTenHang();
                price = mh.getGia();
                break;
            }
        }
        return tenHang;
        
    }
    
    private void Clear(){
        
        //Xóa nội dung các textBox
        txtMaHang.setText("");
        txtTenHang.setText("");
        txtSoLuong.setText("");
        txtGia.setText("");
        txtThanhTien.setText("");
        //Đưa con trỏ về textBox mã hàng
        txtMaHang.requestFocus();
    }
    
    private void LayDuLieuTable(){
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClearText;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaDong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblThanhToan;
    private javax.swing.JLabel txtGia;
    private javax.swing.JTextArea txtHoaDon;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JLabel txtTenHang;
    private javax.swing.JLabel txtThanhTien;
    // End of variables declaration//GEN-END:variables
}