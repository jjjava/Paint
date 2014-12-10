/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.sandbox;

/**
 *
 * @author hudson.sales
 */
import java.awt.Graphics;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Paint extends Applet implements MouseMotionListener {

    int width, height;
    Image backbuffer;
    Graphics backg;

    @Override
    public void init() {
        width = 800;
        height = 600;

        backbuffer = createImage(width, height);
        backg = backbuffer.getGraphics();
        backg.setColor(Color.white);
        backg.fillRect(0, 0, width, height);
        backg.setColor(Color.red);

//        backbuffer = createImage(width, height);
//        backg = backbuffer.getGraphics();
//        backg.setColor(Color.white);
//        backg.fillRect(0, 0, width, height);
//        backg.setColor(Color.blue);

        addMouseMotionListener(this);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        backg.fillOval(x - 10, y - 10, 10, 10);
        repaint();
        e.consume();
    }

    @Override
    public void update(Graphics g) {
        g.drawImage(backbuffer, 0, 0, this);
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }
}
