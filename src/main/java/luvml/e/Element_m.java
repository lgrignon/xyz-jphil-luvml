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
package luvml.e;

import luvml.HtmlSegmentType_E;
import luvml.HtmlSegment_I;
import luvml.a.Attribute_I;
import luvml.o.Out_I;
import java.util.ArrayList;
import static luvml.HtmlSegmentType_E.*;
import luvml.a.AttributeDefinition_I;
import luvml.a.clss;

/**
 *
 * @author
 */
public class Element_m implements Node_I, Element_I {
    private final ArrayList<Attribute_I> attributes
            = new ArrayList<>();
    private final ArrayList<Node_I> children
            = new ArrayList<>();
    private final String tag;
    private final boolean selfClosingHtml;
    private final boolean strictXml;

    public Element_m(String tag) {
        this(tag, false);
    }

    public Element_m(String tag, boolean selfClosingHtml) {
        this(tag, selfClosingHtml, false);
    }
    
    public Element_m(String tag, boolean selfClosingHtml, boolean strictXml) {
        this.tag = tag;
        this.selfClosingHtml = selfClosingHtml;
        this.strictXml = strictXml;
        if(selfClosingHtml&&strictXml){
            throw new UnsupportedOperationException("An element cannot be both, self closing html and a strict xml");
        }
        if(tag==null)throw new NullPointerException("Tag cannot be null");
    }
    
    public Element_m ____(HtmlSegment_I ... segments){
        if(segments==null)return this;
        for (int i = 0; i < segments.length; i++) {
            HtmlSegment_I seg = segments[i];
            if(seg==null){
                throw new IllegalArgumentException("there is a corrupt null segment ");
            }
            HtmlSegmentType_E t = seg.type();
            if(t==null){
                throw new IllegalArgumentException("there is a corrupt segment of null type "+seg);
            }            
            // intentionally no type checking, to keep things predictable in jsweet
            // no use switch, we do not know how well JSweet supports it
            if(t.equals(Attribute)){
                addAttribute((Attribute_I)seg);
            }else if(
                t.equals(Element) || t.equals(Text) 
                    || t.equals(Comment) || t.equals(NodeFragment)
            ){
                if(selfClosingHtml)
                    throw new IllegalArgumentException("self closing html cannot have children of any type");
                children.add((Node_I)seg);
            }else if(t.equals(DocType)){
                throw new IllegalArgumentException("DocType is a root element, not allowed as a child.");
            }else {
                throw new IllegalStateException("Unknown segment type "+t);
            }
        }
        return this;
    }
    
    private void addAttribute(Attribute_I toAdd){
        String n = toAdd.definition().attributeName();
        if(n==null || n.length()==0){
            return;
        }
        Attribute_I previouslyExisting = null;
        for (int a_idx = 0; a_idx < attributes.size(); a_idx++) {
            Attribute_I a_i = attributes.get(a_idx);
            if(a_i!=null && a_i.definition()!=null){
                if(n.equals(a_i.definition().attributeName())){
                    previouslyExisting = a_i;
                    break;
                }
            }
        }
        if(previouslyExisting!=null){
            // if it is a proper clss type
            // append to existing (without duplicates)
            if(previouslyExisting instanceof clss || toAdd instanceof clss){
                ((clss)previouslyExisting).__(((clss)toAdd));
                return;
            }else  {
                // replace (remove+add)
                attributes.remove(previouslyExisting);
            }
        }
        attributes.add(toAdd);
    }
    
    @Override public final HtmlSegmentType_E type() {
        return HtmlSegmentType_E.Element;
    }

    @Override public final boolean isSelfClosingHtml() {
        return selfClosingHtml;
    }
    
    @Override public final boolean isStrictXml() {
        return strictXml;
    }

    public final ArrayList<Attribute_I> attributes() {
        return attributes;
    }
    
    public final ArrayList<Node_I> children() {
        if(selfClosingHtml)
            throw new UnsupportedOperationException(
                    tag+" is self closing and does not support children");
        return children;
    }
    
    public final Attribute_I attribute(String name){
        if(name==null)return null;
        for (int a_idx = 0; a_idx < attributes.size(); a_idx++) {
            Attribute_I a_i = attributes.get(a_idx);
            if(a_i==null || a_i.definition()==null)continue;
            if(name.equals(a_i.definition().attributeName()))
                return a_i;
        }
        return null;
    }
    
    public final Attribute_I attribute_(AttributeDefinition_I adi){
        if(adi==null)return null;
        return attribute(adi.attributeName());
    }

    @Override
    public final String tagName() {
        return tag;
    }

    @Override
    public void to(Out_I o) {
        o.__("<");
        o.__(tag);
        for (int a_idx = 0; a_idx < attributes.size(); a_idx++) {
            Attribute_I a_i = attributes.get(a_idx);
            a_i.to(o);
        }
        if(children.size()==0){
            if(selfClosingHtml && !o.parameters().isPolyglotXHTML()){
                o.__(">");
            }else {
                o.__("/>");
            }
            o.nL();
            return;
        }
        o.nL();
        for (int e_idx = 0; e_idx < children.size(); e_idx++) {
            Node_I e_i = children.get(e_idx);
            e_i.to(o.child());
        }
        o.__("</");
        o.__(tag);
        o.__(">");
        o.nL();
    }
    
    
}
