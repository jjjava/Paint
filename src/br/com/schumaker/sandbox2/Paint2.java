package br.com.schumaker.sandbox2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author hudson.sales
 */
public class Paint2 extends Canvas implements MouseMotionListener {

    private int width, height;

    public Paint2() {
        width = 800;
        height = 600;
        this.setSize(width, height);
        this.setBackground(Color.white);
        this.setForeground(Color.yellow);
        addMouseMotionListener(this);
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

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Paint2());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
