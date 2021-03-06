/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IOFile;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Call;

/**
 *
 * @author hieub
 */
public class FormCall extends javax.swing.JPanel {

    private DefaultTableModel tm;
    private String file;
    private List<Call> list;
    
    public FormCall() {
        initComponents();
        setSize(900, 700);
        String cols[] = {"Call ID","Channelid","Call type",
            "Convertation"};
        tm=new DefaultTableModel(cols,0);
        jTable.setModel(tm);
        file="src\\controller\\call.txt";
        btSubmit.setEnabled(false);
        
    }
    
    public void findByChannelId(String value) {
        list=IOFile.docra(file);
        int channelId = Integer.parseInt(value);
        tm.setRowCount(0);
        for(Call call:list) {
            if(call.getChannelid() == channelId) {
                tm.addRow(call.toObject());
            }
        }
        if(tm.getRowCount()==0)
            JOptionPane.showMessageDialog(this, "Khong tim thay");
    }
    
    public void findByCallId(String value) {
        list=IOFile.docra(file);
        int callId = Integer.parseInt(value);
        tm.setRowCount(0);
        for(Call call:list) {
            if(call.getCallid() == callId) {
                tm.addRow(call.toObject());
                break;
            }
        }
        if(tm.getRowCount()==0)
            JOptionPane.showMessageDialog(this, "Khong tim thay");
    }
    
    public boolean checkFormatNumber(String value, String text) {
        if(value.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ban chua nhap " + text);
            return false;
        }
        else {
            for(char c : value.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, text + " khong hop le");
                    return false;
                }
            }
        }
        return true;
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btAddCall = new javax.swing.JButton();
        btDeleteCall = new javax.swing.JButton();
        btFindByCallId = new javax.swing.JButton();
        btFindByChanneId = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btDisplay = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Call Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Channelid");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Call Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Convertation");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. G???i v??o", "2. G???i ra" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Conference", "2. Normal Conversation" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        btAddCall.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btAddCall.setText("Add Call");
        btAddCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCallActionPerformed(evt);
            }
        });

        btDeleteCall.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btDeleteCall.setText("Delete call");
        btDeleteCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteCallActionPerformed(evt);
            }
        });

        btFindByCallId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btFindByCallId.setText("Find by callId");
        btFindByCallId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindByCallIdActionPerformed(evt);
            }
        });

        btFindByChanneId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btFindByChanneId.setText("Find by ChanneId");
        btFindByChanneId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindByChanneIdActionPerformed(evt);
            }
        });

        btSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSubmit.setText("Submit");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        btSave.setText("Save File");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btDisplay.setText("Display");
        btDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisplayActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btFindByCallId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btAddCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btFindByChanneId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btDeleteCall, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(jTextField3)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, 0, 179, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDeleteCall)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDisplay))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFindByCallId)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFindByChanneId, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btAddCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCallActionPerformed
        btSubmit.setEnabled(true);
        btDeleteCall.setEnabled(false);
        btFindByCallId.setEnabled(false);
        btFindByChanneId.setEnabled(false);
        btSave.setEnabled(false);
        btDisplay.setEnabled(false);
        File f = new File(file);
        int sCallId = 0;
        int idTable = 0;
        boolean checkData = false;
        if(f.exists()) {
            List<Call> lc = IOFile.docra(file);
            if(lc.size()>0){
                sCallId = lc.get(lc.size()-1).getCallid()+1;
                checkData = true;
            }
        }
        if(tm.getRowCount() > 0) {
            idTable = Integer.parseInt(tm.getValueAt(tm.getRowCount()-1, 0).toString());
            checkData = true;
        }
        if(!checkData) Call.setsCallId(1000);
        sCallId = Integer.max((Integer.max(sCallId, idTable)), Call.sCallId);
        Call.setsCallId(sCallId);
        jTextField1.setText(Call.getsCallId() + "");
        jTextField2.requestFocus();
    }//GEN-LAST:event_btAddCallActionPerformed

    private void btDeleteCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteCallActionPerformed
        int row = jTable.getSelectedRow();
        if(row<0 || row>=jTable.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Chon dong de xoa");
        }
        else {
            tm.removeRow(row);
        }
    }//GEN-LAST:event_btDeleteCallActionPerformed

    private void btFindByCallIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindByCallIdActionPerformed
        if(checkFormatNumber(jTextField3.getText(), "Call Id"))
            findByCallId(jTextField3.getText());
    }//GEN-LAST:event_btFindByCallIdActionPerformed

    private void btFindByChanneIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindByChanneIdActionPerformed
        if(checkFormatNumber(jTextField4.getText(), "Channel Id"))
            findByChannelId(jTextField4.getText());
    }//GEN-LAST:event_btFindByChanneIdActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        Call call = new Call();
        if(checkFormatNumber(jTextField2.getText(), "Channel Id")) {
            int callChanneId = Integer.parseInt(jTextField2.getText());
            int callType = jComboBox1.getSelectedIndex() + 1;
            int conversationType = jComboBox2.getSelectedIndex() + 1;
            boolean check = true;
            for(int i=0; i<tm.getRowCount(); i++) {
                if(conversationType == 2 
                    && Integer.parseInt(tm.getValueAt(i, 1).toString()) == callChanneId
                        && Integer.parseInt(tm.getValueAt(i, 2).toString()) == callType) {
                            check = false;
                            JOptionPane.showMessageDialog(this, "Kenh da co nguoi su dung! Vui long chon kenh khac.");
                            break;
                }
            }
            if(check) {
                call.setChannelid(callChanneId);
                call.setCallType(callType);
                call.setConversationType(jComboBox2.getSelectedIndex() + 1);
                tm.addRow(call.toObject());
            }
        }
        
        btDeleteCall.setEnabled(true);
        btFindByCallId.setEnabled(true);
        btFindByChanneId.setEnabled(true);
        btSave.setEnabled(true);
        btDisplay.setEnabled(true);
        btSubmit.setEnabled(false);
        
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        list = new ArrayList<>();
        int length = tm.getRowCount();
        for(int i=0; i<length; i++) {
            int callId = Integer.parseInt(tm.getValueAt(i, 0).toString());
            int channeId = Integer.parseInt(tm.getValueAt(i, 1).toString());
            int callType = Integer.parseInt(tm.getValueAt(i, 2).toString());
            int conversationType = Integer.parseInt(tm.getValueAt(i, 3).toString());
            Call call = new Call(callId, channeId, callType, conversationType);
            list.add(call);
        }
        IOFile.viet(file, list);
        
    }//GEN-LAST:event_btSaveActionPerformed

    private void btDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisplayActionPerformed
        list=IOFile.docra(file);
        tm.setRowCount(0);
        for(Call i:list)
            tm.addRow(i.toObject());
    }//GEN-LAST:event_btDisplayActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCall;
    private javax.swing.JButton btDeleteCall;
    private javax.swing.JButton btDisplay;
    private javax.swing.JButton btFindByCallId;
    private javax.swing.JButton btFindByChanneId;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
