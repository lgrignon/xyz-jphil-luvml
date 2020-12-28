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

import luvml.HtmlSegmentType_E;
import luvml.o.Out_I;

/**
 *
 * @author
 */
public abstract class Attribute_Am implements Attribute_I{
    private final AttributeDefinition_I d;
    public Attribute_Am(AttributeDefinition_I definition) {
        this.d = definition;
    }

    @Override public final HtmlSegmentType_E type() {
        return HtmlSegmentType_E.Attribute;
    }
    
    public abstract void valueTo(Out_I o);
    
    public Object getValue(){
        throw new UnsupportedOperationException();
    }
    
    @Override
    public AttributeDefinition_I definition() {
        return d;
    }

    @Override
    public final void to(Out_I o) {
                                o.__(" ");
                                o.__(d.attributeName());
        if(d.hasEqualSign())    o.__("=");
        if(d.hasQuotes())       o.__("\"");
        if(d.hasValue())        valueTo(o);
        if(d.hasQuotes())       o.__("\"");
    }
    
}
