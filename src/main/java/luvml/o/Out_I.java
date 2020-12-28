package luvml.o;

import java.util.function.Consumer;

/**
 *
 * @author Ivan Velikanova
 */
public interface Out_I {
    Out_I __(String s);
    /**
     * inserts newline
     * @return this
     */
    Out_I nL();
    
    Out_I child();
    Out_I parent();
    Parameters parameters();
    
    Out_I _b(byte b);
    Out_I ba(byte[]b);
}
