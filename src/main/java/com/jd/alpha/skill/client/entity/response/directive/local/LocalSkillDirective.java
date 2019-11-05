package com.jd.alpha.skill.client.entity.response.directive.local;

import com.jd.alpha.skill.client.entity.response.directive.SimpleDirective;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 类描�?
 *
 * @author <b>作�?�：</b> D.Yang（cdyangyang18@jd.com�? <br/>
 * <b>时间�?</b> 2017/11/29 17:24 <br/>
 * <b>Copyright (c)</b> 2018 京东智能-版权�?�? <br/>
 */
@Getter
@Setter
@ToString
@Builder
public class LocalSkillDirective extends SimpleDirective {

    public static final String TYPE = "LocalSkill";
    private String applicationName;
    private String intent;
    private String result;

    public LocalSkillDirective() {
        super();
        super.setType(TYPE);
    }

    private LocalSkillDirective(String applicationName, String intent, String result) {
        this();
        this.applicationName = applicationName;
        this.intent = intent;
        this.result = result;
    }

}