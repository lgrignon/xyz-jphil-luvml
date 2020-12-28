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
import java.util.ArrayList;

/**
 *
 * @author
 */
public class clss extends Attribute_Am {
    public static final Attr
            DEFINITION = Attr.named("class");
    private final ArrayList<String> value = new ArrayList<>();

    public clss() {
        super(DEFINITION);
    }
    
    public void __(clss ... classes){
        for (int i = 0; i < classes.length; i++) {
            clss classes_i = classes[i];
            for (int j = 0; j < classes_i.value.size(); j++) {
                String clss_i_j = classes_i.value.get(j);
                addSingleClass(clss_i_j);
            }
        }
    }
    
    public void addClasses(String classes){
        String[]classes_sub = classes.split(" ");
        for (int i = 0; i < classes_sub.length; i++) {
            String classes_sub_i = classes_sub[i];
            addSingleClass(classes_sub_i);
        }
    }
    private void addSingleClass(String clss){
        for (int i = 0; i < value.size(); i++) {
            String class_i = value.get(i);
            if(class_i.equals(clss)){
                return;
            }
        }
        value.add(clss);
    }
    
    public void removeClasses(String classes){
        String[]classes_sub = classes.split(" ");
        for (int i = 0; i < classes_sub.length; i++) {
            String clss_i = value.get(i);
            removeSingleClass(clss_i);
        }
    }
    
    public void add(String ... classes){
        for (int i = 0; i < classes.length; i++) {
            String clss = classes[i];
            addSingleClass(clss);
        }
    }
    
    public void remove(String ... classes){
        for (int i = 0; i < classes.length; i++) {
            String clss = classes[i];
            removeSingleClass(clss);
        }
    }
    
    private void removeSingleClass(String clss){
        String toRemove = clss;
        for (int i = 0; i < value.size(); i++) {
            String class_i = value.get(i);
            if(class_i.equals(clss)){
                toRemove = class_i; // get extact object
                break;
            }
        }
        value.remove(toRemove);
    }
    
    public static clss __(String ... classes){
        final clss a = new clss();
        for (int v_i = 0; v_i < classes.length; v_i++) {
            String clss_v = classes[v_i];
            
        }
        return a;
    }
    
    @Override
    public void valueTo(Out_I o) {
        for (int i = 0; i < value.size(); i++) {
            String v_i = value.get(i);
            o.__(v_i);
            if(i<value.size()-1){
                o.__(" ");
            }
        }
    }
}
