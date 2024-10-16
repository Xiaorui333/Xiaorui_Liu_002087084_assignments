/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author frida
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jSplitPane1 = new javax.swing.JSplitPane();
        ContralPanel = new javax.swing.JPanel();
        addbtn = new javax.swing.JButton();
        listbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        titlelbl = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        titleLabel1 = new javax.swing.JLabel();
        firNalbl1 = new javax.swing.JLabel();
        firNaTextField1 = new javax.swing.JTextField();
        lasNalbl1 = new javax.swing.JLabel();
        lasNaTextField1 = new javax.swing.JTextField();
        strAddLabel2 = new javax.swing.JLabel();
        strAddTextField2 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        listPanel = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        firNaTextField = new javax.swing.JTextField();
        lasNalbl = new javax.swing.JLabel();
        firNalbl = new javax.swing.JLabel();
        lasNaTextField = new javax.swing.JTextField();
        ssnlbl = new javax.swing.JLabel();
        ssnTextField = new javax.swing.JTextField();
        agelbl = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        homeAddlbl = new javax.swing.JLabel();
        homeAddPanel = new javax.swing.JPanel();
        strAddTextField = new javax.swing.JTextField();
        unitNoLabel = new javax.swing.JLabel();
        unitNoTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        unitNoTextField1 = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        zipLabel = new javax.swing.JLabel();
        zipTextField = new javax.swing.JTextField();
        phoLabel = new javax.swing.JLabel();
        phoTextField = new javax.swing.JTextField();
        strAddLabel = new javax.swing.JLabel();
        workAddLabel = new javax.swing.JLabel();
        unitNoTextField2 = new javax.swing.JTextField();
        zipTextField1 = new javax.swing.JTextField();
        unitNoLabel1 = new javax.swing.JLabel();
        phoLabel1 = new javax.swing.JLabel();
        stateTextField1 = new javax.swing.JTextField();
        zipLabel1 = new javax.swing.JLabel();
        phoTextField1 = new javax.swing.JTextField();
        strAddLabel1 = new javax.swing.JLabel();
        strAddTextField1 = new javax.swing.JTextField();
        unitNoTextField3 = new javax.swing.JTextField();
        stateLabel1 = new javax.swing.JLabel();
        cityLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContralPanel.setBorder(new javax.swing.border.MatteBorder(null));
        ContralPanel.setAutoscrolls(true);

        addbtn.setText("Add Person");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        listbtn.setText("List Person");
        listbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbtnActionPerformed(evt);
            }
        });

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        titlelbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        titlelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelbl.setText("Person Profile");

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContralPanelLayout = new javax.swing.GroupLayout(ContralPanel);
        ContralPanel.setLayout(ContralPanelLayout);
        ContralPanelLayout.setHorizontalGroup(
            ContralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContralPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ContralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ContralPanelLayout.setVerticalGroup(
            ContralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContralPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(titlelbl)
                .addGap(61, 61, 61)
                .addComponent(addbtn)
                .addGap(30, 30, 30)
                .addComponent(listbtn)
                .addGap(26, 26, 26)
                .addComponent(searchbtn)
                .addGap(26, 26, 26)
                .addComponent(updatebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(deletebtn)
                .addGap(76, 76, 76))
        );

        jSplitPane1.setLeftComponent(ContralPanel);

        WorkArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WorkArea.setAutoscrolls(true);
        WorkArea.setLayout(new java.awt.CardLayout());

        titleLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel1.setText("Search for Person");

        firNalbl1.setText("First Name");

        lasNalbl1.setText("Last Name");

        strAddLabel2.setText("Street Address");

        strAddTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        searchButton.setText("Search");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(searchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(firNalbl1)
                                .addGap(18, 18, 18)
                                .addComponent(firNaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(lasNalbl1)
                                .addGap(18, 18, 18)
                                .addComponent(lasNaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(strAddLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(strAddTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        searchPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {firNalbl1, lasNalbl1, strAddLabel2});

        searchPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {firNaTextField1, lasNaTextField1, strAddTextField2});

        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firNalbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firNaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lasNalbl1)
                    .addComponent(lasNaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strAddLabel2)
                    .addComponent(strAddTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        searchPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {firNalbl1, lasNalbl1, strAddLabel2});

        searchPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {firNaTextField1, lasNaTextField1, strAddTextField2});

        WorkArea.add(searchPanel, "card4");

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        WorkArea.add(listPanel, "card3");

        addPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lasNalbl.setText("Last Name");

        firNalbl.setText("First Name");

        ssnlbl.setText("Social Security Number");

        agelbl.setText("Age");

        homeAddlbl.setText("Home Address");

        java.awt.GridBagLayout homeAddPanelLayout = new java.awt.GridBagLayout();
        homeAddPanelLayout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        homeAddPanelLayout.rowHeights = new int[] {0, 10, 0};
        homeAddPanel.setLayout(homeAddPanelLayout);

        strAddTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        homeAddPanel.add(strAddTextField, gridBagConstraints);

        unitNoLabel.setText("Unit Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        homeAddPanel.add(unitNoLabel, gridBagConstraints);

        unitNoTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        homeAddPanel.add(unitNoTextField, gridBagConstraints);

        cityLabel.setText("City");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        homeAddPanel.add(cityLabel, gridBagConstraints);

        unitNoTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        homeAddPanel.add(unitNoTextField1, gridBagConstraints);

        stateLabel.setText("State");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        homeAddPanel.add(stateLabel, gridBagConstraints);

        stateTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        homeAddPanel.add(stateTextField, gridBagConstraints);

        zipLabel.setText("Zip Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        homeAddPanel.add(zipLabel, gridBagConstraints);

        zipTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        homeAddPanel.add(zipTextField, gridBagConstraints);

        phoLabel.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        homeAddPanel.add(phoLabel, gridBagConstraints);

        phoTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        homeAddPanel.add(phoTextField, gridBagConstraints);

        strAddLabel.setText("Street Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        homeAddPanel.add(strAddLabel, gridBagConstraints);

        workAddLabel.setText("Work Address");

        unitNoTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        zipTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        unitNoLabel1.setText("Unit Number");

        phoLabel1.setText("Phone Number");

        stateTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        zipLabel1.setText("Zip Code");

        phoTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        strAddLabel1.setText("Street Address");

        strAddTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        unitNoTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        stateLabel1.setText("State");

        cityLabel1.setText("City");

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Add Person");

        saveButton.setText("Save");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssnlbl)
                            .addComponent(firNalbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firNaTextField)
                            .addComponent(ssnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(lasNalbl)
                                .addGap(18, 18, 18)
                                .addComponent(lasNaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(agelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(305, 305, 305))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeAddlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workAddLabel)
                            .addComponent(homeAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addPanelLayout.createSequentialGroup()
                                        .addComponent(strAddLabel1)
                                        .addGap(10, 10, 10)
                                        .addComponent(strAddTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(cityLabel1)
                                        .addGap(14, 14, 14)
                                        .addComponent(unitNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(zipLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(zipTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addPanelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(unitNoLabel1)
                                        .addGap(17, 17, 17)
                                        .addComponent(unitNoTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(stateLabel1)
                                        .addGap(10, 10, 10)
                                        .addComponent(stateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(phoLabel1)
                                        .addGap(10, 10, 10)
                                        .addComponent(phoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firNaTextField)
                        .addComponent(lasNalbl)
                        .addComponent(lasNaTextField))
                    .addComponent(firNalbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ssnTextField)
                        .addComponent(agelbl)
                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ssnlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(homeAddlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(strAddLabel1))
                    .addComponent(strAddTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cityLabel1))
                    .addComponent(unitNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(zipLabel1))
                    .addComponent(zipTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(unitNoLabel1))
                    .addComponent(unitNoTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(stateLabel1))
                    .addComponent(stateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(phoLabel1))
                    .addComponent(phoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(40, 40, 40))
        );

        WorkArea.add(addPanel, "card2");

        jSplitPane1.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        String firstName=firNaTextField.getText();
        String lastName =lasNaTextField.getText();
        String ssn =ssnTextField.getText();
        int age =Integer.parseInt(ageTextField.getText());
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void listbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContralPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel agelbl;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityLabel1;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField firNaTextField;
    private javax.swing.JTextField firNaTextField1;
    private javax.swing.JLabel firNalbl;
    private javax.swing.JLabel firNalbl1;
    private javax.swing.JPanel homeAddPanel;
    private javax.swing.JLabel homeAddlbl;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField lasNaTextField;
    private javax.swing.JTextField lasNaTextField1;
    private javax.swing.JLabel lasNalbl;
    private javax.swing.JLabel lasNalbl1;
    private javax.swing.JPanel listPanel;
    private javax.swing.JButton listbtn;
    private javax.swing.JLabel phoLabel;
    private javax.swing.JLabel phoLabel1;
    private javax.swing.JTextField phoTextField;
    private javax.swing.JTextField phoTextField1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JLabel ssnlbl;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel stateLabel1;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField stateTextField1;
    private javax.swing.JLabel strAddLabel;
    private javax.swing.JLabel strAddLabel1;
    private javax.swing.JLabel strAddLabel2;
    private javax.swing.JTextField strAddTextField;
    private javax.swing.JTextField strAddTextField1;
    private javax.swing.JTextField strAddTextField2;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel unitNoLabel;
    private javax.swing.JLabel unitNoLabel1;
    private javax.swing.JTextField unitNoTextField;
    private javax.swing.JTextField unitNoTextField1;
    private javax.swing.JTextField unitNoTextField2;
    private javax.swing.JTextField unitNoTextField3;
    private javax.swing.JButton updatebtn;
    private javax.swing.JLabel workAddLabel;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JLabel zipLabel1;
    private javax.swing.JTextField zipTextField;
    private javax.swing.JTextField zipTextField1;
    // End of variables declaration//GEN-END:variables
}
