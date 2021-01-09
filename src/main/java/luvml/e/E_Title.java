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
public class E_Title extends Element_m {
    public E_Title() {
        super("title");
    }
    public static E_Title title(){
        return new E_Title();
    }
    public static E_Title title(HtmlSegment_I ... segments){
        return (E_Title) new E_Title().____(segments);
    }
    public static E_Title title(String title_text){
        return (E_Title) new E_Title().____(text(title_text));
    }
}
