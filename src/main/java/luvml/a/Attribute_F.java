/*
 * Copyright 2020 Ivan Velikanova ivan.velikanova@gmail.com .
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
package luvml.a;

import luvml.___F;
import luvml.o.Out_I;

/**
 *
 * @author
 */
public final class Attribute_F extends Attribute_Am{
    private final ___F value;
    public Attribute_F(String key,___F value) {
        this(AttributeDefinition_O.named(key), value);
    }
    public Attribute_F(AttributeDefinition_I key,___F value) {
        super(key);
        this.value = value;
    }
    public static Attribute_F __(String key,___F value){
        return new Attribute_F(key, value);
    }
    @Override public void valueTo(Out_I o) {
        value.to(o);
    }    
}
