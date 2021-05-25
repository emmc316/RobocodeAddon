/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robocodecompetencia;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ericm
 */
public class WinnersDialog extends javax.swing.JDialog {
   Hilo hilito = new Hilo(this);
    public ArrayList <String> lista = new ArrayList<String>();
    /**
     * Creates new form WinnersDialog
     * 
     * @param lista
     * @param parent
     * @param modal
     */
    public WinnersDialog(ArrayList <String> lista,java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.lista = lista;
        setSize(1280,720);
        setLocation(50,10);
        addGanadores();
        contador();
    }

    public void addGanadores(){
        
           for(int i = 0; i < lista.size();i++){
               JLabel x = new JLabel((i+1)+".- "+lista.get(i).toString());
               x.setFont(new java.awt.Font("Trebuchet MS", 1, 25));
               x.setForeground(new java.awt.Color(255,255,255));
               x.setHorizontalAlignment(JLabel.CENTER);
               panelCentro.add(x);
           }
        
    }
    
    public void contador(){
       // Hilo hilito = new Hilo(this);
       
       hilito.start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNorte = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        panelSur = new javax.swing.JPanel();
        CountLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Winners");
        setBackground(new java.awt.Color(0, 0, 51));
        setLocation(new java.awt.Point(100, 100));
        setSize(new java.awt.Dimension(600, 400));
        setType(java.awt.Window.Type.POPUP);

        PanelNorte.setBackground(new java.awt.Color(0, 0, 51));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5);
        flowLayout1.setAlignOnBaseline(true);
        PanelNorte.setLayout(flowLayout1);

        titleLabel.setFont(new java.awt.Font("Magneto", 0, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 204, 0));
        titleLabel.setText("Ganadores");
        PanelNorte.add(titleLabel);

        getContentPane().add(PanelNorte, java.awt.BorderLayout.PAGE_START);

        panelSur.setBackground(new java.awt.Color(0, 0, 51));
        panelSur.setLayout(new java.awt.GridLayout(2, 1));

        CountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        CountLabel.setForeground(new java.awt.Color(255, 0, 0));
        CountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CountLabel.setText("60");
        CountLabel.setToolTipText("");
        CountLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CountLabel.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                CountLabelVetoableChange(evt);
            }
        });
        panelSur.add(CountLabel);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 5));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robocodecompetencia/logos/cis.png"))); // NOI18N
        jPanel1.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robocodecompetencia/logos/colcis.png"))); // NOI18N
        jPanel1.add(jLabel2);

        panelSur.add(jPanel1);

        getContentPane().add(panelSur, java.awt.BorderLayout.PAGE_END);

        panelCentro.setBackground(new java.awt.Color(0, 102, 153));
        panelCentro.setLayout(new java.awt.GridLayout(10, 1));
        getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CountLabelVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_CountLabelVetoableChange
             int x = 60;
        x--;
        this.CountLabel.setText(Integer.toString(x));
    }//GEN-LAST:event_CountLabelVetoableChange

 public void setTextCount(int x){
     this.CountLabel.setText(Integer.toString(x));
     this.panelSur.repaint();
 }
 
public int getTextCount(){
    return Integer.parseInt(this.CountLabel.getText());
} 
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CountLabel;
    private javax.swing.JPanel PanelNorte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelSur;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}


