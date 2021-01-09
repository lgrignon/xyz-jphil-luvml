/*
 * Copyright 2021 Ivan Velikanova ivan.velikanova@gmail.com .
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
public class AttributeNullValued implements Attribute_I, AttributeDefinition_I{
    private final String attribute_name;

    public AttributeNullValued(String attribute_name) {
        this.attribute_name = attribute_name;
    }
    
    public static AttributeNullValued attributeOnly(String attribute_name){
        return new AttributeNullValued(attribute_name);
    }
    
    @Override
    public AttributeDefinition_I definition() {
        return this;
    }

    @Override
    public HtmlSegmentType_E type() {
        return HtmlSegmentType_E.Attribute;
    }

    @Override
    public void to(Out_I o) {
        o.__(" ");o.__(attribute_name);
    }

    @Override
    public boolean hasQuotes() {
        return false;
    }

    @Override
    public boolean hasEqualSign() {
        return false;
    }

    @Override
    public boolean hasValue() {
        return false;
    }

    @Override
    public String attributeName() {
        return attribute_name;
    }
    
}
