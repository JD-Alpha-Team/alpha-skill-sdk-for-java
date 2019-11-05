package com.jd.alpha.skill.client.ssml.element;

public class SimpleTextElement implements ISSMLElement {

    private String text;

    public SimpleTextElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
