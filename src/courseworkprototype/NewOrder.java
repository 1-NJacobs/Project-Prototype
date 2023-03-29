/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package courseworkprototype;
import java.util.LinkedList;
/**
 *
 * @author natja
 */
public class NewOrder extends javax.swing.JFrame {
    private static   String customername;
    private static   String postcode;
    private static   String housenumber;
    private static   String roadname;
    private static   String phonenumber;
    /**
     * Creates new form NewOrder
     */
    public NewOrder() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        phonenumberfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        roadnamefield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        housenumberfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        postcodefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        customernamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PhoneError = new javax.swing.JLabel();
        AddOrder = new javax.swing.JButton();
        RoadError = new javax.swing.JLabel();
        HouseError = new javax.swing.JLabel();
        PostError = new javax.swing.JLabel();
        CustomerError = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));

        phonenumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberfieldActionPerformed(evt);
            }
        });
        phonenumberfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenumberfieldKeyPressed(evt);
            }
        });

        jLabel6.setText("Phone Number");

        roadnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roadnamefieldActionPerformed(evt);
            }
        });
        roadnamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roadnamefieldKeyPressed(evt);
            }
        });

        jLabel5.setText("Road Name");

        housenumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housenumberfieldActionPerformed(evt);
            }
        });

        jLabel4.setText("House Number");

        postcodefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postcodefieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Postcode");

        customernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customernamefieldActionPerformed(evt);
            }
        });
        customernamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customernamefieldKeyPressed(evt);
            }
        });

        jLabel2.setText("Customer Name");

        jLabel1.setText("Customer Details");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AddOrder.setBackground(new java.awt.Color(204, 204, 204));
        AddOrder.setText("Add Order");
        AddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customernamefield, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(postcodefield)
                                    .addComponent(housenumberfield))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HouseError)
                                    .addComponent(PostError)
                                    .addComponent(CustomerError))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(phonenumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 285, Short.MAX_VALUE)
                                .addComponent(AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PhoneError, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(roadnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RoadError))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PostError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housenumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HouseError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roadnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoadError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(PhoneError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phonenumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrderActionPerformed
        customername = customernamefield.getText();
        postcode = postcodefield.getText();
        housenumber = housenumberfield.getText();
        roadname = roadnamefield.getText();
        phonenumber = phonenumberfield.getText();

        boolean validated = true;

        int postlength = postcode.length();
        int phonelength = phonenumber.length();

        if (postlength > 7 || postlength < 5) {
            validated = false;
            PostError.setText("Error: Postcode must be between 5 and 7 characters");
        }else{
            PostError.setText("");
        }

        if (phonelength != 11) {
            validated = false;
            PhoneError.setText("Error: Phone Number must be 11 digits");
        }else{
            PhoneError.setText("");
        }

        if(customername.isEmpty()) {
            validated = false;
            CustomerError.setText("Error: CustomerName cannot be empty");
        }else{
            CustomerError.setText("");
        }

        if(housenumber.isEmpty()) {
            validated = false;
            HouseError.setText("Error: HouseNumber cannot be empty");
        }else{
            HouseError.setText("");
        }

        if(roadname.isEmpty()) {
            validated = false;
            RoadError.setText("Error: RoadName cannot be empty");
        }else{
            RoadError.setText("");
        }

        if(postcode.isEmpty()) {
            validated = false;
            PostError.setText("Error: PostCode cannot be empty");
        }

        if(phonenumber.isEmpty()) {
            validated = false;
            PhoneError.setText("Error: PhoneNumber cannot be empty");
        }

        if (validated == true){
            OrderMain f2= new  OrderMain();
            f2.setVisible(true);
            this.dispose();
        }

        //OrderMain f2= new  OrderMain();
        //f2.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_AddOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrototypeGUI f2= new  PrototypeGUI();
        f2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customernamefieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_customernamefieldActionPerformed

    private void postcodefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postcodefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postcodefieldActionPerformed

    private void housenumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housenumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_housenumberfieldActionPerformed

    private void roadnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roadnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roadnamefieldActionPerformed

    private void phonenumberfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumberfieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            phonenumberfield.setEditable(false);
            PhoneError.setText("Error: Phone number only accepts numbers");
        }
        else{
            PhoneError.setText("");
            phonenumberfield.setEditable(true);
        }
    }//GEN-LAST:event_phonenumberfieldKeyPressed

    private void phonenumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberfieldActionPerformed

    private void customernamefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customernamefieldKeyPressed
        int c = evt.getKeyChar();
        if(Character.isDigit(c)){
            CustomerError.setText("Error: customer name only accepts characters");
            customernamefield.setEditable(false);
        }
        else{
            customernamefield.setEditable(true);
            CustomerError.setText(""); 
                }
    }//GEN-LAST:event_customernamefieldKeyPressed

    private void roadnamefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roadnamefieldKeyPressed
        int c = evt.getKeyChar();
        if(Character.isDigit(c)){
            RoadError.setText("Error: roadname only accepts characters");
            roadnamefield.setEditable(false);
        }
        else{
            roadnamefield.setEditable(true);
            RoadError.setText(""); 
                }
    }//GEN-LAST:event_roadnamefieldKeyPressed

    public static void AddToDB(Float price){
        DataManipulation.orderDetails(customername, postcode, housenumber, roadname, phonenumber, price);
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
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrder;
    private javax.swing.JLabel CustomerError;
    private javax.swing.JLabel HouseError;
    private javax.swing.JLabel PhoneError;
    private javax.swing.JLabel PostError;
    private javax.swing.JLabel RoadError;
    private javax.swing.JTextField customernamefield;
    private javax.swing.JTextField housenumberfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phonenumberfield;
    private javax.swing.JTextField postcodefield;
    private javax.swing.JTextField roadnamefield;
    // End of variables declaration//GEN-END:variables
}
