/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ATreePanel.java
 *
 * Created on 26.11.2009, 19:46:06
 */

package by.dak.swing.tree;

import by.dak.cutting.swing.DPanel;
import by.dak.cutting.swing.renderer.EntityTreeRenderer;
import org.jdesktop.swingx.JXTree;

/**
 * @author admin
 */
public class ATreePanel extends DPanel
{

    /**
     * Creates new form ATreePanel
     */
    public ATreePanel()
    {
        initComponents();
        initEnvironment();
    }

    private void initEnvironment()
    {
        jXTree1.setShowsRootHandles(false);
        jXTree1.setCellRenderer(new EntityTreeRenderer());

    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jideScrollPane1 = new com.jidesoft.swing.JideScrollPane();
        jXTree1 = new org.jdesktop.swingx.JXTree();
        jXTree1.setCellRenderer(new EntityTreeRenderer());
        jXTree1.setRootVisible(false);

        setName("Form"); // NOI18N

        jideScrollPane1.setName("jideScrollPane1"); // NOI18N

        jXTree1.setName("jXTree1"); // NOI18N
        jideScrollPane1.setViewportView(jXTree1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jideScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jideScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTree jXTree1;
    private com.jidesoft.swing.JideScrollPane jideScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JXTree getTree()
    {
        return jXTree1;
    }

}
