/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prorcet;

import com.ozten.font.JFontChooser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PushbackInputStream;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultEditorKit.CopyAction;
import javax.swing.text.DefaultEditorKit.CutAction;
import javax.swing.text.DefaultEditorKit.PasteAction;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;

/**
 *
 * @author haida
 */


public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        textPanel = new javax.swing.JTextPane();
        openB = new javax.swing.JButton();
        saveB = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        kata = new javax.swing.JLabel();
        karakter = new javax.swing.JLabel();
        kalimat = new javax.swing.JLabel();
        spesification = new javax.swing.JLabel();
        panelColor = new javax.swing.JPanel();
        colorPicker = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fontChooser = new javax.swing.JButton();
        textPreview = new javax.swing.JLabel();
        colorApply = new javax.swing.JButton();
        fontApply = new javax.swing.JButton();
        CutB = new javax.swing.JButton(new CutAction());
        CopyB = new javax.swing.JButton(new CopyAction());
        pasteB = new javax.swing.JButton(new PasteAction());
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boldB = new javax.swing.JButton(new BoldAction());
        italicB = new javax.swing.JButton(new ItalicAction());
        underlineB = new javax.swing.JButton(new UnderlineAction());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(textPanel);

        openB.setText("Open");
        openB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBActionPerformed(evt);
            }
        });

        saveB.setText("Save");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        kata.setText("Kata :");

        karakter.setText("Karakter :");

        kalimat.setText("Kalimat :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(karakter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kalimat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kata)
                .addGap(27, 27, 27)
                .addComponent(karakter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(kalimat)
                .addContainerGap())
        );

        spesification.setText("Spesification :");

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        colorPicker.setText("Change Color");
        colorPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorPickerActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Color Preview");

        fontChooser.setText("Change Font");
        fontChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontChooserActionPerformed(evt);
            }
        });

        textPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPreview.setText("Text Priview");

        colorApply.setText("Apply");
        colorApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorApplyActionPerformed(evt);
            }
        });

        fontApply.setText("Apply");
        fontApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontApplyActionPerformed(evt);
            }
        });

        CutB.setText("Cut");
        CutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutBActionPerformed(evt);
            }
        });

        CopyB.setText("Copy");
        CopyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyBActionPerformed(evt);
            }
        });

        pasteB.setText("Paste");
        pasteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Utility :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Font Utility");

        boldB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boldB.setText("Bold");
        boldB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldBActionPerformed(evt);
            }
        });

        italicB.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        italicB.setText("Italic");
        italicB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicBActionPerformed(evt);
            }
        });

        underlineB.setText("UnderLine");
        underlineB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underlineBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spesification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(openB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(saveB)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorPicker)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(colorApply))
                            .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(fontApply)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(textPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(boldB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(italicB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(underlineB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(fontChooser)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CopyB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CutB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pasteB))
                        .addGap(691, 691, 691))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(CutB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(openB)
                                    .addComponent(saveB))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spesification)
                                    .addComponent(jLabel1))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CopyB)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(pasteB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(colorApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fontApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(textPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(italicB))
                                        .addGap(6, 6, 6)))
                                .addComponent(underlineB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fontChooser)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boldB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    //open and count and write file
    
    private void openBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String pathfile = file.getAbsolutePath();

        spesification.setText("Spesification : " + file.getName());

        String outputfile = null;
        int karakter = 0;
        int kata = 1;
        int kalimat = 1;
        try ( PushbackInputStream pis = new PushbackInputStream(new FileInputStream(pathfile))) {
            byte byteData;
            while ((byteData = (byte) pis.read()) != -1) {
                //System.out.print((char) byteData);
                if (outputfile == null) {
                    outputfile = "" + (char) byteData;
                } else {
                    outputfile += "" + (char) byteData;
                }

                karakter++;
                if ((char) byteData == ' ' || (char) byteData == '\n') {
                    kata++;
                }
                if ((char) byteData == '.') {
                    kalimat++;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }

        this.kalimat.setText("Kalimat : " + kalimat);
        this.karakter.setText("Karakter : " + karakter);
        this.kata.setText("Kata : " + kata);

        this.textPanel.setText(outputfile);
    }//GEN-LAST:event_openBActionPerformed

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
        chooser.addChoosableFileFilter(filter);
        UIManager.put("FileChooser.openButtonText", "Save");
        SwingUtilities.updateComponentTreeUI(chooser);
        chooser.showOpenDialog(null);
        
        File file = chooser.getSelectedFile();
        String pathfile = file.getAbsolutePath();
        String data = this.textPanel.getText();
        File fileToSave = chooser.getSelectedFile();
        writefile(fileToSave.getAbsolutePath(), data);
    }//GEN-LAST:event_saveBActionPerformed
    
    public void writefile(String nama, String data) {

        try {
            String str = data;
            try ( BufferedWriter writer = new BufferedWriter(new FileWriter( nama + ".txt"))) {
                writer.write(str);
            }
            System.out.println("File has been written");

        } catch (Exception e) {
            System.out.println("Could not create file");
        }

    }
    
    
    
    
    
    
    
    
    //coloring file
    
    private Color color;
    private void colorPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorPickerActionPerformed
        color = JColorChooser.showDialog(this, "Select a Color", color);
        if (color != null) {
            this.panelColor.setBackground(color);
        }
    }//GEN-LAST:event_colorPickerActionPerformed
    
    
    
    
    
    
    
    //font chooser
    
    JFontChooser fc = new JFontChooser();
    private void fontChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontChooserActionPerformed
        
        JOptionPane.showMessageDialog(null, fc, "Select Font", JOptionPane.PLAIN_MESSAGE);
        this.textPreview.setFont(fc.getPreviewFont());
    }//GEN-LAST:event_fontChooserActionPerformed

    private void colorApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorApplyActionPerformed

        SimpleAttributeSet attr = new SimpleAttributeSet();
            StyleConstants.setForeground(attr, color);
            textPanel.setCharacterAttributes(attr, false);
    }//GEN-LAST:event_colorApplyActionPerformed

    private void fontApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontApplyActionPerformed

           textPanel.setFont(fc.getPreviewFont());
    }//GEN-LAST:event_fontApplyActionPerformed
    
    
    
    
    
    
    
    //utility action cut copy paste
    
    private void CutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutBActionPerformed
        // TODO add your handling code here:
        textPanel.requestFocusInWindow();
    }//GEN-LAST:event_CutBActionPerformed

    private void CopyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyBActionPerformed
        // TODO add your handling code here:
        textPanel.requestFocusInWindow();
    }//GEN-LAST:event_CopyBActionPerformed

    private void pasteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBActionPerformed
        // TODO add your handling code here:
        textPanel.requestFocusInWindow();
    }//GEN-LAST:event_pasteBActionPerformed

    
    
    
    
    
    
    
    // utility font action
    
    private void boldBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldBActionPerformed
        // TODO add your handling code here:
        textPanel.requestFocusInWindow();
    }//GEN-LAST:event_boldBActionPerformed

    private void italicBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicBActionPerformed
        // TODO add your handling code here:
        textPanel.requestFocusInWindow();
    }//GEN-LAST:event_italicBActionPerformed

    private void underlineBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underlineBActionPerformed
        // TODO add your handling code here:
        textPanel.requestFocusInWindow();
    }//GEN-LAST:event_underlineBActionPerformed

    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CopyB;
    private javax.swing.JButton CutB;
    private javax.swing.JButton boldB;
    private javax.swing.JButton colorApply;
    private javax.swing.JButton colorPicker;
    private javax.swing.JButton fontApply;
    private javax.swing.JButton fontChooser;
    private javax.swing.JButton italicB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kalimat;
    private javax.swing.JLabel karakter;
    private javax.swing.JLabel kata;
    private javax.swing.JButton openB;
    private javax.swing.JPanel panelColor;
    private javax.swing.JButton pasteB;
    private javax.swing.JButton saveB;
    private javax.swing.JLabel spesification;
    private javax.swing.JTextPane textPanel;
    private javax.swing.JLabel textPreview;
    private javax.swing.JButton underlineB;
    // End of variables declaration//GEN-END:variables
}
