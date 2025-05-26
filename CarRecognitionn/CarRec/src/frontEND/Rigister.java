
package frontEND;

import backendcarregon.cars.Cars;
public class Rigister extends javax.swing.JFrame {

    
    public Rigister() {
        initComponents();
        buttonGroup1.add(nyaty);
        buttonGroup1.add(hayaty);
        buttonGroup2.add(yasay);
        buttonGroup2.add(nayasay);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        registerBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dashboardBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Create = new javax.swing.JButton();
        quOne = new javax.swing.JLabel();
        nayasay = new javax.swing.JRadioButton();
        quOne1 = new javax.swing.JLabel();
        nyaty = new javax.swing.JRadioButton();
        quOne3 = new javax.swing.JLabel();
        carName = new javax.swing.JTextField();
        quOne4 = new javax.swing.JLabel();
        carType = new javax.swing.JComboBox<>();
        quOne5 = new javax.swing.JLabel();
        carModel = new javax.swing.JTextField();
        quOne6 = new javax.swing.JLabel();
        quOne7 = new javax.swing.JLabel();
        plateNumber = new javax.swing.JTextField();
        quOne8 = new javax.swing.JLabel();
        yearlyNumber = new javax.swing.JTextField();
        Color = new javax.swing.JComboBox<>();
        owner = new javax.swing.JTextField();
        quOne9 = new javax.swing.JLabel();
        yasay = new javax.swing.JRadioButton();
        hayaty = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        welMess1 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(27, 52, 100));

        registerBtn.setBackground(new java.awt.Color(51, 102, 0));
        registerBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("تۆمارکردن");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(188, 188, 9));
        searchBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(27, 52, 100));
        searchBtn.setText("گەڕان");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(153, 0, 0));
        backbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("گەڕانەوە");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("سیستەمی ناسینەوەی تابلۆی ئۆتۆمبیل");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/لۆگۆی هاتووچۆ (2).jpg"))); // NOI18N

        dashboardBtn.setBackground(new java.awt.Color(188, 188, 9));
        dashboardBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(27, 52, 100));
        dashboardBtn.setText("تۆمارگە");
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(registerBtn)
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(26, 26, 26)
                .addComponent(dashboardBtn)
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(27, 52, 100));

        Create.setBackground(new java.awt.Color(0, 102, 0));
        Create.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        Create.setText("تۆمارکردن");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        quOne.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne.setForeground(new java.awt.Color(255, 255, 255));
        quOne.setText("تۆمارکردنی ئۆتۆمبێل بەشێوەی یاسایی");

        nayasay.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nayasay.setForeground(new java.awt.Color(255, 255, 255));
        nayasay.setText("نایاسایی");
        nayasay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nayasayActionPerformed(evt);
            }
        });

        quOne1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne1.setForeground(new java.awt.Color(255, 255, 255));
        quOne1.setText("گرێبەستی شەریکە");

        nyaty.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nyaty.setForeground(new java.awt.Color(255, 255, 255));
        nyaty.setText("نییەتی");
        nyaty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyatyActionPerformed(evt);
            }
        });

        quOne3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne3.setForeground(new java.awt.Color(255, 255, 255));
        quOne3.setText("ناوی ئۆتۆمبێل");

        carName.setBackground(new java.awt.Color(241, 237, 230));
        carName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        carName.setText("تۆمار");
        carName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                carNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                carNameFocusLost(evt);
            }
        });

        quOne4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne4.setForeground(new java.awt.Color(255, 255, 255));
        quOne4.setText("جۆری ئۆتۆمبێل");

        carType.setBackground(new java.awt.Color(241, 237, 230));
        carType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "نزم", "بەرز", "پیکاپ", "تەنکەر", " " }));
        carType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carTypeActionPerformed(evt);
            }
        });

        quOne5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne5.setForeground(new java.awt.Color(255, 255, 255));
        quOne5.setText("مۆدێلی ئۆتۆمبێل");

        carModel.setBackground(new java.awt.Color(241, 237, 230));
        carModel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        carModel.setText("تۆمار");
        carModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                carModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                carModelFocusLost(evt);
            }
        });
        carModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carModelActionPerformed(evt);
            }
        });

        quOne6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne6.setForeground(new java.awt.Color(255, 255, 255));
        quOne6.setText("ڕەنگ");

        quOne7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne7.setForeground(new java.awt.Color(255, 255, 255));
        quOne7.setText("تابلۆی ئۆتۆمبێل");

        plateNumber.setBackground(new java.awt.Color(241, 237, 230));
        plateNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        plateNumber.setText("تۆمار");
        plateNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plateNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plateNumberFocusLost(evt);
            }
        });
        plateNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateNumberActionPerformed(evt);
            }
        });

        quOne8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne8.setForeground(new java.awt.Color(255, 255, 255));
        quOne8.setText("ژمارەی ساڵانە");

        yearlyNumber.setBackground(new java.awt.Color(241, 237, 230));
        yearlyNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        yearlyNumber.setText("تۆمار");
        yearlyNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearlyNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearlyNumberFocusLost(evt);
            }
        });
        yearlyNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyNumberActionPerformed(evt);
            }
        });

        Color.setBackground(new java.awt.Color(241, 237, 230));
        Color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "سپی", "ڕەش", "ڕەساسی", "سوور", " " }));
        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });

        owner.setBackground(new java.awt.Color(241, 237, 230));
        owner.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        owner.setText("تۆمار");
        owner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ownerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ownerFocusLost(evt);
            }
        });
        owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerActionPerformed(evt);
            }
        });

        quOne9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quOne9.setForeground(new java.awt.Color(255, 255, 255));
        quOne9.setText("خاوەنی ئۆتۆمبێل");

        yasay.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        yasay.setForeground(new java.awt.Color(255, 255, 255));
        yasay.setText("یاسایی");
        yasay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yasayActionPerformed(evt);
            }
        });

        hayaty.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        hayaty.setForeground(new java.awt.Color(255, 255, 255));
        hayaty.setText("هەیەتی");
        hayaty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hayatyActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));

        welMess1.setBackground(new java.awt.Color(255, 255, 255));
        welMess1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        welMess1.setForeground(new java.awt.Color(255, 255, 255));
        welMess1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welMess1.setText("بەشی تۆمارکردنی ئۆتۆمبێل");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 305, Short.MAX_VALUE)
                    .addComponent(welMess1)
                    .addGap(0, 305, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(welMess1)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );

        brand.setBackground(new java.awt.Color(241, 237, 230));
        brand.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        brand.setText("تۆمار");
        brand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                brandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                brandFocusLost(evt);
            }
        });
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(Create)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nyaty)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nayasay)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yasay)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(quOne))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(hayaty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quOne1))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(brand)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(carName)
                                        .addComponent(carType, 0, 162, Short.MAX_VALUE))
                                    .addComponent(owner, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quOne9)
                                    .addComponent(quOne3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(quOne4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(quOne6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Color, 0, 165, Short.MAX_VALUE)
                                        .addGap(112, 112, 112)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(yearlyNumber)
                                        .addGap(24, 24, 24)
                                        .addComponent(quOne8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(plateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(quOne7))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(carModel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quOne5)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yasay)
                                    .addComponent(nayasay)
                                    .addComponent(quOne))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(quOne6)
                                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quOne1))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nyaty)
                                    .addComponent(hayaty))
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quOne7))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearlyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quOne8))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carModel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quOne5))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(quOne9)
                                .addGap(18, 18, 18)
                                .addComponent(quOne3)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quOne4))
                        .addGap(15, 15, 15)
                        .addComponent(Create)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        jPanel5.setBackground(new java.awt.Color(27, 57, 100));
        jPanel5.setForeground(new java.awt.Color(27, 52, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© All rights reservedc | By:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Quantum4ce ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Development team");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
   Searching s = new Searching();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed

 String name = carName.getText();
        String brand =this.brand.getText();
        String colo = Color.getSelectedItem().toString();
        String type = carType.getSelectedItem().toString();
        String ownCar = owner.getText();
        String yearNumber = yearlyNumber.getText();
        String plateNumber = this.plateNumber.getText(); // NOTE: You forgot to insert this into SQL — I’ll comment below
        int model = Integer.parseInt(carModel.getText());
        boolean partnership = hayaty.isSelected();
        boolean formalleted = formalletedCheckBox.isSelected();

        // Create instance of the class that has createCar()
        Cars vehicle = new Cars(); // Make sure your method is in this class

        // Call the method (you can add plateNumber into SQL if you missed it)
        vehicle.createCar(name, brand, colo, type, ownCar, yearNumber, plateNumber, model, partnership, formalleted);
   
    }//GEN-LAST:event_CreateActionPerformed

    private void nayasayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nayasayActionPerformed
     if (nayasay.isSelected()) {
                    yasay.setSelected(false);
                }
    }//GEN-LAST:event_nayasayActionPerformed

    private void nyatyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyatyActionPerformed
        if (nyaty.isSelected()) {
                    hayaty.setSelected(false);
                }
    }//GEN-LAST:event_nyatyActionPerformed

    private void carTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carTypeActionPerformed
     
    }//GEN-LAST:event_carTypeActionPerformed

    private void plateNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateNumberActionPerformed
 
    }//GEN-LAST:event_plateNumberActionPerformed

    private void yearlyNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyNumberActionPerformed

    }//GEN-LAST:event_yearlyNumberActionPerformed

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
    
    }//GEN-LAST:event_ColorActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
     Main m=new Main();
     m.setVisible(true);
     this.dispose(); 
      
    }//GEN-LAST:event_backbtnActionPerformed

    private void carModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carModelActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerBtnActionPerformed

    private void yasayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yasayActionPerformed
   if (yasay.isSelected()) {
                    nayasay.setSelected(false);
                }
    }//GEN-LAST:event_yasayActionPerformed

    private void hayatyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hayatyActionPerformed
         if (hayaty.isSelected()) {
                    nyaty.setSelected(false);
                }
    }//GEN-LAST:event_hayatyActionPerformed

    private void plateNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plateNumberFocusGained
     if(plateNumber.getText().equals("تۆمار")){
         plateNumber.setText(null);} 
    }//GEN-LAST:event_plateNumberFocusGained

    private void plateNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plateNumberFocusLost
            if(plateNumber.getText().equals("")){
         plateNumber.setText("تۆمار");} 
    }//GEN-LAST:event_plateNumberFocusLost

    private void yearlyNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearlyNumberFocusGained
         if(yearlyNumber.getText().equals("تۆمار")){
         yearlyNumber.setText(null);}
    }//GEN-LAST:event_yearlyNumberFocusGained

    private void yearlyNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearlyNumberFocusLost
   if(yearlyNumber.getText().equals("")){
         yearlyNumber.setText("تۆمار");}
    }//GEN-LAST:event_yearlyNumberFocusLost

    private void carModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carModelFocusGained
             if(carModel.getText().equals("تۆمار")){
         carModel.setText(null);}
    }//GEN-LAST:event_carModelFocusGained

    private void carModelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carModelFocusLost
   if(carModel.getText().equals("")){
         carModel.setText("تۆمار");}
    }//GEN-LAST:event_carModelFocusLost

    private void ownerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ownerFocusGained
            if(owner.getText().equals("تۆمار")){
         owner.setText(null);}
    }//GEN-LAST:event_ownerFocusGained

    private void ownerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ownerFocusLost
         if(owner.getText().equals("")){
         owner.setText("تۆمار");}
    }//GEN-LAST:event_ownerFocusLost

    private void carNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carNameFocusGained
           if(carName.getText().equals("تۆمار")){
         carName.setText(null);}
    }//GEN-LAST:event_carNameFocusGained

    private void carNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carNameFocusLost
    if(carName.getText().equals("")){
         carName.setText("تۆمار");}
    }//GEN-LAST:event_carNameFocusLost

    private void ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerActionPerformed

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
  Dashboard d=new Dashboard();
        d.setVisible(true);
        this.dispose();         
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void brandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_brandFocusGained

    private void brandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_brandFocusLost

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

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
            java.util.logging.Logger.getLogger(Rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rigister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Color;
    private javax.swing.JButton Create;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField brand;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField carModel;
    private javax.swing.JTextField carName;
    private javax.swing.JComboBox<String> carType;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JRadioButton hayaty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton nayasay;
    private javax.swing.JRadioButton nyaty;
    private javax.swing.JTextField owner;
    private javax.swing.JTextField plateNumber;
    private javax.swing.JLabel quOne;
    private javax.swing.JLabel quOne1;
    private javax.swing.JLabel quOne3;
    private javax.swing.JLabel quOne4;
    private javax.swing.JLabel quOne5;
    private javax.swing.JLabel quOne6;
    private javax.swing.JLabel quOne7;
    private javax.swing.JLabel quOne8;
    private javax.swing.JLabel quOne9;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel welMess1;
    private javax.swing.JRadioButton yasay;
    private javax.swing.JTextField yearlyNumber;
    // End of variables declaration//GEN-END:variables
}
