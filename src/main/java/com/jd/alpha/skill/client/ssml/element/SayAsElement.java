package com.jd.alpha.skill.client.ssml.element;

public class SayAsElement implements ISSMLElement {

    public static enum SAYAS_TYPE {
        code, value, letter, tel, py
    }

    private SAYAS_TYPE type;

    private String text;

    public SayAsElement(SAYAS_TYPE type, String text) {
        this.text = text;
        this.type = type;
    }

    public SAYAS_TYPE getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public void setType(SAYAS_TYPE type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

}
