
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Register extends javax.swing.JFrame {
    String name ="",fname="",g="",ctg="",email="",mno="",dob="";
    
    
    public Register() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox();
        rb3 = new javax.swing.JRadioButton();
        t2 = new com.toedter.calendar.JDateChooser();
        b2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 73, 174));
        jLabel1.setText("STUDENT REGISTRAION FORM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("NAME                       :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("DATE OF BIRTH         :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("FATHER'S NAME         :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("GENDER                    :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("CATEGORY                :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("E-MAIL                      :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("MOBILE NO.              :");

        t1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        t4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        t5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        buttonGroup1.add(rb1);
        rb1.setText("MALE");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setText("FEMALE");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        b1.setText("REGISTER");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GENERAL", "OBC", "SC", "ST", "PWD" }));

        buttonGroup1.add(rb3);
        rb3.setText("OTHERS");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        b2.setText("BACK");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b1)
                                .addGap(170, 170, 170)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t5)
                                    .addComponent(t3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb1)
                                        .addGap(22, 22, 22)
                                        .addComponent(rb2)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb3))
                                    .addComponent(t1)
                                    .addComponent(t4)
                                    .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(jLabel5)
                    .addComponent(rb3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        name = t1.getText();
        //dob= t2.getDate().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dob = dateFormat.format(t2.getDate());
        fname = t3.getText();
        if(rb1.isSelected())
            g="MALE";
        else if(rb2.isSelected())
            g = "FEMALE";
        else
            g= "OTHERS";
        ctg = cb1.getSelectedItem().toString();
        email = t4.getText();
        mno = t5.getText();
        if(!Pattern.matches("^[A-Z]{1}[a-z]*([ ][A-Z]{1}[a-z]*)*",name)){
           JOptionPane.showMessageDialog(null, "Enter the valid Name");
        }
        if(!Pattern.matches("^[A-Z]{1}[a-z]*([ ][A-Z]{1}[a-z]*)*",fname)){
            JOptionPane.showMessageDialog(null, "Enter the valid Father's Name");
        }
        if(!Pattern.matches("^[A-Za-z0-9]{1,}+@[a-z]{1,}+[.]{1}[a-z]{1,}",email)){
            JOptionPane.showMessageDialog(null, "Enter the valid Email Address");
        }
        else if(!Pattern.matches("[6,7,8,9]{1}[0-9]{9}",mno)){
            JOptionPane.showMessageDialog(null, "Enter the valid Mobile No.");
        }
        else
        {
            String dbURL = "jdbc:mysql://localhost:3306/jeedb";
            String username ="root";
            String password = "Pranay@123";
        
            Connection conn = null;
            Statement state = null;
            ResultSet result;
            String query = "insert into student (name,fname,gender,ctg,email,mno_,dob)values(?,?,?,?,?,?,?)";
        
            try{
            
                Class.forName("com.mysql.cj.jdbc.Driver"); 
            // Getting database access to MySql Server
                conn = DriverManager.getConnection(dbURL, username, password);
            
            // Prepared statement to execute SQL Query
                state = conn.prepareStatement(query);
                PreparedStatement ps= conn.prepareStatement(query);
                ps.setString(1,name);
                ps.setString(2,fname);
                ps.setString(3,g);
                ps.setString(4,ctg);
                ps.setString(5,email);
                ps.setString(6,mno);
                ps.setString(7,dob);
                ps.executeUpdate();
                String q = "select * from student where mno_="+mno;
                state = conn.prepareStatement(q);
            
                result = state.executeQuery(q);
                int id1=0;
                while(result.next()){
                    id1 =  result.getInt("rollno");
                }
                String show="JEE19M";
                show+=Integer.toString(id1);
                JOptionPane.showMessageDialog(this,"Your Rollno and User id is\n"+show,"REGISTERED", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e){
                System.out.print("\nError in connectrion : " + e);
            
            }
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
            Start r = new Start();
            r.setVisible(true);
            r.setSize(550,500);
            setVisible(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            dispose();
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
        
        
        
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextField t1;
    private com.toedter.calendar.JDateChooser t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
