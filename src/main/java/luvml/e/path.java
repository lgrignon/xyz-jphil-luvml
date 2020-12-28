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

import luvml.a.A;
import luvml.o.Out_I;

/**
 *
 * @author
 */
public class path extends Element_m {
    public path() {
        super("path",false,true);
    }
    public static path __(){
        return new path();
    }
    public path d(String path){
        ____(A.__("d", path));
        return this;
    }

    @Override
    public void to(Out_I o) {
        
        super.to(o); //To change body of generated methods, choose Tools | Templates.
    }
    
}
