package com.jd.alpha.skill.client.ssml;

public interface ISSMLTransformer {
    public String toSSMLString(AbstractSSMLText ssmlText) throws Exception;
}
