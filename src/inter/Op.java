/*
 * clase Id es una hoja. La llamada super(id, p)
 * almacena a id y p en los campos heredados op y tipo, respectivamente. Elcampo desplazamiento
 * 
 */
package inter;

import analizadorLexico.*;
import simbolos.*;

public class Op extends Expr {

    public Op(Token tok, Tipo p) {
        super(tok, p);
    }

    public Expr reducir() {
        Expr x = gen();

        Temp t = new Temp(tipo);
        emitir(t.toString() + " = " + x.toString());
        return t;
    }
}
