package com.jd.alpha.skill.client.ssml.element;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AudioElement implements ISSMLElement {
    private String src;

    public AudioElement(String src) {
        this.src = src;
    }
}
