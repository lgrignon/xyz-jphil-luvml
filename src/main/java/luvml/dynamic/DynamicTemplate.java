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

import java.util.HashMap;
import java.util.function.Function;
import luvml.Html5;

public final class DynamicTemplate {
    private final HashMap<String,Object> v = new HashMap<>();
    private Html5 html_5;
    public static DynamicTemplate wrap(Function<DynamicTemplate,Html5> html_5_d){
        DynamicTemplate dt = new DynamicTemplate();
        dt.html_5 = html_5_d.apply(dt);
        return dt;
    }
    public <E,V> V getMappedValue(MappedObjectKey_I<E,V> key){
        try{
            E val = (E)v.get(key.pKey());
            if(val==null)
                return key.defaultValue();
            return key.mapValue().apply(val);
        }catch(Exception a){
            return key.defaultValue();
        }
    }
    public <E> E getObject(ObjectKey_I<E,E> key){
        try{
            E val = (E)v.get(key.pKey());
            return val==null?key.defaultValue():val;
        }catch(Exception a){
            return key.defaultValue();
        }
    }
    protected Object get(String pKey,Object defaultValue){
        Object val = v.get(pKey);
        return val==null?defaultValue:val;
    }
    protected String getString(String pKey,String defaultValue){
        try{return (String)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    protected int getInteger(String pKey,int defaultValue){
        try{return (Integer)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    protected long getLong(String pKey,long defaultValue){
        try{return (Long)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    protected boolean getBoolean(String pKey,boolean defaultValue){
        try{return (Boolean)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    public void set(String pKey, Object value){
        v.put(pKey, value);
    }
    public void setString(String pKey, String value){
        set(pKey, value);
    }
    public void setNumber(String pKey, long value){
        set(pKey, value);
    }
    public void setBoolean(String pKey, boolean value){
        set(pKey, value);
    }
    public void clear(String pKey){
        v.remove(pKey);
    }
    public Html5 html_doc(){return html_5;}
}
