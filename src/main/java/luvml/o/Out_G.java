package luvml.o;

import java.util.function.Consumer;

/**
 *
 * @author Ivan Velikanova
 */
public final class Out_G extends Out_A{
    private final GOut generic_output;
    
    public Out_G(GOut generic_output){
        this(generic_output,null);
    }
    
    public Out_G(GOut generic_output,Consumer<ParametersBuilder<Object>> ap){
        super(ap);
        this.generic_output = generic_output;
    }
 
    @Override public Out_G __(String s) {
        generic_output.__(s);
        return this;
    }

    @Override public Out_G _b(byte b) {
        generic_output.__( ((Character) ((char)b)).toString());
        return this;
    }

    @Override
    public Out_G ba(byte[] b) {
        generic_output.__(new String(b));// no UTF-8
        return this;
    }

    
}
