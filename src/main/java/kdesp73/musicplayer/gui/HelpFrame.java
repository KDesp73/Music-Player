/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kdesp73.musicplayer.gui;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import kdesp73.musicplayer.db.Queries;
import kdesp73.themeLib.Theme;
import kdesp73.themeLib.ThemeCollection;
import kdesp73.themeLib.YamlFile;

/**
 *
 * @author konstantinos
 */
public class HelpFrame extends javax.swing.JFrame {

	String themes_path = System.getProperty("user.dir").replaceAll(Pattern.quote("\\"), "/") + "/themes/";

	private int index = 0;
	private int size = 8;

	CardLayout layout;

	public HelpFrame() {
		initComponents();

		this.layout = (CardLayout) pagesContainer.getLayout();

		this.setResizable(false);
//		this.setSize(600, 800);
		this.rootPane.requestFocus();
		this.setLocationRelativeTo(null);
		this.setTitle("Help");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		GUIMethods.setFontFamilyRecursively(this, "sans-serif", Font.PLAIN);
		String mode = Queries.selectTheme();
		ThemeCollection.applyTheme(this, new Theme(new YamlFile(themes_path + ((mode.equals("Dark") ? "dark.yml" : "light.yml")))));

//		shortcutsTable.setCellSelectionEnabled(false);
		shortcutsTable.setRowHeight(35);
		shortcutsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		loadShortcuts();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        pagesContainer = new javax.swing.JPanel();
        tableOfContents = new javax.swing.JPanel();
        tocTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tableOfContentsLabel = new javax.swing.JLabel();
        gettingStartedLabel = new javax.swing.JLabel();
        userManualLabel = new javax.swing.JLabel();
        faqsLabel = new javax.swing.JLabel();
        shortcutsLabel = new javax.swing.JLabel();
        functionalityLabel = new javax.swing.JLabel();
        troubleshootingLabel = new javax.swing.JLabel();
        issuesLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        gettingStarted = new javax.swing.JPanel();
        gsTitle = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userManual = new javax.swing.JPanel();
        umTitle = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        faqs = new javax.swing.JPanel();
        faqsTitle = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        shortcuts = new javax.swing.JPanel();
        scTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shortcutsTable = new javax.swing.JTable();
        jSeparator6 = new javax.swing.JSeparator();
        functionality = new javax.swing.JPanel();
        funcTitle = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        troubleshooting = new javax.swing.JPanel();
        tsLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        issues = new javax.swing.JPanel();
        issuesTitle = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        counterLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setName("bg"); // NOI18N

        nextButton.setText("Next");
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Prev");
        prevButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevButtonMouseClicked(evt);
            }
        });

        pagesContainer.setName("bg"); // NOI18N
        pagesContainer.setLayout(new java.awt.CardLayout());

        tableOfContents.setName("bg"); // NOI18N

        tocTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tocTitle.setText("Table of Contents");
        tocTitle.setName("fg"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel1.setText("0.");
        jLabel1.setName("fg"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel2.setText("1.");
        jLabel2.setName("fg"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel3.setText("2.");
        jLabel3.setName("fg"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel4.setText("3.");
        jLabel4.setName("fg"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel5.setText("4.");
        jLabel5.setName("fg"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel6.setText("5.");
        jLabel6.setName("fg"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel7.setText("6.");
        jLabel7.setName("fg"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel8.setText("7.");
        jLabel8.setName("fg"); // NOI18N

        tableOfContentsLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        tableOfContentsLabel.setForeground(new java.awt.Color(41, 121, 255));
        tableOfContentsLabel.setText("Table of Contents");
        tableOfContentsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableOfContentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOfContentsLabelMouseClicked(evt);
            }
        });

        gettingStartedLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        gettingStartedLabel.setForeground(new java.awt.Color(41, 121, 255));
        gettingStartedLabel.setText("Getting Started");
        gettingStartedLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gettingStartedLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gettingStartedLabelMouseClicked(evt);
            }
        });

        userManualLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        userManualLabel.setForeground(new java.awt.Color(41, 121, 255));
        userManualLabel.setText("User Manual");
        userManualLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userManualLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManualLabelMouseClicked(evt);
            }
        });

        faqsLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        faqsLabel.setForeground(new java.awt.Color(41, 121, 255));
        faqsLabel.setText("FAQs");
        faqsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faqsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqsLabelMouseClicked(evt);
            }
        });

        shortcutsLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        shortcutsLabel.setForeground(new java.awt.Color(41, 121, 255));
        shortcutsLabel.setText("Shortcuts");
        shortcutsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shortcutsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shortcutsLabelMouseClicked(evt);
            }
        });

        functionalityLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        functionalityLabel.setForeground(new java.awt.Color(41, 121, 255));
        functionalityLabel.setText("Functionality");
        functionalityLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        functionalityLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                functionalityLabelMouseClicked(evt);
            }
        });

        troubleshootingLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        troubleshootingLabel.setForeground(new java.awt.Color(41, 121, 255));
        troubleshootingLabel.setText("Troubleshooting");
        troubleshootingLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        troubleshootingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                troubleshootingLabelMouseClicked(evt);
            }
        });

        issuesLabel.setFont(new java.awt.Font("Dialog", 2, 15)); // NOI18N
        issuesLabel.setForeground(new java.awt.Color(41, 121, 255));
        issuesLabel.setText("Issues");
        issuesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        issuesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuesLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tableOfContentsLayout = new javax.swing.GroupLayout(tableOfContents);
        tableOfContents.setLayout(tableOfContentsLayout);
        tableOfContentsLayout.setHorizontalGroup(
            tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableOfContentsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(issuesLabel))
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(troubleshootingLabel))
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(functionalityLabel))
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shortcutsLabel))
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(faqsLabel))
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userManualLabel))
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gettingStartedLabel))
                    .addGroup(tableOfContentsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tableOfContentsLabel))
                    .addComponent(tocTitle)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        tableOfContentsLayout.setVerticalGroup(
            tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableOfContentsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tocTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tableOfContentsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(gettingStartedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userManualLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(faqsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(shortcutsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(functionalityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(troubleshootingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableOfContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(issuesLabel))
                .addContainerGap(382, Short.MAX_VALUE))
        );

        pagesContainer.add(tableOfContents, "card2");

        gettingStarted.setName("bg"); // NOI18N

        gsTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        gsTitle.setText("Getting Started");
        gsTitle.setName("fg"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel9.setText("1. Add individual files or whole directories");
        jLabel9.setName("fg"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel10.setText("2. Enjoy your music!");
        jLabel10.setName("fg"); // NOI18N

        javax.swing.GroupLayout gettingStartedLayout = new javax.swing.GroupLayout(gettingStarted);
        gettingStarted.setLayout(gettingStartedLayout);
        gettingStartedLayout.setHorizontalGroup(
            gettingStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gettingStartedLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(gettingStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(gsTitle)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        gettingStartedLayout.setVerticalGroup(
            gettingStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gettingStartedLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(gsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(559, Short.MAX_VALUE))
        );

        pagesContainer.add(gettingStarted, "card3");

        userManual.setName("bg"); // NOI18N

        umTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        umTitle.setText("User Manual");
        umTitle.setName("fg"); // NOI18N

        javax.swing.GroupLayout userManualLayout = new javax.swing.GroupLayout(userManual);
        userManual.setLayout(userManualLayout);
        userManualLayout.setHorizontalGroup(
            userManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManualLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(userManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(umTitle)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        userManualLayout.setVerticalGroup(
            userManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManualLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(umTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        pagesContainer.add(userManual, "card4");

        faqs.setName("bg"); // NOI18N

        faqsTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        faqsTitle.setText("FAQs");
        faqsTitle.setName("fg"); // NOI18N

        javax.swing.GroupLayout faqsLayout = new javax.swing.GroupLayout(faqs);
        faqs.setLayout(faqsLayout);
        faqsLayout.setHorizontalGroup(
            faqsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(faqsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faqsTitle)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        faqsLayout.setVerticalGroup(
            faqsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(faqsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        pagesContainer.add(faqs, "card5");

        shortcuts.setName("bg"); // NOI18N

        scTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        scTitle.setText("Shortcuts");
        scTitle.setName("fg"); // NOI18N

        shortcutsTable.setAutoCreateRowSorter(true);
        shortcutsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        shortcutsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        shortcutsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        shortcutsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(shortcutsTable);

        javax.swing.GroupLayout shortcutsLayout = new javax.swing.GroupLayout(shortcuts);
        shortcuts.setLayout(shortcutsLayout);
        shortcutsLayout.setHorizontalGroup(
            shortcutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shortcutsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(shortcutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scTitle)
                    .addComponent(jSeparator6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        shortcutsLayout.setVerticalGroup(
            shortcutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shortcutsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pagesContainer.add(shortcuts, "card6");

        functionality.setName("bg"); // NOI18N

        funcTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        funcTitle.setText("Functionality");
        funcTitle.setName("fg"); // NOI18N

        javax.swing.GroupLayout functionalityLayout = new javax.swing.GroupLayout(functionality);
        functionality.setLayout(functionalityLayout);
        functionalityLayout.setHorizontalGroup(
            functionalityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionalityLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(functionalityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funcTitle)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        functionalityLayout.setVerticalGroup(
            functionalityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionalityLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(funcTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        pagesContainer.add(functionality, "card7");

        troubleshooting.setName("bg"); // NOI18N

        tsLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tsLabel.setText("Troubleshooting");
        tsLabel.setName("fg"); // NOI18N

        javax.swing.GroupLayout troubleshootingLayout = new javax.swing.GroupLayout(troubleshooting);
        troubleshooting.setLayout(troubleshootingLayout);
        troubleshootingLayout.setHorizontalGroup(
            troubleshootingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(troubleshootingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(troubleshootingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tsLabel)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        troubleshootingLayout.setVerticalGroup(
            troubleshootingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(troubleshootingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        pagesContainer.add(troubleshooting, "card8");

        issues.setName("bg"); // NOI18N

        issuesTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        issuesTitle.setText("Issues");
        issuesTitle.setName("fg"); // NOI18N

        javax.swing.GroupLayout issuesLayout = new javax.swing.GroupLayout(issues);
        issues.setLayout(issuesLayout);
        issuesLayout.setHorizontalGroup(
            issuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(issuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(issuesTitle)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        issuesLayout.setVerticalGroup(
            issuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(issuesTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        pagesContainer.add(issues, "card9");

        counterLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        counterLabel.setText("0/7");

        returnButton.setText("Return");
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagesContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(counterLabel)
                        .addGap(18, 18, 18)
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prevButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextButton)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(pagesContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(prevButton)
                    .addComponent(counterLabel)
                    .addComponent(returnButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

    }//GEN-LAST:event_nextButtonActionPerformed

	private void loadShortcuts(){
		Object[][] data = {
			{"Add File", "<Ctrl> + f"},
			{"Add Directory", "<Ctrl> + d"},
			{"Edit Added Files", "<Shift> + f"},
			{"Edit Added Directories", "<Shift> + d"},
			{"Play/Pause", "<Space>"}
		};
		
		Object[] columnNames = {"Function", "Shortcut"};
		
		DefaultTableModel dataModel = new DefaultTableModel(data, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		shortcutsTable.setModel(dataModel);
		
	
		
	}
	
	private void next() {
		if (index == size - 1) {
			index = 0;
		} else {
			index++;
		}

		layout.next(pagesContainer);
		counterLabel.setText(index + "/" + (size - 1));
	}

	private void prev() {
		if (index == 0) {
			index = size - 1;
		} else {
			index--;
		}

		layout.previous(pagesContainer);
		counterLabel.setText(index + "/" + (size - 1));
	}

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		next();

    }//GEN-LAST:event_nextButtonMouseClicked

    private void prevButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevButtonMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		prev();

    }//GEN-LAST:event_prevButtonMouseClicked

    private void tableOfContentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOfContentsLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		layout.first(pagesContainer);
		index = 0;
		counterLabel.setText(index + "/" + (size - 1));

    }//GEN-LAST:event_tableOfContentsLabelMouseClicked

    private void issuesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuesLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		layout.last(pagesContainer);
		index = 7;
		counterLabel.setText(index + "/" + (size - 1));
    }//GEN-LAST:event_issuesLabelMouseClicked

    private void gettingStartedLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gettingStartedLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		while (index != 1) {
			next();
		}
    }//GEN-LAST:event_gettingStartedLabelMouseClicked

    private void userManualLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManualLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		while (index != 2) {
			next();
		}
    }//GEN-LAST:event_userManualLabelMouseClicked

    private void faqsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqsLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		while (index != 3) {
			next();
		}
    }//GEN-LAST:event_faqsLabelMouseClicked

    private void shortcutsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortcutsLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		while (index != 4) {
			next();
		}
    }//GEN-LAST:event_shortcutsLabelMouseClicked

    private void functionalityLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_functionalityLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		while (index != 5) {
			prev();
		}
    }//GEN-LAST:event_functionalityLabelMouseClicked

    private void troubleshootingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_troubleshootingLabelMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		while (index != 6) {
			prev();
		}
    }//GEN-LAST:event_troubleshootingLabelMouseClicked

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
		if (evt.getButton() != MouseEvent.BUTTON1) {
			return;
		}

		layout.first(pagesContainer);
		index = 0;
		counterLabel.setText(index + "/" + (size - 1));

    }//GEN-LAST:event_returnButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel counterLabel;
    private javax.swing.JPanel faqs;
    private javax.swing.JLabel faqsLabel;
    private javax.swing.JLabel faqsTitle;
    private javax.swing.JLabel funcTitle;
    private javax.swing.JPanel functionality;
    private javax.swing.JLabel functionalityLabel;
    private javax.swing.JPanel gettingStarted;
    private javax.swing.JLabel gettingStartedLabel;
    private javax.swing.JLabel gsTitle;
    private javax.swing.JPanel issues;
    private javax.swing.JLabel issuesLabel;
    private javax.swing.JLabel issuesTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel pagesContainer;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel scTitle;
    private javax.swing.JPanel shortcuts;
    private javax.swing.JLabel shortcutsLabel;
    private javax.swing.JTable shortcutsTable;
    private javax.swing.JPanel tableOfContents;
    private javax.swing.JLabel tableOfContentsLabel;
    private javax.swing.JLabel tocTitle;
    private javax.swing.JPanel troubleshooting;
    private javax.swing.JLabel troubleshootingLabel;
    private javax.swing.JLabel tsLabel;
    private javax.swing.JLabel umTitle;
    private javax.swing.JPanel userManual;
    private javax.swing.JLabel userManualLabel;
    // End of variables declaration//GEN-END:variables
}
