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

/**
 *
 * @author
 */
public class AttributeDefinition_O implements AttributeDefinition_I{
    private final String name;
    private final boolean hasQuotes,hasEqualSign,hasValue;

    public AttributeDefinition_O(String name, boolean hasQuotes, boolean hasEqualSign, boolean hasValue) {
        this.name = name;
        this.hasQuotes = hasQuotes;
        this.hasEqualSign = hasEqualSign;
        this.hasValue = hasValue;
    }
    
    public static AttributeDefinition_O named(String name){
        return new AttributeDefinition_O(name, true, true, true);
    }
    
    public static AttributeNullValued null_valued(String name){
        return new AttributeNullValued(name);
    }
    
    @Override
    public boolean hasQuotes() { return true; }

    @Override
    public boolean hasEqualSign()  { return true; }

    @Override
    public boolean hasValue()  { return true; }

    @Override
    public String attributeName()  { return name; }
    
}
