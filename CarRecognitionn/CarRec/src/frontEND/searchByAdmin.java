 
package frontEND;

import java.awt.Color;

 
public class searchByAdmin extends javax.swing.JFrame {

 
    public searchByAdmin() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registerBtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dashboardbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchByAdmin = new javax.swing.JButton();
        searchBycar = new javax.swing.JButton();
        history = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        name = new javax.swing.JButton();
        id = new javax.swing.JButton();
        username = new javax.swing.JButton();
        allAdmins = new javax.swing.JButton();
        Lable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        phonenumber1 = new javax.swing.JButton();
        textfield = new javax.swing.JTextField();
        phonenumber2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 52, 100));

        registerBtn.setBackground(new java.awt.Color(188, 188, 9));
        registerBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(27, 52, 100));
        registerBtn.setText("تۆمارکردن");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(188, 188, 9));
        searchbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(27, 52, 100));
        searchbtn.setText("گەڕان");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(153, 0, 0));
        backBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("گەڕانەوە");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/لۆگۆی هاتووچۆ (2).jpg"))); // NOI18N

        dashboardbtn.setBackground(new java.awt.Color(51, 102, 0));
        dashboardbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dashboardbtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardbtn.setText("تۆمارگە");
        dashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("سیستەمی ناسینەوەی تابلۆی ئۆتۆمبیل");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(registerBtn)
                .addGap(18, 18, 18)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dashboardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(27, 52, 100));

        searchByAdmin.setBackground(new java.awt.Color(51, 102, 0));
        searchByAdmin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        searchByAdmin.setForeground(new java.awt.Color(255, 255, 255));
        searchByAdmin.setText("گەڕان بەپێی ئەندام");
        searchByAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAdminActionPerformed(evt);
            }
        });

        searchBycar.setBackground(new java.awt.Color(188, 188, 9));
        searchBycar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        searchBycar.setForeground(new java.awt.Color(27, 52, 100));
        searchBycar.setText("گەڕان بەپێی ئۆتۆمبێل");
        searchBycar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBycarActionPerformed(evt);
            }
        });

        history.setBackground(new java.awt.Color(188, 188, 9));
        history.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        history.setForeground(new java.awt.Color(27, 52, 100));
        history.setText("تۆمارگە");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBycar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(searchByAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(searchBycar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 102, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 102, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), null, null));

        name.setBackground(new java.awt.Color(188, 188, 9));
        name.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(27, 52, 100));
        name.setText("ناو");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        id.setBackground(new java.awt.Color(188, 188, 9));
        id.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(27, 52, 100));
        id.setText("ئایدی");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(188, 188, 9));
        username.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(27, 52, 100));
        username.setText("نازناو");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        allAdmins.setBackground(new java.awt.Color(188, 188, 9));
        allAdmins.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        allAdmins.setForeground(new java.awt.Color(27, 52, 100));
        allAdmins.setText("هەمووئەندامەکان");
        allAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allAdminsActionPerformed(evt);
            }
        });

        Lable.setBackground(new java.awt.Color(27, 52, 100));
        Lable.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Lable.setForeground(new java.awt.Color(27, 52, 100));
        Lable.setText("گەڕان بەناو ئەندام بەپێی :");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        phonenumber1.setBackground(new java.awt.Color(188, 188, 9));
        phonenumber1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        phonenumber1.setForeground(new java.awt.Color(27, 52, 100));
        phonenumber1.setText("بەتاڵکردنەوە");
        phonenumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumber1ActionPerformed(evt);
            }
        });

        textfield.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textfield.setText("تۆمار");
        textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldFocusLost(evt);
            }
        });
        textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldActionPerformed(evt);
            }
        });

        phonenumber2.setBackground(new java.awt.Color(188, 188, 9));
        phonenumber2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        phonenumber2.setForeground(new java.awt.Color(27, 52, 100));
        phonenumber2.setText("ژمارە مۆبایل");
        phonenumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumber2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phonenumber1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(allAdmins)
                        .addGap(91, 91, 91)
                        .addComponent(phonenumber2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(366, 366, 366)
                            .addComponent(Lable))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phonenumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
   Rigister r = new Rigister();
        r.setVisible(true);

        this.dispose();        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
  Searching s = new Searching();
        s.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

Dashboard d =new Dashboard();
     d.setVisible(true);
     this.dispose(); 
    }//GEN-LAST:event_backBtnActionPerformed

    private void dashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbtnActionPerformed
 
    }//GEN-LAST:event_dashboardbtnActionPerformed

    private void searchByAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAdminActionPerformed
     
    }//GEN-LAST:event_searchByAdminActionPerformed

    private void searchBycarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBycarActionPerformed
 searchByCar sc=new searchByCar();
    sc.setVisible(true);
       this.dispose();       
    }//GEN-LAST:event_searchBycarActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
      name.setBackground(new Color(51, 102, 0));        
      name.setForeground(Color.WHITE);
      
   allAdmins.setForeground(new Color(51, 102, 0));
   allAdmins.setBackground(new Color(188,188,9));   
   
    username.setForeground(new Color(51, 102, 0));
   username.setBackground(new Color(188,188,9));   
   
   id.setForeground(new Color(51, 102, 0));
   id.setBackground(new Color(188,188,9));  
    }//GEN-LAST:event_nameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
      id.setBackground(new Color(51, 102, 0));        
      id.setForeground(Color.WHITE);
      
   allAdmins.setForeground(new Color(51, 102, 0));
   allAdmins.setBackground(new Color(188,188,9));   
   
    username.setForeground(new Color(51, 102, 0));
   username.setBackground(new Color(188,188,9));   
   
   name.setForeground(new Color(51, 102, 0));
   name.setBackground(new Color(188,188,9));   
    }//GEN-LAST:event_idActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        username.setBackground(new Color(51, 102, 0));        
      username.setForeground(Color.WHITE);
      
   allAdmins.setForeground(new Color(51, 102, 0));
   allAdmins.setBackground(new Color(188,188,9));   
   
    id.setForeground(new Color(51, 102, 0));
   id.setBackground(new Color(188,188,9));   
   
   name.setForeground(new Color(51, 102, 0));
   name.setBackground(new Color(188,188,9));  
    }//GEN-LAST:event_usernameActionPerformed

    private void allAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allAdminsActionPerformed
        allAdmins.setBackground(new Color(51, 102, 0));        
      allAdmins.setForeground(Color.WHITE);
      
     id.setForeground(new Color(51, 102, 0));
     id.setBackground(new Color(188,188,9));   
   
    username.setForeground(new Color(51, 102, 0));
   username.setBackground(new Color(188,188,9));   
   
   name.setForeground(new Color(51, 102, 0));
   name.setBackground(new Color(188,188,9));  
   
    }//GEN-LAST:event_allAdminsActionPerformed

    private void phonenumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumber1ActionPerformed
           
        
        
        
        textfield.setText("تۆمار");     
       
        
        id.setForeground(new Color(51, 102, 0));
        id.setBackground(new Color(188,188,9));   
         
         name.setForeground(new Color(51, 102, 0));
        name.setBackground(new Color(188,188,9));
        
         username.setForeground(new Color(51, 102, 0));
         username.setBackground(new Color(188,188,9));  
         
           allAdmins.setForeground(new Color(51, 102, 0));
          allAdmins.setBackground(new Color(188,188,9));   
    }//GEN-LAST:event_phonenumber1ActionPerformed

    private void textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldFocusGained
        
              if(textfield.getText().equals("تۆمار")){
            textfield.setText(null);
        }
        
    }//GEN-LAST:event_textfieldFocusGained

    private void textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldFocusLost
         if(textfield.getText().equals("")){
            textfield.setText("تۆمار");
        }
    }//GEN-LAST:event_textfieldFocusLost

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
 history h=new  history();
  h.setVisible(true);
  
  this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_historyActionPerformed

    private void phonenumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumber2ActionPerformed

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
            java.util.logging.Logger.getLogger(searchByAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchByAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchByAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchByAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchByAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lable;
    private javax.swing.JButton allAdmins;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton dashboardbtn;
    private javax.swing.JButton history;
    private javax.swing.JButton id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton name;
    private javax.swing.JButton phonenumber1;
    private javax.swing.JButton phonenumber2;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton searchByAdmin;
    private javax.swing.JButton searchBycar;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField textfield;
    private javax.swing.JButton username;
    // End of variables declaration//GEN-END:variables
}
