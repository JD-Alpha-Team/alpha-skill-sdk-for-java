package com.jd.alpha.skill.client.entity.request;

import lombok.*;

/**
 * Skill Request
 *
 * @author <b>作者：</b> D.Yang（cdyangyang18@jd.com） <br/>
 * <b>时间：</b> 2018/04/03 17:50 <br/>
 * <b>Copyright (c)</b> 2018 京东智能-版权所有 <br/>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillRequestReason {

    private String type;

    private String message;

}
