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
package luvml;

import luvml.e.E_Html;
import luvml.o.Out_I;

/**
 *
 * @author
 */
public final class Html5 extends E_Html {
    public static Html5 html5(){
        return new Html5();
    }
    
    public static Html5 html5(HtmlSegment_I ... segments){
        Html5 html5_ = new Html5();
        html5_.____(segments);
        return html5_;
    }
    
    @Override
    public void to(Out_I o) {
        o.__("<!DOCTYPE html>").nL();
        super.to(o);
    }
    
}
