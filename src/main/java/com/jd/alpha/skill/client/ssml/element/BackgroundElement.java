package com.jd.alpha.skill.client.ssml.element;

public class BackgroundElement implements ISSMLElement {

    public enum REPEAT_OPTION {
        yes, no
    }

    public enum VOLUME_OPTION {
        low, middle, high, max
    }

    private String src;

    private REPEAT_OPTION repeat;

    private double times;

    private String text;

    public BackgroundElement(String src, REPEAT_OPTION repeat, VOLUME_OPTION option, String text) {
        this.src = src;
        this.repeat = repeat;

        this.text = text;

        switch (option) {
            case low:
                this.times = 0.1f;
                break;
            case middle:
                this.times = 0.3f;
                break;
            case high:
                this.times = 0.7f;
                break;
            case max:
                this.times = 1.0f;
                break;
            default:
                this.times = 0.3f;
                break;
        }
    }

    public BackgroundElement(String src, String text) {
        this(src, REPEAT_OPTION.yes, VOLUME_OPTION.middle, text);

    }

    public String getSrc() {
        return src;
    }

    public REPEAT_OPTION getRepeat() {
        return repeat;
    }

    public double getTimes() {
        return times;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setRepeat(REPEAT_OPTION repeat) {
        this.repeat = repeat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
