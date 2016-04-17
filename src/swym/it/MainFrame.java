package swym.it;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        super("Swym.it");
        initComponents();
        readPane.setVisible(true);
        createPane.setVisible(false);
        deletePane.setVisible(false);
        displayArea.setEditable(false);
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        displayArea.setBorder(BorderFactory.createCompoundBorder(border, 
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        displayspecificPane.setVisible(false);
        downText.setText("Click on the buttons");
        deleteTablePane.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAcqGroup = new javax.swing.ButtonGroup();
        deleteAcqGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        createPane = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        createRelativeRadio = new javax.swing.JRadioButton();
        createPersonalRadio = new javax.swing.JRadioButton();
        createProfessionalRadio = new javax.swing.JRadioButton();
        createCasualRadio = new javax.swing.JRadioButton();
        createProceed = new javax.swing.JButton();
        choicecrealert = new javax.swing.JLabel();
        deletePane = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        deleteRelativeRadio = new javax.swing.JRadioButton();
        deletePersonalRadio = new javax.swing.JRadioButton();
        deleteProfessionalRadio = new javax.swing.JRadioButton();
        deleteCasualRadio = new javax.swing.JRadioButton();
        deleteProceed = new javax.swing.JButton();
        choicedelalert = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        readPane = new javax.swing.JPanel();
        readFile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        deleteTablePane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        deleteTable = new javax.swing.JTable();
        canceltab = new javax.swing.JButton();
        deletetab = new javax.swing.JButton();
        tablematter = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        helper = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        createAcqButton = new javax.swing.JButton();
        deleteAcqButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        downText = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        displayspecificButton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        displayspecificPane = new javax.swing.JPanel();
        typeBox = new javax.swing.JComboBox<>();
        displayspecButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nameSearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSplitPane2.setDividerLocation(536);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Select the type of Acquaintance"));
        jPanel5.setToolTipText("Select Acq Type");

        createAcqGroup.add(createRelativeRadio);
        createRelativeRadio.setText("Create new Relative");
        createRelativeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRelativeRadioActionPerformed(evt);
            }
        });

        createAcqGroup.add(createPersonalRadio);
        createPersonalRadio.setText("Create new Personal Friend");

        createAcqGroup.add(createProfessionalRadio);
        createProfessionalRadio.setText("Create new Professional Friend");

        createAcqGroup.add(createCasualRadio);
        createCasualRadio.setText("Create new Casual Acquaintance");

        createProceed.setText("Create Acq");
        createProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProceedActionPerformed(evt);
            }
        });

        choicecrealert.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        choicecrealert.setForeground(new java.awt.Color(255, 0, 0));
        choicecrealert.setText("Please select one of the choices above !");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createRelativeRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createPersonalRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createProfessionalRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createCasualRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choicecrealert, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createRelativeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPersonalRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createProfessionalRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createCasualRadio)
                .addGap(18, 18, 18)
                .addComponent(choicecrealert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(createProceed)
                .addContainerGap())
        );

        javax.swing.GroupLayout createPaneLayout = new javax.swing.GroupLayout(createPane);
        createPane.setLayout(createPaneLayout);
        createPaneLayout.setHorizontalGroup(
            createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        createPaneLayout.setVerticalGroup(
            createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        deletePane.setPreferredSize(new java.awt.Dimension(539, 326));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Select the type of Acquaintance"));

        deleteAcqGroup.add(deleteRelativeRadio);
        deleteRelativeRadio.setText("Delete Relative");

        deleteAcqGroup.add(deletePersonalRadio);
        deletePersonalRadio.setText("Delete Personal Friend");

        deleteAcqGroup.add(deleteProfessionalRadio);
        deleteProfessionalRadio.setText("Delete Professional Friend");

        deleteAcqGroup.add(deleteCasualRadio);
        deleteCasualRadio.setText("Delete Casual Acquaintance");

        deleteProceed.setText("Delete Acq");
        deleteProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProceedActionPerformed(evt);
            }
        });

        choicedelalert.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        choicedelalert.setForeground(new java.awt.Color(255, 0, 0));
        choicedelalert.setText("Please select one of the choices above !");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteRelativeRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletePersonalRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteProfessionalRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteCasualRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 253, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(choicedelalert, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteRelativeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonalRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteProfessionalRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCasualRadio)
                .addGap(18, 18, 18)
                .addComponent(choicedelalert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(deleteProceed)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Please select one of the choices above !");

        javax.swing.GroupLayout deletePaneLayout = new javax.swing.GroupLayout(deletePane);
        deletePane.setLayout(deletePaneLayout);
        deletePaneLayout.setHorizontalGroup(
            deletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(deletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletePaneLayout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addGap(106, 106, 106)))
        );
        deletePaneLayout.setVerticalGroup(
            deletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(deletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletePaneLayout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(jLabel3)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );

        readFile.setText("Read From File");
        readFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readFileActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Purisa", 2, 15)); // NOI18N
        jLabel4.setText("Welcome to Contact List");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("To start from previous saved session click on the below button ..... ");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        jLabel8.setText("This little program implements polymorphism and inheritance ...");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        jLabel9.setText("Please have a look at readme.txt");

        javax.swing.GroupLayout readPaneLayout = new javax.swing.GroupLayout(readPane);
        readPane.setLayout(readPaneLayout);
        readPaneLayout.setHorizontalGroup(
            readPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readPaneLayout.createSequentialGroup()
                .addGroup(readPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(readPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(readPaneLayout.createSequentialGroup()
                        .addGroup(readPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(readPaneLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(readFile, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(readPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(readPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        readPaneLayout.setVerticalGroup(
            readPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(readFile)
                .addContainerGap())
        );

        deleteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type of Acq", "Index Of Acq", "Name", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(deleteTable);

        canceltab.setText("Cancel");

        deletetab.setText("Delete");
        deletetab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetabActionPerformed(evt);
            }
        });

        tablematter.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        tablematter.setText("Nothing");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Please delete only one entry at a time  ! ");

        javax.swing.GroupLayout deleteTablePaneLayout = new javax.swing.GroupLayout(deleteTablePane);
        deleteTablePane.setLayout(deleteTablePaneLayout);
        deleteTablePaneLayout.setHorizontalGroup(
            deleteTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteTablePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(deleteTablePaneLayout.createSequentialGroup()
                        .addGroup(deleteTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deleteTablePaneLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deletetab, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(canceltab, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(deleteTablePaneLayout.createSequentialGroup()
                                .addComponent(tablematter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        deleteTablePaneLayout.setVerticalGroup(
            deleteTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteTablePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablematter)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(deleteTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canceltab)
                    .addComponent(deletetab))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(createPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(deletePane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(readPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(deleteTablePane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deletePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(readPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deletePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(readPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        helper.setText("Please select an option present on the right Pane.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helper, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helper)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel6);

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        createAcqButton.setText("Create  Acquaintance");
        createAcqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAcqButtonActionPerformed(evt);
            }
        });

        deleteAcqButton.setText("Delete Acquaintance");
        deleteAcqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAcqButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteAcqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createAcqButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAcqButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteAcqButton)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        jTabbedPane1.addTab("Create/Delete", jPanel1);

        jSplitPane1.setDividerLocation(475);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Text Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Purisa", 2, 14))); // NOI18N

        displayArea.setColumns(20);
        displayArea.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        downText.setText("Text to be displayed");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(downText)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel9);

        jSplitPane3.setDividerLocation(175);
        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Display All Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        displayspecificButton.setText("Display Specific List");
        displayspecificButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayspecificButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayspecificButton, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayspecificButton)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane3.setTopComponent(jPanel11);

        displayspecificPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type to be displayed", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Purisa", 0, 12))); // NOI18N

        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Relative", "Personal Friend", "Professional Friend", "Casual Acquaintance" }));

        displayspecButton.setText("Display");
        displayspecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayspecButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayspecificPaneLayout = new javax.swing.GroupLayout(displayspecificPane);
        displayspecificPane.setLayout(displayspecificPaneLayout);
        displayspecificPaneLayout.setHorizontalGroup(
            displayspecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayspecificPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayspecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeBox, 0, 0, Short.MAX_VALUE)
                    .addComponent(displayspecButton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap())
        );
        displayspecificPaneLayout.setVerticalGroup(
            displayspecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayspecificPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(displayspecButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayspecificPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayspecificPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane3.setRightComponent(jPanel13);

        jSplitPane1.setRightComponent(jSplitPane3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        jTabbedPane1.addTab("Display", jPanel2);

        jSplitPane4.setDividerLocation(39);
        jSplitPane4.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel6.setText("Name to be searched :");

        nameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSearchActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane4.setTopComponent(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jSplitPane4.setRightComponent(jPanel15);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );

        jTabbedPane1.addTab("Search Name", jPanel3);

        jLabel2.setFont(new java.awt.Font("Rekha", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contact List");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createRelativeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRelativeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createRelativeRadioActionPerformed

    private void createAcqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAcqButtonActionPerformed
        readPane.setVisible(false);
        deletePane.setVisible(false);
        createPane.setVisible(true);
        choicecrealert.setVisible(false);
        helper.setText("Please choose an option to create !");
        createAcqGroup.clearSelection();
    }//GEN-LAST:event_createAcqButtonActionPerformed

    private void deleteProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProceedActionPerformed

        if(deleteAcqGroup.getSelection()==null){
            choicedelalert.setVisible(true);
            return;
        }
        else{
            deleteTablePane.setVisible(true);
            deletePane.setVisible(false);
            
            if(deleteRelativeRadio.isSelected()){
                DefaultTableModel model =(DefaultTableModel) deleteTable    .getModel();
                model.setRowCount(0);
                for(int i=0;i<ContactList.getrcount();i++){
                    model.addRow(new Object[]{"Relative",i,ContactList.getRelative().get(i).getName(),false});
                }
                tablematter.setText("Relative");
                
            }
            else if(deletePersonalRadio.isSelected()){
                DefaultTableModel model =(DefaultTableModel) deleteTable.getModel();
                model.setRowCount(0);
                for(int i=0;i<ContactList.getpercount();i++){
                    model.addRow(new Object[]{"Personal Friend",i,ContactList.getPersonal().get(i).getName(),false});
                }
                tablematter.setText("Personal Friend");
                
            }
            else if(deleteProfessionalRadio.isSelected()){
                DefaultTableModel model =(DefaultTableModel) deleteTable.getModel();
                model.setRowCount(0);
                for(int i=0;i<ContactList.getprocount();i++){
                    model.addRow(new Object[]{"Professional Friend",i,ContactList.getProfessional().get(i).getName(),false});
                
                }
                tablematter.setText("Professional Friend");
                
            }
            else if(deleteCasualRadio.isSelected()){
                    DefaultTableModel model =(DefaultTableModel) deleteTable.getModel();
                    model.setRowCount(0);
                    for(int i=0;i<ContactList.getacqcount();i++){
                        model.addRow(new Object[]{"Casual Acq",i,ContactList.getCasual().get(i).getName(),false});
                }
                tablematter.setText("Casual Acq");
                
            }
        }    
    }//GEN-LAST:event_deleteProceedActionPerformed
    
    private void deleteAcqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAcqButtonActionPerformed
        deleteTablePane.setVisible(false);
        readPane.setVisible(false);
        deletePane.setVisible(true);
        createPane.setVisible(false);
        choicedelalert.setVisible(false);
        helper.setText("Please choose an option to delete !");
        deleteAcqGroup.clearSelection();
    }//GEN-LAST:event_deleteAcqButtonActionPerformed

    private void createProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProceedActionPerformed
        if(createAcqGroup.getSelection()==null){
            choicecrealert.setVisible(true);
            return;
        }
        else{
            if(createRelativeRadio.isSelected()){
                RelativeForm relate =new RelativeForm();
                relate.setVisible(true);
                relate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else if(createPersonalRadio.isSelected()){
                PersonalForm relate =new PersonalForm();
                relate.setVisible(true);
                relate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else if(createProfessionalRadio.isSelected()){
                ProfessionalForm relate =new ProfessionalForm();
                relate.setVisible(true);
                relate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else if(createCasualRadio.isSelected()){
                CasualForm relate =new CasualForm();
                relate.setVisible(true);
                relate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_createProceedActionPerformed

    private void displayspecificButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayspecificButtonActionPerformed
        displayspecificPane.setVisible(true);
        displayArea.setText("***** Select the Type Of Acquaintance *****\n\n Please select one from the below box ....");
        downText.setText("Select Type to display");
    }//GEN-LAST:event_displayspecificButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ContactList.getContact().isEmpty()){
            displayArea.setText("***** No Acquaintances Found *****\n\n Please create one from the previous tab ....");
            downText.setText("Create Acq to display");
        }
        else {
            displayArea.setText(ContactList.displayAcq());
            downText.setText("Displying all acquaintance ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayspecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayspecButtonActionPerformed
        if(typeBox.getSelectedIndex()==0){
            displayArea.setText(ContactList.displayRelative());
            downText.setText("Displying Relatives ");
        }
        if(typeBox.getSelectedIndex()==1){
            displayArea.setText(ContactList.displayPersonal());
            downText.setText("Displying Personal Friends ");
        }
        if(typeBox.getSelectedIndex()==2){
            displayArea.setText(ContactList.displayProfessional());
            downText.setText("Displying Professional Friends ");
        }
        if(typeBox.getSelectedIndex()==3){
            displayArea.setText(ContactList.displayCasual());
            downText.setText("Displying Casual Acquaintances ");
        }
        
    }//GEN-LAST:event_displayspecButtonActionPerformed

    private void readFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readFileActionPerformed
        ContactList.readAcq();
        readPane.setVisible(false);
    }//GEN-LAST:event_readFileActionPerformed

    private void nameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSearchActionPerformed
        
    }//GEN-LAST:event_nameSearchActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String details = "";
        details = ContactList.searchName(nameSearch.getText());
        jTextArea1.setText(details);
    }//GEN-LAST:event_searchActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JOptionPane.showMessageDialog(null,"Did You Like it ?\nI would love to hear your suggestions."
                + "\nThank You !","Swym.it",JOptionPane.INFORMATION_MESSAGE);
        super.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void deletetabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetabActionPerformed
        if(tablematter.getText().equals("Relative")){
            int delcount = 0;
            int temp = ContactList.getrcount();
            for(int j=0;j<temp;j++){
                boolean chc =  ((boolean)deleteTable.getValueAt(j,3));
                if(chc==true){
                    ContactList.deleteRelative(j-delcount);
                    delcount++;
                }
            }
        }
        else if(tablematter.getText().equals("Personal Friend")){
            int delcount =0;
            int temp = ContactList.getpercount();
            for(int j=0;j<temp;j++){
                boolean chc =  ((boolean)deleteTable.getValueAt(j,3));
                if(chc==true){
                    ContactList.deletePersonal(j-delcount);
                    delcount++;
                }
            }
        }
        else if(tablematter.getText().equals("Professional Friend")){
            int delcount = 0;
            int temp = ContactList.getprocount();
            for(int j=0;j<temp;j++){
                boolean chc =  ((boolean)deleteTable.getValueAt(j,3));
                if(chc==true){
                    System.out.print("");
                    ContactList.deleteProfessional(j-delcount);
                    delcount++;
                }
            }
        }
        else if(tablematter.getText().equals("Casual Acq")){
            int delcount = 0;
            int temp = ContactList.getacqcount();
            for(int j=0;j<temp;j++){
                boolean chc =  ((boolean)deleteTable.getValueAt(j,3));
                if(chc==true){
                    ContactList.deleteCasual(j-delcount);
                    delcount++;
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Problem ");
        }
        deleteTablePane.setVisible(false);
    }//GEN-LAST:event_deletetabActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canceltab;
    private javax.swing.JLabel choicecrealert;
    private javax.swing.JLabel choicedelalert;
    private javax.swing.JButton createAcqButton;
    private javax.swing.ButtonGroup createAcqGroup;
    private javax.swing.JRadioButton createCasualRadio;
    private javax.swing.JPanel createPane;
    private javax.swing.JRadioButton createPersonalRadio;
    private javax.swing.JButton createProceed;
    private javax.swing.JRadioButton createProfessionalRadio;
    private javax.swing.JRadioButton createRelativeRadio;
    private javax.swing.JButton deleteAcqButton;
    private javax.swing.ButtonGroup deleteAcqGroup;
    private javax.swing.JRadioButton deleteCasualRadio;
    private javax.swing.JPanel deletePane;
    private javax.swing.JRadioButton deletePersonalRadio;
    private javax.swing.JButton deleteProceed;
    private javax.swing.JRadioButton deleteProfessionalRadio;
    private javax.swing.JRadioButton deleteRelativeRadio;
    private javax.swing.JTable deleteTable;
    private javax.swing.JPanel deleteTablePane;
    private javax.swing.JButton deletetab;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JButton displayspecButton;
    private javax.swing.JButton displayspecificButton;
    private javax.swing.JPanel displayspecificPane;
    private javax.swing.JLabel downText;
    private javax.swing.JButton exit;
    private javax.swing.JLabel helper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nameSearch;
    private javax.swing.JButton readFile;
    private javax.swing.JPanel readPane;
    private javax.swing.JButton search;
    private javax.swing.JLabel tablematter;
    private javax.swing.JComboBox<String> typeBox;
    // End of variables declaration//GEN-END:variables
}
