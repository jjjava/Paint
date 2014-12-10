package br.com.schumaker.sandbox3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author hudson.sales
 */
public class HsCanvas extends Canvas implements MouseMotionListener {

    private Graphics backbuffer;

    public HsCanvas() {
        
        this.setBackground(Color.white);
        this.setForeground(Color.yellow);
        addMouseMotionListener(this);
    }
    public void setWH(Dimension d){
        this.setSize(d);
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        this.getGraphics().fillOval(x - 10, y - 10, 10, 10);
        repaint();
        me.consume();
    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

    @Override
    public void update(Graphics g) {
        // g.drawImage(backbuffer, 0, 0, this);
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }
}
