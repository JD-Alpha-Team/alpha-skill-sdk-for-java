package com.jd.alpha.skill.client.ssml;

import java.util.List;

import com.jd.alpha.skill.client.ssml.element.ISSMLElement;

public abstract class AbstractSSMLText {

    public abstract List<ISSMLElement> getList();

    public abstract ISSMLTransformer getSSMLTransformer() throws Exception;

    public String toSSML() throws Exception {
        return getSSMLTransformer().toSSMLString(this);

    }
}
