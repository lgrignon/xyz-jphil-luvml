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
package luvml.o;

import java.util.function.Consumer;

/**
 *
 * @author
 */
public final class Parameters<E> {
    /**
    * Refer : <a href="https://en.wikipedia.org/wiki/Polyglot_markup">Wikipedia: Polyglot markup</a>
    * if true makes Xml compatible html5 which is acceptable as valid Html 
    * as per https://validator.w3.org/nu/ ; example - <pre><img src="i.jpg"/></pre> .
    * if false makes html as per strict html standard ; example - <pre><img src="i.jpg"></pre> .
    * 
    * default false
    */
    public final boolean polyglotXHTML;
    public final Format format;
    public final int totalIntent;
    public final Consumer<E> extraParams;

    public static final boolean polyglotXHTML_default = true;
    public static final Format format_default = null;

    public static final int totalIntent_default = 0;

    public Parameters(ParametersBuilder<E> p) {
        this.polyglotXHTML = p.polyglotXHTML;
        this.format = p.format;
        this.totalIntent = p.totalIntent;
        this.extraParams = p.extraParams;
    }

    public Consumer<E> extraParams() { return extraParams; }

    public boolean isPolyglotXHTML() {
        return polyglotXHTML;
    }

}
