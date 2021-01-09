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

import static luvml.a.Attribute_O.attribute;
import static luvml.e.N_Text.text;
/**
 *
 * @author
 */
public class E_Time extends Element_m {
    public E_Time() {
        super("time");
    }
    public static E_Time time(){
        return new E_Time();
    }
    public static E_Time datetime(String datetime, String caption){
        return (E_Time) new E_Time().____(
            attribute("datetime", datetime),
            text(caption)
        );
    }
}
