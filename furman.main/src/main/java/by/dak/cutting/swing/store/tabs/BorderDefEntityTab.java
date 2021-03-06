/*
 * To change this template, choose Tools | Templates
 * and open the template in the draw.
 */

package by.dak.cutting.swing.store.tabs;

import by.dak.cutting.CuttingApp;
import by.dak.cutting.swing.BaseTabPanel;
import by.dak.persistence.entities.BorderDefEntity;
import by.dak.utils.validator.ValidatorAnnotationProcessor;
import com.jgoodies.validation.ValidationResult;
import org.jdesktop.application.Application;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.Bindings;

import java.beans.Beans;

/**
 * Tab of the TabCtrl for borderDefEntity entity
 *
 * @author Rudak Alexei
 */
public class BorderDefEntityTab extends BaseTabPanel<BorderDefEntity>
{
    private ResourceMap resourceMap = Application.getInstance(
            CuttingApp.class).getContext().getResourceMap(BorderDefEntityTab.class);
    private final String regExpNumeric = "\\d*";

    /**
     * Creates new form BorderDefEntityTab
     */
    public BorderDefEntityTab(BorderDefEntity borderDef)
    {
        setValue(borderDef);
        initComponents();
        initEnvironment();
    }

    private void initEnvironment()
    {
        if (!Beans.isDesignTime())
        {
            fieldHeight.setMask(regExpNumeric);
            fieldThickness.setMask(regExpNumeric);
            initBinding();
        }
    }

    @Override
    public ValidationResult validateGui()
    {
        return ValidatorAnnotationProcessor.getProcessor().validate(getValue());
    }

    private void initBinding()
    {
        Binding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, getValue(), BeanProperty
                .create("name"), fieldName, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        getBindingGroup().addBinding(binding);

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, getValue(), BeanProperty
                .create("height"), fieldHeight, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        getBindingGroup().addBinding(binding);

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, getValue(), BeanProperty
                .create("thickness"), fieldThickness, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        getBindingGroup().addBinding(binding);

        getBindingGroup().bind();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <draw-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        labelName = new javax.swing.JLabel();
        labelHeight = new javax.swing.JLabel();
        labelThickness = new javax.swing.JLabel();
        fieldName = new by.dak.cutting.swing.component.MaskTextField();
        fieldHeight = new by.dak.cutting.swing.component.MaskTextField();
        fieldThickness = new by.dak.cutting.swing.component.MaskTextField();

        setName("Form"); // NOI18N

        labelName.setText(resourceMap.getString("labelName.text")); // NOI18N
        labelName.setName("labelName"); // NOI18N

        labelHeight.setText(resourceMap.getString("labelHeight.text")); // NOI18N
        labelHeight.setName("labelHeight"); // NOI18N

        labelThickness.setText(resourceMap.getString("labelThickness.text")); // NOI18N
        labelThickness.setName("labelThickness"); // NOI18N

        fieldName.setText(resourceMap.getString("fieldName.text")); // NOI18N
        fieldName.setName("fieldName"); // NOI18N

        fieldHeight.setText(resourceMap.getString("fieldHeight.text")); // NOI18N
        fieldHeight.setName("fieldHeight"); // NOI18N

        fieldThickness.setText(resourceMap.getString("fieldThickness.text")); // NOI18N
        fieldThickness.setName("fieldThickness"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelHeight)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelThickness)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldThickness, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{labelHeight, labelName, labelThickness});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelName)
                                        .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelHeight)
                                        .addComponent(fieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelThickness)
                                        .addComponent(fieldThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{labelHeight, labelName, labelThickness});

    }// </draw-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private by.dak.cutting.swing.component.MaskTextField fieldHeight;
    private by.dak.cutting.swing.component.MaskTextField fieldName;
    private by.dak.cutting.swing.component.MaskTextField fieldThickness;
    private javax.swing.JLabel labelHeight;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelThickness;
    // End of variables declaration//GEN-END:variables
}
