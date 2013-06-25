/*
 * Copyright © 2013 Volker Knollmann
 * 
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file or visit
 * http://www.wtfpl.net/ for more details.
 * 
 * This program comes without any warranty. Use it at your own risk or
 * don't use it at all.
 */

package org.nodomain.volkerk.PinkDotRemover;

import java.io.File;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import java.util.*;

/**
 *
 * @author volker
 */
public class MainFrame extends javax.swing.JFrame {

    protected final JFileChooser fChooser = new JFileChooser();
    ArrayList<File> fList;
    protected RemoverWorker remWorker;
    protected LocationDatabaseInitWorker initWorker;
    
    protected DotLocationDB db;
    
    protected static final String DEFAULT_DOT_DATA_DIR = "dotData";
    protected static final String DEFAULT_CAM_TYPE = "650D";
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        fList = new ArrayList<File>();
        remWorker = null;
        initWorker = null;
        db = null;
        
        updateList();
        updateButtons();
        
        doDatabaseInit();
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

        radioGrpMethod = new javax.swing.ButtonGroup();
        btnClear = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        progBar = new javax.swing.JProgressBar();
        btnAddFile = new javax.swing.JButton();
        btnAddDir = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        radioBadPix = new javax.swing.JRadioButton();
        radioInterpolate = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        teFiles = new javax.swing.JTextArea();
        cbCam = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnClear.setText("Clear List");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 60, 5);
        getContentPane().add(btnClear, gridBagConstraints);

        btnConvert.setText("Convert Files");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        getContentPane().add(btnConvert, gridBagConstraints);

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(btnQuit, gridBagConstraints);

        progBar.setName(""); // NOI18N
        progBar.setString("");
        progBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(13, 5, 5, 5);
        getContentPane().add(progBar, gridBagConstraints);

        btnAddFile.setText("Add Files");
        btnAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFileActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(btnAddFile, gridBagConstraints);

        btnAddDir.setText("Add Directory");
        btnAddDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 5, 8, 5);
        getContentPane().add(btnAddDir, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(filler2, gridBagConstraints);

        radioGrpMethod.add(radioBadPix);
        radioBadPix.setText("Set Dead Pixel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(radioBadPix, gridBagConstraints);

        radioGrpMethod.add(radioInterpolate);
        radioInterpolate.setSelected(true);
        radioInterpolate.setText("Interpolate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(radioInterpolate, gridBagConstraints);

        teFiles.setEditable(false);
        teFiles.setColumns(20);
        teFiles.setRows(5);
        teFiles.setFocusable(false);
        jScrollPane1.setViewportView(teFiles);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        cbCam.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(cbCam, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnAddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFileActionPerformed
        doAddFilesViaDlg();
    }//GEN-LAST:event_btnAddFileActionPerformed

    private void btnAddDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDirActionPerformed
        doAddDirViaDlg();
    }//GEN-LAST:event_btnAddDirActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        doClearList();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        doConversion();
    }//GEN-LAST:event_btnConvertActionPerformed

    protected void doClearList()
    {
        fList.clear();
        updateList();
        updateButtons();
    }
    
    protected void doAddFilesViaDlg()
    {
        fChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fChooser.setMultiSelectionEnabled(true);
        int result = fChooser.showOpenDialog(this);
        
        if (result != JFileChooser.APPROVE_OPTION) return;
        
        for (File f : fChooser.getSelectedFiles())
        {
            if (fList.contains(f)) continue;
            fList.add(f);
        }
        
        updateList();
        updateButtons();
    }
    
    protected void doAddDirViaDlg()
    {
        fChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fChooser.setMultiSelectionEnabled(false);
        int result = fChooser.showOpenDialog(this);
        
        if (result != JFileChooser.APPROVE_OPTION) return;
        
        File selDir = fChooser.getSelectedFile();
        
        for (File f : selDir.listFiles())
        {
            if (fList.contains(f)) continue;
            if (!(f.isFile())) continue;
            fList.add(f);
        }
        
        updateList();
        updateButtons();
    }
    
    protected void doConversion()
    {
        // prepare the progress bar
        progBar.setMaximum(fList.size());
        
        // determine the selected camera model
        String cam = (String) cbCam.getSelectedItem();
        if (cam == null) cam = DEFAULT_CAM_TYPE;
        
        // prepare and start the conversion
        remWorker = new RemoverWorker(this, db, cam, fList, radioInterpolate.isSelected());
        remWorker.execute();
    }
    
    protected void updateList()
    {
        String txt = "";
        for (File f : fList) txt += f.toString() + System.lineSeparator();
        
        teFiles.setText(txt);
        teFiles.setCaretPosition(0);
    }
    
    protected void updateButtons()
    {
        // set a basic state (everything disabled) as long as the conversion is running
        boolean basicState = true;
        if ((remWorker != null) && (!(remWorker.isDone()))) basicState = false;
        btnConvert.setEnabled(basicState);
        btnAddDir.setEnabled(basicState);
        btnAddFile.setEnabled(basicState);
        btnClear.setEnabled(basicState);
        radioBadPix.setEnabled(basicState);
        radioInterpolate.setEnabled(basicState);
        cbCam.setEnabled(basicState);
        if (!basicState) return;
        
        // individual per-button decisions
        if (fList.size() == 0)
        {
            btnConvert.setEnabled(false);
            btnClear.setEnabled(false);
        }
        else
        {
            btnConvert.setEnabled(true);
            btnClear.setEnabled(true);
        }
        
        if (db == null)
        {
            btnConvert.setEnabled(false);
            cbCam.setEnabled(false);
        }
        else
        {
            cbCam.setEnabled(true);
        }
        
    }
    
    public void globalUpdateHook(ArrayList<File> newList, int filesProcessed)
    {
        fList = newList;
        updateButtons();
        updateList();
        
        if (filesProcessed >= 0)
        {
            progBar.setValue(filesProcessed);
            progBar.setString(filesProcessed + " of " + progBar.getMaximum() + " files processed");
        }
        else
        {
            progBar.setValue(0);
            progBar.setString("");
        }
    }
    
    public void doDatabaseInit()
    {
        // Determine the JAR's path
        String jarPath = PinkDotRemover.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        if (jarPath.endsWith(".jar")) jarPath = new File(jarPath).getParent();
        
        // the dir with the dot data
        String dotDataDir = Paths.get(jarPath, DEFAULT_DOT_DATA_DIR).toString();
        
        // switch the progress bar to indetermined mode
        progBar.setIndeterminate(true);
        progBar.setString("Initializing dot location database...");
        
        // prepare and run the worker thread
        initWorker = new LocationDatabaseInitWorker(this, dotDataDir);
        initWorker.execute();
        
        updateButtons();
    }
    
    public void dbInitDone()
    {
        progBar.setIndeterminate(false);
        progBar.setString("");
        
        try
        {
            db = initWorker.get();
        }
        catch (Exception e)
        {
            db = null;
        }
        
        if (db == null)
        {
            System.exit(42);
        }
        
        // populate the combo box for the cam selection
        cbCam.removeAllItems();
        for (String cam : db.getAllModels())
        {
            cbCam.addItem(cam);
        }
        cbCam.setEnabled(true);
        
        // select the default, if possible. Or just the first item
        cbCam.setSelectedIndex(0);
        cbCam.setSelectedItem(DEFAULT_CAM_TYPE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDir;
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnQuit;
    private javax.swing.JComboBox cbCam;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progBar;
    private javax.swing.JRadioButton radioBadPix;
    private javax.swing.ButtonGroup radioGrpMethod;
    private javax.swing.JRadioButton radioInterpolate;
    private javax.swing.JTextArea teFiles;
    // End of variables declaration//GEN-END:variables
}
