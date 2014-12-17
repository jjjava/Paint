package br.com.schumaker.sandbox5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author hudson schumaker
 * @version 1.1.0
 */
public class HsCanvas extends JPanel implements MouseMotionListener {

//    private Graphics gfx;
    private BufferedImage backBuffer;
    private Color color;

    public HsCanvas() {
        super.addMouseMotionListener(this);
        setBackground(Color.white);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        //   gfx = getGraphics();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(backBuffer, 0, 0, this);
        backBuffer = (BufferedImage) (this.createImage(this.getWidth(), this.getHeight()));
        //  gfx = backBuffer.createGraphics();
        // gfx.setColor(Color.BLUE);
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        this.getGraphics().fillOval(x - 10, y - 10, 10, 10);

        backBuffer = (BufferedImage) createImage(this.getWidth(), this.getHeight());
     //   gfx = this.getGraphics();

        //repaint();
        me.consume();
    }

    @Override
    public void repaint() {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    private void formComponentResized(java.awt.event.ComponentEvent evt) {
        System.err.println("sssss");
        getGraphics().drawImage(backBuffer, 0, 0, this);
    }
}
