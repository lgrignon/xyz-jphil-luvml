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
import luvml.e.Element_m;

/**
 *
 * @author
 */
public class h extends Element_m {
    public h(int _1_to_6) {
        super(htag(_1_to_6));
    }
    public static h __(int _1_to_6){
        return new h(_1_to_6);
    }
    public static h ___(int _1_to_6,HtmlSegment_I ... segments){
        return (h) new h(_1_to_6).____(segments);
    }
    private static String htag(int _1_to_6){
        switch (_1_to_6) {
            case 1:return "h1";
            case 2:return "h2";
            case 3:return "h3";
            case 4:return "h4";
            case 5:return "h5";
            case 6:return "h6";
            default:
                throw new AssertionError("h"+_1_to_6+" is not a standard element");
        }
    }
}
