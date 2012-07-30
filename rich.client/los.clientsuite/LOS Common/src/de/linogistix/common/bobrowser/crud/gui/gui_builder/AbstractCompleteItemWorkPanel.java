package de.linogistix.common.bobrowser.crud.gui.gui_builder;

import de.linogistix.common.bobrowser.bo.BO;
import de.linogistix.common.res.CommonBundleResolver;

public abstract class AbstractCompleteItemWorkPanel extends javax.swing.JPanel {
    protected BO bo;

    public AbstractCompleteItemWorkPanel(BO bo){
        this.bo = bo;
        initComponents();
	initCompletionSuccessComboBox();
	//initLockComboBox();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        completionSuccessIntPanel = new javax.swing.JPanel();
        completionSuccessLabel = new javax.swing.JLabel();
        completionSuccessComboBox = new javax.swing.JComboBox();
        completionRemarksPanel = new javax.swing.JPanel();
        completionRemarksLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completionRemarksTextArea = new javax.swing.JTextPane();

        setPreferredSize(new java.awt.Dimension(300, 275));
        setLayout(new java.awt.BorderLayout());

        completionSuccessIntPanel.setLayout(new java.awt.GridBagLayout());

        completionSuccessLabel.setText(org.openide.util.NbBundle.getMessage(CommonBundleResolver.class, "complete")); // NOI18N
        completionSuccessLabel.setMaximumSize(new java.awt.Dimension(250, 22));
        completionSuccessLabel.setPreferredSize(new java.awt.Dimension(250, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        completionSuccessIntPanel.add(completionSuccessLabel, gridBagConstraints);

        completionSuccessComboBox.setPreferredSize(new java.awt.Dimension(250, 22));
        completionSuccessComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completionSuccessComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        completionSuccessIntPanel.add(completionSuccessComboBox, gridBagConstraints);

        add(completionSuccessIntPanel, java.awt.BorderLayout.NORTH);

        completionRemarksPanel.setLayout(new java.awt.BorderLayout());

        completionRemarksLabel.setText(org.openide.util.NbBundle.getMessage(CommonBundleResolver.class, "completeRemarks")); // NOI18N
        completionRemarksLabel.setMaximumSize(new java.awt.Dimension(250, 22));
        completionRemarksLabel.setPreferredSize(new java.awt.Dimension(250, 22));
        completionRemarksPanel.add(completionRemarksLabel, java.awt.BorderLayout.NORTH);

        completionRemarksTextArea.setMinimumSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(completionRemarksTextArea);

        completionRemarksPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(completionRemarksPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void completionSuccessComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completionSuccessComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completionSuccessComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel completionRemarksLabel;
    private javax.swing.JPanel completionRemarksPanel;
    protected javax.swing.JTextPane completionRemarksTextArea;
    protected javax.swing.JComboBox completionSuccessComboBox;
    private javax.swing.JPanel completionSuccessIntPanel;
    private javax.swing.JLabel completionSuccessLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public abstract void initCompletionSuccessComboBox();
    
    
    
}