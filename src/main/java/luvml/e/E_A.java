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
import luvml.a.A_Href;

/**
 *
 * @author
 */
public class E_A extends Element_m {
    public E_A() {
        super("a");
    }
    public static E_A a(){
        return new E_A();
    }
    public static E_A a(HtmlSegment_I ... segments){
        return (E_A) new E_A().____(segments);
    }
    public static E_A a_href(String href_v,HtmlSegment_I ... segments){
        return (E_A) new E_A().____(A_Href.href(href_v)).____(segments);
    }
}
