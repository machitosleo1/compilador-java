/*
 * 
 * La clase Real es para los números de punto flotante:
 * 
 */
package analizadorLexico;

/**
 *
 * @author KBP
 */
public class Real extends Token {

    public final float valor;

    public Real(float v) {
        super(Etiqueta.REAL);
        valor = v;
    }

    public String toString() {
        return "" + valor;
    }

}
