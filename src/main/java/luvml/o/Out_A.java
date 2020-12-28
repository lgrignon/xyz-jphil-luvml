/*
 * Copyright 2020 Ivan Velikanova  ivan.velikanova@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package luvml.o;

import java.util.function.Consumer;

/**
 *
 * @author Ivan Velikanova  ivan.velikanova@gmail.com
 */
public abstract class Out_A<ExtraParams> implements Out_I{
    public final Parameters p;
    public Out_A(Consumer<ParametersBuilder<ExtraParams>> ap) {
        ParametersBuilder pb = new ParametersBuilder();
        if(ap!=null){ap.accept(pb);}
        p = pb.build();
    }
    @Override public Parameters parameters() { return p; }
    @Override public Out_I nL() {
        if(p.format!=null){
            if(p.format.newLine!=null){
                ba(p.format.newLine);
            }
            for (int i = 0; i < p.totalIntent; i++) {
                _b(p.format.intentChar);
            }
        }
        return this;
    }
    @Override public Out_A child(){
        final Out_A parent = this;
        if(p!=null && p.format!=null){
            return new ChildOut_IA(parent);
        }else return this;
    }
    @Override public Out_A parent(){
        return null;
    }
    public static final class ChildOut_IA extends Out_A<Object> {
        private final Out_A parent;
        public ChildOut_IA(Out_A parent) {
            super($->$.child(parent.p));
            this.parent = parent;
        }
        @Override public Out_I __(String s) { parent.__(s); return this; }
        @Override public Out_I ba(byte[] b) { return parent.ba(b); }
        @Override public Out_I _b(byte b) { return parent._b(b); }
        @Override public Out_A parent(){ return parent; }
    }
}
