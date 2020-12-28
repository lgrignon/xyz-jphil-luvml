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
public class ParametersBuilder<E> {
    public boolean polyglotXHTML = Parameters.polyglotXHTML_default;
    Format format = Parameters.format_default;
    int totalIntent = Parameters.totalIntent_default;
    Consumer<E> extraParams = null;
    public ParametersBuilder<E> extraParams(Consumer<E> c){
        extraParams = c; return this;
    }
    public ParametersBuilder<E> polyglotXHTML(boolean polyglotXHTML) {
        this.polyglotXHTML = polyglotXHTML; return this;
    }
    public ParametersBuilder<E> unformated() {
        this.format = null;
        return this;
    }
    public ParametersBuilder<E> format(Format f) {
        this.format = f ; return this;
    }
    public ParametersBuilder<E> format(Consumer<FormatBuilder> cc) {
        FormatBuilder fb = new FormatBuilder();
        fb.modify(format);
        cc.accept(fb);
        this.format = fb.build();
        return this;
    }
    public ParametersBuilder<E> totalIntent(int totalIntent) {
        this.totalIntent = totalIntent;
        return this;
    }

    public ParametersBuilder<E> child(Parameters p){
        modify(p);
        totalIntent(totalIntent+p.format.childIntent);
        return this;
    }
    public ParametersBuilder<E> modify(Parameters p){
        this.polyglotXHTML = p.polyglotXHTML;
        this.format = p.format;
        this.totalIntent = p.totalIntent;
        return this;
    }
    public Parameters build(){
        return new Parameters(this);
    }
}