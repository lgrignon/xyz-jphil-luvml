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

import luvml.HtmlSegment_I;

/**
 *
 * @author
 */
public class E_Figure extends Element_m {
    public E_Figure() {
        super("figure");
    }
    public static E_Figure figure(){
        return new E_Figure();
    }
    public static E_Figure figure(HtmlSegment_I ... segments){
        return (E_Figure) new E_Figure().____(segments);
    }
}
