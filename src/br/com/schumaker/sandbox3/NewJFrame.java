package br.com.schumaker.sandbox3;

/**
 *
 * @author hudson schumaker
 */
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        this.setSize(800, 600);
        hsCanvas1.setWH(this.getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hsCanvas1 = new br.com.schumaker.sandbox3.HsCanvas();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemSaveAs = new javax.swing.JMenuItem();
        jMenuItemPrint = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemUndo = new javax.swing.JMenuItem();
        jMenuItemReDo = new javax.swing.JMenuItem();
        jMenuItemColor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(hsCanvas1, java.awt.BorderLayout.CENTER);

        jMenuFile.setText("File");

        jMenuItemOpen.setText("Abrir");
        jMenuFile.add(jMenuItemOpen);

        jMenuItemSave.setText("Salvar");
        jMenuFile.add(jMenuItemSave);

        jMenuItemSaveAs.setText("Salvar como...");
        jMenuFile.add(jMenuItemSaveAs);

        jMenuItemPrint.setText("Imprimir");
        jMenuFile.add(jMenuItemPrint);

        jMenuItemExit.setText("Sair");
        jMenuFile.add(jMenuItemExit);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Editar");

        jMenuItemUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.META_MASK));
        jMenuItemUndo.setText("Desfazer");
        jMenuItemUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUndoActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemUndo);

        jMenuItemReDo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.META_MASK));
        jMenuItemReDo.setText("Refazer");
        jMenuItemReDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReDoActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemReDo);

        jMenuItemColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        jMenuItemColor.setText("Cor");
        jMenuItemColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColorActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemColor);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemColorActionPerformed

    private void jMenuItemReDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemReDoActionPerformed

    private void jMenuItemUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUndoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemUndoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                laf();
                new NewJFrame().setVisible(true);
            }
        });
    }

    private static void laf() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.schumaker.sandbox3.HsCanvas hsCanvas1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemColor;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemOpen;
    private javax.swing.JMenuItem jMenuItemPrint;
    private javax.swing.JMenuItem jMenuItemReDo;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenuItem jMenuItemSaveAs;
    private javax.swing.JMenuItem jMenuItemUndo;
    // End of variables declaration//GEN-END:variables
}
