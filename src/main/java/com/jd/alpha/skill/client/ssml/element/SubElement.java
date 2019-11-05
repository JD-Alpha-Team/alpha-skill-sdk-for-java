package com.jd.alpha.skill.client.ssml.element;

public class SubElement implements ISSMLElement {

    private String alias;

    private String origin;

    public SubElement(String alias, String origin) {
        this.alias = alias;
        this.origin = origin;
    }

    public String getAlias() {
        return alias;
    }

    public String getOrigin() {
        return origin;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
