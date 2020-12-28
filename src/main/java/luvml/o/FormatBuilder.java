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

/**
 *
 * @author
 */
public class FormatBuilder {
    public byte intentChar = Format.intentChar_default;
    public int childIntent = Format.childIntent_default ;
    public byte[]newLine = Format.newLine_default ;

   public FormatBuilder modify(Format f) {
        if(f!=null){
            this.intentChar = f.intentChar;
            this.childIntent = f.childIntent;
            this.newLine = f.newLine;
        }
        return this;
    }

    public FormatBuilder childIntent(int childIntent) {
        this.childIntent = childIntent; return this;
    }
    public FormatBuilder intentChar(char intentChar) {
        return intentChar((int)intentChar);
    }
    public FormatBuilder intentChar(int intentChar) {
        this.intentChar = (byte)intentChar; return this;
    }
    public FormatBuilder singleTabIntent(){
        return intentChar('\t').childIntent(1);
    }
    public FormatBuilder spaceIntent(){
        return intentChar(' ').childIntent(4);
    }
    public FormatBuilder newLine_Windows(){
        newLine = Format.NEWLINE_WINDOWS;
        return this;
    }
    public FormatBuilder newLine_Unix(){
        newLine = Format.NEWLINE_UNIX;
        return this;
    }
    public FormatBuilder newLine_Null(){
        newLine = Format.NEWLINE_NULL;
        return this;
    }
    public FormatBuilder newLine(byte[]b){
        newLine = b;
        return this;
    }
    public Format build(){
        return new Format(this);
    }
}