package com.jd.alpha.skill.client.ssml;

import java.util.ArrayList;
import java.util.List;

import com.jd.alpha.skill.client.ssml.element.ISSMLElement;

public class DefaultSSMLText extends AbstractSSMLText {

    List<ISSMLElement> list = new ArrayList<ISSMLElement>();

    @Override
    public List<ISSMLElement> getList() {
        return list;
    }

    public void setList(List<ISSMLElement> list) {
        this.list = list;
    }

    public void addSSMLNode(ISSMLElement node) {
        list.add(node);
    }

    @Override
    public ISSMLTransformer getSSMLTransformer() throws Exception {
        return new SSMLTransformer();
    }

}
