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

import luvml.HtmlSegmentType_E;
import luvml.HtmlSegment_I;
import luvml.___F;
import luvml.o.Out_I;

/**
 *
 * @author
 */
public final class Comment_Css_or_Script implements ___F {
    private final ___F[]comments; // allow lazy

    public Comment_Css_or_Script(___F ... comments) {
        this.comments = comments;
    }
    
    public static Comment_Css_or_Script ___(final String s){
        return __((___F)o->o.__(s));
    }
    
    public static Comment_Css_or_Script __(___F ... c){
        return new Comment_Css_or_Script(c);
    }

    @Override
    public void to(Out_I o) {
        o.__("/* ");
        for (int i = 0; i < comments.length; i++) {
            ___F comment_i = comments[i];
            comment_i.to(o);
        }
        o.__(" */");
    }
    
}
