package br.com.schumaker.sandbox4;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author hudson schumaker
 */
public class CoreFrMain {

    public static Color paiterColor;

    private static final CoreFrMain INSTANCE = new CoreFrMain();

    private CoreFrMain() {
        paiterColor = Color.black;
    }

    public static CoreFrMain getInstance() {
        return INSTANCE;
    }

    public static void setColor() {
        paiterColor = JColorChooser.showDialog(null, "Choose Background Color", paiterColor);
        if (paiterColor != null) {
            HsCanvas.getInstance().setColor(paiterColor);
        }
    }

    public static void exit() {
        System.exit(0);
    }
}
