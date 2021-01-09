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

/**
 *
 * @author
 */
public class Key_O<V> implements Key_I<V> {
    private final String pKey;
    private final V defaultValue;

    public Key_O(String pKey, V defaultValue) {
        this.pKey = pKey;
        this.defaultValue = defaultValue;
    }
    
    public static <E,V> Key_O New(String pKey, V defaultValue) {
        return new Key_O(pKey, defaultValue);
    }
    
    @Override
    public String pKey() {
        return pKey;
    }

    @Override
    public V defaultValue() {
        return defaultValue;
    }
    
}
