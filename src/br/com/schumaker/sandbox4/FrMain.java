package br.com.schumaker.sandbox4;

/**
 *
 * @author hudson schumaker
 */
public class FrMain extends javax.swing.JFrame {

    private br.com.schumaker.sandbox3.HsCanvas hsCanvas1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;

    public FrMain() {
        super("HsPaint");
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.hsCanvas1.setWH(this.getSize());
    }

    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuItem1.setText("Abrir");
        jMenu1.add(jMenuItem1);
        jMenuItem2.setText("Salvar");
        jMenu1.add(jMenuItem2);
        jMenuItem3.setText("Salvar como...");
        jMenu1.add(jMenuItem3);
        jMenuItem4.setText("Imprimir");
        jMenu1.add(jMenuItem4);
        jMenuItem5.setText("Sair");
        jMenu1.add(jMenuItem5);
        jMenuBar1.add(jMenu1);
        jMenu2.setText("Editar");
        jMenuItem6.setText("Desfazer");
        jMenu2.add(jMenuItem6);
        jMenuItem7.setText("Refazer");
        jMenu2.add(jMenuItem7);
        jMenuBar1.add(jMenu2);
        jMenuItem8.setText("Cor");
        jMenu2.add(jMenuItem8);
        setJMenuBar(jMenuBar1);

        hsCanvas1 = new br.com.schumaker.sandbox3.HsCanvas();
        getContentPane().add(hsCanvas1, java.awt.BorderLayout.CENTER);
        pack();
    }
}
