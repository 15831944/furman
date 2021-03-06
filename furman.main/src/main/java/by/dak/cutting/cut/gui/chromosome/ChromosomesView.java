/*
 * ChromosomeView.java
 *
 * Created on 10. listopad 2006, 17:58
 */

package by.dak.cutting.cut.gui.chromosome;

import by.dak.cutting.cut.genetics.*;

import javax.swing.*;

/**
 * @author Peca
 */
public class ChromosomesView extends javax.swing.JPanel
{
    Chromosome[] chroma;

    /**
     * Creates new form ChromosomeView
     */
    public ChromosomesView()
    {
        initComponents();
    }

    public void setChromosomes(Chromosome[] chroma)
    {
        this.chroma = chroma;
        update();
    }

    public void update()
    {
        for (Chromosome chrom : chroma)
        {

            if (chrom instanceof SChromosome)
            {
                ChromosomeView view = new ChromosomeView();
                view.setChromosome(chrom);
                this.add(new JLabel("SChromosome:"));
                this.add(view);
            }
            else if (chrom instanceof RChromosome)
            {
                ChromosomeView view = new ChromosomeView();
                view.setChromosome(chrom);
                this.add(new JLabel("RChromosome:"));
                this.add(view);
            }
            else if (chrom instanceof GChromosome)
            {
                ChromosomeView view = new ChromosomeView();
                view.setChromosome(chrom);
                this.add(new JLabel("GChromosome:"));
                this.add(view);
            }
            else if (chrom instanceof GTreeChromosome)
            {
                ChromosomeView view = new ChromosomeView();
                view.setChromosome(chrom);
                this.add(new JLabel("GTreeChromosome:"));
                this.add(view);
            }
            else if (chrom instanceof NChromosome)
            {
                ChromosomeView view = new ChromosomeView();
                view.setChromosome(chrom);
                this.add(new JLabel("NChromosome:"));
                this.add(view);
            }
            else
            {
                ChromosomeView view = new ChromosomeView();
                view.setChromosome(chrom);
                this.add(new JLabel("Chromosome:"));
                this.add(view);
            }
        }
        //this.add()
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <draw-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

    }// </draw-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
