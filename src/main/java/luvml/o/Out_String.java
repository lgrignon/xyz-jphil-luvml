package luvml.o;

import java.util.function.Consumer;
import luvml.___F;

/**
 *
 * @author Ivan Velikanova
 */
public final class Out_String extends Out_A{
    public Out_String(){super();} // directly calling because of some inexplicable bug in js transpilation
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
    public static String asString(___F f){
        Out_String os = new Out_String();
        f.to(os);
        return os.render();
    }
    public static String asFormattedString(___F f){
        Out_String os = new Out_String();
        f.to(os);
        return os.render();
    }
    
}
