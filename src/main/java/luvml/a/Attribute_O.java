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

import luvml.o.Out_I;

/**
 *
 * @author
 */
public final class Attribute_O extends Attribute_Am{
    private final String v;

    public Attribute_O(String n, String v) {
        super(AttributeDefinition_O.named(n));
        this.v = v;
    }

    public String getValue() {
        return v;
    }
    
    public static Attribute_I attribute(String n,String v){
        return new Attribute_O(n, v);
    }
    
    public static Attribute_I __(String n,String v){
        return attribute(n, v);
    }

    @Override
    public void valueTo(Out_I o) {
        o.__(v); 
    }

}
