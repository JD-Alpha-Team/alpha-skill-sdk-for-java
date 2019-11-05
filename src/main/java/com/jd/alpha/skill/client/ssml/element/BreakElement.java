package com.jd.alpha.skill.client.ssml.element;

import com.jd.alpha.skill.client.ssml.exception.BreakTimeInvalidException;

public class BreakElement implements ISSMLElement {

    private double time;

    public BreakElement(double time) throws BreakTimeInvalidException {
        if (time > 10) {
            throw new BreakTimeInvalidException("break time is more than 10s");
        }
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

}
