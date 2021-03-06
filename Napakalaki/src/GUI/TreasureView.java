/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import napakalaki.Treasure;

/**
 *
 * @author Lenovo
 */
public class TreasureView extends javax.swing.JPanel {
    //Atributos
    private Treasure treasureModel;
    private boolean selected;
    
    //Setter
    public void setTreasure(Treasure aTreasure){
        treasureModel = aTreasure;
        this.name.setText(treasureModel.getName());
        this.bonus.setText(Integer.toString(treasureModel.getBonus()));
        this.type.setText(treasureModel.getType().toString());
        
        selected = false;
        repaint(); 
    }
    
    //Getter
    public boolean isSelected(){
        return selected;
    }
    
    public Treasure getTreasure(){
        return treasureModel;
    }
    
    
    /**
     * Creates new form TreasureView
     */
    public TreasureView() {
        initComponents();
        setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bonus = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        name = new javax.swing.JTextArea();

        setForeground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        bonus.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        bonus.setForeground(new java.awt.Color(0, 0, 0));
        bonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bonus.setLabelFor(bonus);
        bonus.setText("4");
        bonus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bonus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        type.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 0));
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("Bothhands");
        type.setBorder(null);

        name.setEditable(false);
        name.setBackground(new java.awt.Color(153, 153, 153));
        name.setColumns(200);
        name.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setLineWrap(true);
        name.setRows(2);
        name.setWrapStyleWord(true);
        name.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(name);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(this.isSelected()){
            selected = false;
            setBackground(Color.LIGHT_GRAY);
        }
        else{
            selected = true;
            setBackground(Color.RED);
        }
        
        repaint();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bonus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea name;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
