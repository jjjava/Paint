package br.com.schumaker.sandbox4;

/**
 *
 * @author hudson schumaker
 */
public class CoreFrMain {
    
    private static final CoreFrMain INSTANCE = new CoreFrMain();
    
    private CoreFrMain(){
    }
    
    public static CoreFrMain getInstance(){
        return INSTANCE;
    }
}
