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
import static luvml.e.N_Text.text;

/**
 *
 * @author
 */
public class E_P extends Element_m {
    public E_P() {
        super("p");
    }
    public static E_P p(){
        return new E_P();
    }
    public static E_P p(HtmlSegment_I ... segments){
        return (E_P) new E_P().____(segments);
    }
    public static E_P p(String text_value){
        return (E_P) new E_P().____(text(text_value));
    }
}
