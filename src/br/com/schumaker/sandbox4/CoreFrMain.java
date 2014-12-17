package br.com.schumaker.sandbox4;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;

/**
 *
 * @author hudson schumaker
 */
public class CoreFrMain {

    public static Color paiterColor;
    private static final CoreFrMain INSTANCE = new CoreFrMain();
    private final ArrayList<Originator.BackBuffer> state;
    private final Originator originator;
    private int k;

    private CoreFrMain() {
        state = new ArrayList<>();
        originator = new Originator();
        k = 0;
        paiterColor = Color.black;
    }

    public static CoreFrMain getInstance() {
        return INSTANCE;
    }

    public void controlZ() {
        k--;
        if (k >= 0) {
            originator.restoreFromMemento(state.get(k));
            HsCanvas.getInstance().setColor(originator.get().getColor());
            HsCanvas.getInstance().setBackBuffer(originator.get().getBackbuffer());
        } else {
            k = 0;
        }
    }

    public void controlY() {
        k++;
        if (k < state.size()) {
            originator.restoreFromMemento(state.get(k));
            HsCanvas.getInstance().setColor(originator.get().getColor());
            HsCanvas.getInstance().setBackBuffer(originator.get().getBackbuffer());

        } else {
            k = state.size() - 1;
        }
    }

    public void setColor() {
        paiterColor = JColorChooser.showDialog(null, "Choose Background Color", paiterColor);
        if (paiterColor != null) {
            HsCanvas.getInstance().setColor(paiterColor);
        }
    }

    public void keep() {
        originator.set(new ImageStateCare(HsCanvas.getInstance().getBackBuffer(), HsCanvas.getInstance().getColor()));
        state.add(originator.saveToMemento());
        k = state.size();
    }

    public static void exit() {
        System.exit(0);
    }
}
