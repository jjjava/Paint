package br.com.schumaker.sandbox4;

/**
 *
 * @author hudson schumaker
 */
public class FrMain extends javax.swing.JFrame {

    private br.com.schumaker.sandbox4.HsCanvas hsCanvas;
    private javax.swing.JMenuBar jMenuBar;
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

    private static final FrMain INSTANCE = new FrMain();

    private FrMain() {
        super("HsPaint");
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.hsCanvas.setWH(this.getSize());
    }

    public static FrMain getInstance() {
        return INSTANCE;
    }

    private void jMenuItemColorActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItemReDoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItemUndoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void initComponents() {
        jMenuBar = new javax.swing.JMenuBar();
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
        jMenuBar.add(jMenuFile);
        jMenuEdit.setText("Editar");

        jMenuItemUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.META_MASK));
        jMenuItemUndo.setText("Desfazer");
        jMenuItemUndo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUndoActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemUndo);

        jMenuItemReDo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.META_MASK));
        jMenuItemReDo.setText("Refazer");
        jMenuItemReDo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReDoActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemReDo);

        jMenuItemColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        jMenuItemColor.setText("Cor");
        jMenuItemColor.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColorActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemColor);
        jMenuBar.add(jMenuEdit);
        setJMenuBar(jMenuBar);

        hsCanvas = HsCanvas.getInstance();
        getContentPane().add(hsCanvas, java.awt.BorderLayout.CENTER);
        pack();
    }
}
