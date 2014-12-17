package br.com.schumaker.sandbox4;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 11/09/2014
 * Usando Memento
 */
public class Originator {

    private ImageStateCare estateImage;

    public void set(ImageStateCare estateImage) {
        this.estateImage = estateImage;
    }

    public ImageStateCare get() {
        return estateImage;
    }

    public BackBuffer saveToMemento() {
        return new BackBuffer(estateImage);
    }

    public void restoreFromMemento(BackBuffer back) {
        estateImage = back.getStateBack();
    }

    public static class BackBuffer {

        private final ImageStateCare stateBack;

        public BackBuffer(ImageStateCare stateBack) {
            this.stateBack = stateBack;
        }

        public ImageStateCare getStateBack() {
            return stateBack;
        }
    }
}
