package com.jd.alpha.skill.client.ssml.element;

public class VoiceElement implements ISSMLElement {

    public static enum VOICE_NAME {
        taotao, binbin
    }

    private VOICE_NAME name;

    private String text;

    public VoiceElement(VOICE_NAME name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public VOICE_NAME getName() {
        return name;
    }

    public void setName(VOICE_NAME name) {
        this.name = name;
    }
}
