/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author shashi ojhaaaa
 */
public class add extends javax.swing.JFrame {

    /**
     * Creates new form add
     */
    public add() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
           
        //frame desc
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(666, 495));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 130, 50);

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("ADD ROOM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 270, 48);

        jLabel2.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("ROOM No.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 90, 150, 34);

        jLabel3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("CLASS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 140, 100, 34);

        jLabel4.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("TYPE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 190, 80, 38);

        jLabel6.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("STATUS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 300, 110, 34);

        jTextField1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 0, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 90, 220, 31);

        jComboBox1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 0, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "NON AC", "AC DULUX", "AC SEMIDEUUS", "PRESIDENTIAL SUIT" }));
        jComboBox1.setOpaque(false);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(340, 140, 220, 35);

        jComboBox2.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(204, 0, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE", "DOUBLE" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(340, 190, 220, 40);

        jTextField3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 0, 51));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(340, 300, 220, 35);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("ADD ROOM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 380, 190, 43);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 380, 170, 43);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-400, -30, 1080, 580);

        jLabel7.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("FLOOR");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 250, 110, 34);

        jTextField4.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 0, 51));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(340, 250, 220, 35);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MAINFRAME frame2=new MAINFRAME();
        add.this.setVisible(false);
        frame2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    try
        {   String db_url="jdbc:mysql://localhost:3306/hotel";
            Connection conn=DriverManager.getConnection(db_url,"root","root");
            Statement st=conn.createStatement();
            String query;
            query="insert into ad values("+Integer.parseInt(jTextField1.getText())+",'"+jComboBox1.getSelectedItem().toString()+"','"+jComboBox2.getSelectedItem().toString()+"','"+jTextField4.getText()+"')";
            int executeUpdate=st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"ROOM ADDED SUCCESSFULLY");
        }
   catch( SQLException e)
   {JOptionPane.showMessageDialog(null,"ERROR IN SQL");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jTextField1.setText("");
jTextField3.setText("");     
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
