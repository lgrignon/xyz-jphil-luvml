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
public class E_Script extends Element_m {
    public E_Script() {
        super("script");
    }
    public static E_Script script(){
        return new E_Script();
    }
    public static E_Script script(HtmlSegment_I ... segments){
        return (E_Script) new E_Script().____(segments);
    }
    public static E_Script script(String script){
        return (E_Script) new E_Script().____(text(script));
    }
}
