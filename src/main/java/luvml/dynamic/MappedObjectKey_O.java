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

/**
 *
 * @author
 */
public class MappedObjectKey_O<E,V> extends ObjectKey_O<E,V> implements MappedObjectKey_I<E,V> {
    private final Function<E, V> mapValue;

    public MappedObjectKey_O(String pKey, Class<E> classTemplate, Function<E, V> mapValue, V defaultValue) {
        super(pKey, classTemplate, defaultValue);
        this.mapValue = mapValue;
    }
    
    public static <E,V> MappedObjectKey_O<E,V> NewFrom(ObjectKey_I<E,E> base, Function<E, V> mapValue, V defaultValue){
        return new MappedObjectKey_O(base.pKey(), base.classTemplate(), mapValue, defaultValue);
    }
    
    public static <E,V> MappedObjectKey_O<E,V> New(String pKey, Class<E> classTemplate, Function<E, V> mapValue, V defaultValue) {
        return new MappedObjectKey_O(pKey, classTemplate, mapValue, defaultValue);
    }

    @Override
    public Function<E, V> mapValue() {
        return mapValue;
    }
    
}
