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

import java.util.ArrayList;
import luvml.HtmlSegmentType_E;
import luvml.HtmlSegment_I;
import luvml.o.Out_I;

/**
 * I am not sure if this is of any use.
 * @author
 */
public class NodeFragment implements NodeFragment_I  {
    private final ArrayList<Node_I> content
            = new ArrayList<>();

    @Override
    public HtmlSegmentType_E type() {
        return HtmlSegmentType_E.NodeFragment;
    }

    @Override
    public ArrayList<Node_I> getContent() {
        return content;
    }
    
    @Override
    public NodeFragment ___(Node_I ... segments){
        for (int i = 0; i < segments.length; i++) {
            Node_I segment = segments[i];
            content.add(segment);
        }
        return this;
    }
    
    /**
     * make sure to notice the difference between
     * the function signature (name) of static
     * and class member function
     * Otherwise you will add elements and think why it is not adding
     * @param segments
     * @return 
     */
    public static NodeFragment __(Node_I ... segments){
        NodeFragment fragment = new NodeFragment();
        fragment.___(segments);
        return fragment;
    }

    @Override
    public void to(Out_I o) {
        for (int i = 0; i < content.size(); i++) {
            HtmlSegment_I segment = content.get(i);
            if(segment!=null){
                segment.to(o);
            }else {
                o.__("<!-- null segment at index "+i+ " of this fragment -->").nL();
            }
        }
    }
}
