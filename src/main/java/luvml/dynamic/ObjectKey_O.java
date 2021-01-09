/*
 * Copyright 2021 Ivan Velikanova ivan.velikanova@gmail.com .
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
package luvml.dynamic;

import java.util.function.Function;
import luvml.e.E_Title;

/**
 *
 * @author
 */
public class ObjectKey_O<E,V> extends Key_O<V> implements ObjectKey_I<E,V> {
    private final Class<E> classTemplate;

    public ObjectKey_O(String pKey, Class<E> classTemplate, V defaultValue) {
        super(pKey, defaultValue);
        this.classTemplate = classTemplate;
    }
    
    public static <E,V> ObjectKey_O New(String pKey, Class<E> classTemplate, V defaultValue) {
        return new ObjectKey_O(pKey, classTemplate, defaultValue);
    }
    
    public <V2> MappedObjectKey_O<E,V2> derive(Function<E, V2> mapValue, V2 defaultValue){
        return MappedObjectKey_O.NewFrom((ObjectKey_O)this, mapValue, defaultValue);
    }

    @Override
    public Class<E> classTemplate() {
        return classTemplate;
    }
    
}
