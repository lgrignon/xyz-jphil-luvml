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
public class Format {
    public static final byte[]NEWLINE_UNIX = new byte[]{(byte)'\n'};
    public static final byte[]NEWLINE_WINDOWS = new byte[]{(byte)'\r',(byte)'\n'};
    public static final byte[]NEWLINE_NULL = null;

    public final byte intentChar;
    public final int childIntent;
    public final byte[]newLine;

    public static final byte intentChar_default = (byte)' ';
    public static final int childIntent_default = 0;
    public static final byte[]newLine_default = NEWLINE_NULL;

    public Format(FormatBuilder fb) {
        this.intentChar = fb.intentChar;
        this.childIntent = fb.childIntent;
        this.newLine = fb.newLine;
    }
}