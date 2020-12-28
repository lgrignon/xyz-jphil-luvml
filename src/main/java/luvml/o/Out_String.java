package luvml.o;

import java.util.function.Consumer;

/**
 *
 * @author Ivan Velikanova
 */
public final class Out_String extends Out_A{
    public Out_String(){this(null);}
    public Out_String(Consumer<ParametersBuilder<Object>> ap){super(ap);}
    private String s = "";    
    @Override public Out_String __(String s) {
        this.s += s; return this;
    }
    public String render() {
        return s;
    }

    @Override public Out_String _b(byte b) {
        this.s += (char)b; return this;
    }

    @Override
    public Out_String ba(byte[] b) {
        this.s += new String(b/*,StandardCharsets.UTF_8*/); return this;
    }

    
}
