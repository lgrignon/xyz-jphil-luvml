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
import luvml.a.Attribute_O;

/**
 *
 * @author
 */
public class E_Svg extends Element_m {
    public E_Svg() {
        super("svg");
        ____(Attribute_O.__("xmlns", "http://www.w3.org/2000/svg"));
    }
    public static E_Svg svg(){
        return new E_Svg();
    }
    public static E_Svg svg(HtmlSegment_I ... segments){
        return (E_Svg) new E_Svg().____(segments);
    }
}
