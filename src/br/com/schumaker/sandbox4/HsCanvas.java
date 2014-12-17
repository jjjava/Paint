package br.com.schumaker.sandbox4;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author hudson schumaker
 */
public class HsCanvas extends Canvas implements MouseMotionListener {

    private Graphics gfx;
    private Image backbuffer;
    private Color color;

    private static final HsCanvas INSTANCE = new HsCanvas();

    private HsCanvas() {
        gfx = getGraphics();
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        addMouseMotionListener(this);
    }

    public static HsCanvas getInstance() {
        return INSTANCE;
    }

    public void setWH(Dimension d) {
        this.setSize(d);
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        this.getGraphics().fillOval(x - 10, y - 10, 10, 10);

        backbuffer = createImage(this.getWidth(), this.getHeight());
        gfx = backbuffer.getGraphics();

        repaint();
        me.consume();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    @Override
    public void update(Graphics g) {
        gfx.drawImage(backbuffer, 0, 0, this);
    }

    @Override
    public void paint(Graphics g) {
        update(gfx);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
