/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import core.ImageStats;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Néstor Ojeda
 */
public class ImageStatsUI extends javax.swing.JFrame {
    
    private boolean loaded = false;
    /**
     * Creates new form ImageStatsUI
     */
    public ImageStatsUI() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?", "Cerrar",JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }else{
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        
        scrollPane.getViewport().addChangeListener((ChangeEvent e) -> {
            System.out.println("Log: Detectado cambio en el Viewport" + e.toString());
            if(loaded) updateValues();
        });
        
        
        scrollPane.getHorizontalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            System.out.println("Log: Detectado cambio horizontal");
            if(loaded) updateValues();                              
            
        });
        

        scrollPane.getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            System.out.println("Log: Detectado cambio vertical");
            if(loaded) updateValues();
            
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        scrollPane = new javax.swing.JScrollPane();
        imagePanel = new ui.ImagePanel();
        statsPanel = new javax.swing.JPanel();
        redLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        avgLabel = new javax.swing.JLabel();
        redminOutput = new javax.swing.JTextField();
        redavgOutput = new javax.swing.JTextField();
        redmaxOutput = new javax.swing.JTextField();
        blueLabel = new javax.swing.JLabel();
        blueminOutput = new javax.swing.JTextField();
        blueavgOutput = new javax.swing.JTextField();
        bluemaxOutput = new javax.swing.JTextField();
        maxLabel1 = new javax.swing.JLabel();
        avgLabel1 = new javax.swing.JLabel();
        minLabel1 = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        greenminOutput = new javax.swing.JTextField();
        greenavgOutput = new javax.swing.JTextField();
        greenmaxOutput = new javax.swing.JTextField();
        maxLabel2 = new javax.swing.JLabel();
        avgLabel2 = new javax.swing.JLabel();
        minLabel2 = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        width = new javax.swing.JLabel();
        authors = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        debugMenu = new javax.swing.JMenu();
        bufferedImageDemoMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estadísticas de imagen");

        scrollPane.setToolTipText("");
        scrollPane.setOpaque(false);
        scrollPane.setPreferredSize(new java.awt.Dimension(800, 600));

        imagePanel.setName("Imagen"); // NOI18N

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1313, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(imagePanel);

        statsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        redLabel.setText("Rojo");

        minLabel.setText("Min.");

        maxLabel.setText("Max.");

        avgLabel.setText("Avg.");

        redminOutput.setEditable(false);

        redavgOutput.setEditable(false);

        redmaxOutput.setEditable(false);

        blueLabel.setText("Azul");

        blueminOutput.setEditable(false);

        blueavgOutput.setEditable(false);

        bluemaxOutput.setEditable(false);

        maxLabel1.setText("Max.");

        avgLabel1.setText("Avg.");

        minLabel1.setText("Min.");

        greenLabel.setText("Verde");

        greenminOutput.setEditable(false);

        greenavgOutput.setEditable(false);

        greenmaxOutput.setEditable(false);

        maxLabel2.setText("Max.");

        avgLabel2.setText("Avg.");

        minLabel2.setText("Min.");

        height.setText("Altura:");

        width.setText("Anchura");

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createSequentialGroup()
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxLabel)
                            .addComponent(avgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(redmaxOutput)
                            .addComponent(redavgOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(minLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redLabel)
                            .addComponent(redminOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createSequentialGroup()
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxLabel1)
                            .addComponent(avgLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bluemaxOutput)
                            .addComponent(blueavgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(minLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blueLabel)
                            .addComponent(blueminOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createSequentialGroup()
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxLabel2)
                            .addComponent(avgLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(greenmaxOutput)
                            .addComponent(greenavgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(minLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greenLabel)
                            .addComponent(greenminOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(greenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minLabel2)
                            .addComponent(greenminOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height)
                            .addComponent(width))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avgLabel2)
                            .addComponent(greenavgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxLabel2)
                            .addComponent(greenmaxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(blueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minLabel1)
                            .addComponent(blueminOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avgLabel1)
                            .addComponent(blueavgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxLabel1)
                            .addComponent(bluemaxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(redLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minLabel)
                            .addComponent(redminOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avgLabel)
                            .addComponent(redavgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxLabel)
                            .addComponent(redmaxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        authors.setText("Daniel Delgado Perera y Néstor Ojeda González");

        fileMenu.setText("Archivo");

        openMenuItem.setText("Abrir");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        menuBar.add(fileMenu);

        debugMenu.setText("Debug");

        bufferedImageDemoMenuItem.setText("Buffered Image Demo");
        bufferedImageDemoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bufferedImageDemoMenuItemActionPerformed(evt);
            }
        });
        debugMenu.add(bufferedImageDemoMenuItem);

        menuBar.add(debugMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(authors)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(statsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authors, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
                
        int returnVal = fileChooser.showOpenDialog(ImageStatsUI.this);
          if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if(!"jpg".equals(getExtension(file))){
                warningDialog("Debe ser un archivo .jpg");
                openMenuItemActionPerformed(evt);              
            }else{
                imagePanel.setImage(file);
                System.out.println("Log: abriendo " + file.getName() + "." );
                loaded = true;
                width.setText("Anchura: " + String.valueOf(imagePanel.getImageWidth()));
                height.setText("Altura: " + String.valueOf(imagePanel.getImageHeight()));
                updateValues();
                this.pack();
            }
        } else {
            System.out.println("Open command cancelled by user.");
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void bufferedImageDemoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bufferedImageDemoMenuItemActionPerformed
        // TODO add your handling code here:
        bufferedImageDialog();
        
    }//GEN-LAST:event_bufferedImageDemoMenuItemActionPerformed

    
    /*
    Debug function
    */
    public void bufferedImageDialog(){
        BufferedImage image = createImage(scrollPane.getViewport());
        JLabel picLabel = new JLabel(new ImageIcon(image));
        JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageStatsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ImageStatsUI().setVisible(true);
        });
    }
    
    
    
    private void warningDialog(String s) {
        JOptionPane.showMessageDialog(this,
            s,
            "Aviso",
            JOptionPane.WARNING_MESSAGE);
    }
    
    private String getExtension(File file) {
        String extension = "";
        int i = file.getName().lastIndexOf('.');
        if (i > 0) {
            extension = file.getName().substring(i+1);
        }  
       return extension;
    }
   
  
    private BufferedImage createImage(Component component){
            BufferedImage img = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics g2d =  img.getGraphics();
            component.paintAll(g2d);
            return img;
    }
    
    private void updateValues(){
        
        BufferedImage subSet = createImage(scrollPane.getViewport());
        ImageStats is = new ImageStats();
        
        is.calculateStats(ImageStats.bufferedImageToMat(subSet));
        
                    
        int[] max = is.getMax();
        int[] min = is.getMin();            
        int[] avg = is.getAverage();
                
        redmaxOutput.setText(String.valueOf(max[0]));
        redminOutput.setText(String.valueOf(min[0]));
        redavgOutput.setText(String.valueOf(avg[0]));
        
        bluemaxOutput.setText(String.valueOf(max[2]));
        blueminOutput.setText(String.valueOf(min[2]));
        blueavgOutput.setText(String.valueOf(avg[2]));
        
        greenmaxOutput.setText(String.valueOf(max[1]));
        greenminOutput.setText(String.valueOf(min[1]));
        greenavgOutput.setText(String.valueOf(avg[1]));
        
        System.out.println("Log: valores modificados");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authors;
    private javax.swing.JLabel avgLabel;
    private javax.swing.JLabel avgLabel1;
    private javax.swing.JLabel avgLabel2;
    private javax.swing.JLabel blueLabel;
    private javax.swing.JTextField blueavgOutput;
    private javax.swing.JTextField bluemaxOutput;
    private javax.swing.JTextField blueminOutput;
    private javax.swing.JMenuItem bufferedImageDemoMenuItem;
    private javax.swing.JMenu debugMenu;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JTextField greenavgOutput;
    private javax.swing.JTextField greenmaxOutput;
    private javax.swing.JTextField greenminOutput;
    private javax.swing.JLabel height;
    private ui.ImagePanel imagePanel;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JLabel maxLabel1;
    private javax.swing.JLabel maxLabel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel minLabel1;
    private javax.swing.JLabel minLabel2;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JLabel redLabel;
    private javax.swing.JTextField redavgOutput;
    private javax.swing.JTextField redmaxOutput;
    private javax.swing.JTextField redminOutput;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JLabel width;
    // End of variables declaration//GEN-END:variables


}
