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

import luvml.a.Attribute_O;
import luvml.o.Out_I;

/**
 *
 * @author
 */
public class E_Path extends Element_m {
    public E_Path() {
        super("path",false,true);
    }
    public static E_Path path(){
        return new E_Path();
    }
    public E_Path path_d(String path){
        ____(Attribute_O.__("d", path));
        return this;
    }

    @Override
    public void to(Out_I o) {
        
        super.to(o); //To change body of generated methods, choose Tools | Templates.
    }
    
}
