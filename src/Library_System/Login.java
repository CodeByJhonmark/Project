package Library_System;

// @author payno

import java.awt.Color;


public class Login extends javax.swing.JFrame {    

    public Login(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        LoginLogo = new javax.swing.JLabel();
        Usernname_Label = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password_Label = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Forgot_Password = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        google = new javax.swing.JButton();
        facebook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setPreferredSize(new java.awt.Dimension(700, 450));
        Main.setLayout(null);

        Left.setBackground(new java.awt.Color(255, 165, 0));
        Left.setPreferredSize(new java.awt.Dimension(350, 450));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main.add(Left);
        Left.setBounds(350, 0, 350, 450);

        Right.setBackground(new java.awt.Color(255, 255, 255));

        LoginLogo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        LoginLogo.setForeground(new java.awt.Color(255, 0, 0));
        LoginLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLogo.setText("Login");

        Usernname_Label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Usernname_Label.setLabelFor(Username);
        Usernname_Label.setText("Username");
        Usernname_Label.setDisplayedMnemonicIndex(3);

        Username.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Username.setMargin(new java.awt.Insets(0, 2, 2, 2));

        Password_Label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Password_Label.setText("Password");

        Password.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Password.setPreferredSize(new java.awt.Dimension(6, 20));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Forgot_Password.setBackground(new java.awt.Color(255, 255, 255));
        Forgot_Password.setForeground(new java.awt.Color(0, 0, 204));
        Forgot_Password.setText("Forgot Password?");
        Forgot_Password.setAlignmentY(0.0F);
        Forgot_Password.setAutoscrolls(true);
        Forgot_Password.setBorder(null);
        Forgot_Password.setPreferredSize(new java.awt.Dimension(140, 20));
        Forgot_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Forgot_PasswordMouseEntered(evt);
            }
        });
        Forgot_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Forgot_PasswordActionPerformed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(255, 0, 0));
        Login.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        Login.setToolTipText("");
        Login.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login.setDoubleBuffered(true);
        Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Login.setPreferredSize(new java.awt.Dimension(120, 35));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("or Login with social platforms");

        google.setBackground(new java.awt.Color(255, 255, 255));
        google.setForeground(new java.awt.Color(255, 255, 255));
        google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/g.png"))); // NOI18N
        google.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        google.setPreferredSize(new java.awt.Dimension(30, 30));
        google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googleActionPerformed(evt);
            }
        });

        facebook.setBackground(new java.awt.Color(255, 255, 255));
        facebook.setForeground(new java.awt.Color(255, 255, 255));
        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fb (1).png"))); // NOI18N
        facebook.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        facebook.setPreferredSize(new java.awt.Dimension(30, 30));
        facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(LoginLogo))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_Label)
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Username)
                                .addComponent(Usernname_Label)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Forgot_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(google, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LoginLogo)
                .addGap(28, 28, 28)
                .addComponent(Usernname_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password_Label)
                .addGap(5, 5, 5)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Forgot_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(google, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Main.add(Right);
        Right.setBounds(0, 0, 350, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void Forgot_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Forgot_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Forgot_PasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_googleActionPerformed

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        Login.setBackground(Color.orange);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        Login.setBackground(Color.red);
    }//GEN-LAST:event_LoginMouseExited

    private void Forgot_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Forgot_PasswordMouseEntered
     
    }//GEN-LAST:event_Forgot_PasswordMouseEntered

    private void facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facebookActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Forgot_Password;
    private javax.swing.JPanel Left;
    private javax.swing.JButton Login;
    private javax.swing.JLabel LoginLogo;
    private javax.swing.JPanel Main;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Usernname_Label;
    private javax.swing.JButton facebook;
    private javax.swing.JButton google;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
