package br.com.schumaker.sandbox4;

import java.awt.Color;
import java.awt.Image;

/**
 * @author Hudson Schumaker
 * @version 1.1.2
 * @since 11/09/2014 Usando Memento
 */
public class ImageStateCare {

    private Image backbuffer;
    private Color color;

    public ImageStateCare() {
    }

    public ImageStateCare(Image backbuffer) {
        this.backbuffer = backbuffer;
    }

    public ImageStateCare(Image backbuffer, Color color) {
        this.backbuffer = backbuffer;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setFont(Color color) {
        this.color = color;
    }

    public Image getBackbuffer() {
        return backbuffer;
    }

    public void setBackbuffer(Image backbuffer) {
        this.backbuffer = backbuffer;
    }
}
