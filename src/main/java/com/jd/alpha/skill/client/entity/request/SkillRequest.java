package com.jd.alpha.skill.client.entity.request;

import java.util.Map;

import lombok.*;

/**
 * Skill Request
 *
 * @author <b>作者：</b> D.Yang（cdyangyang18@jd.com） <br/>
 * <b>时间：</b> 2017/11/29 15:40 <br/>
 * <b>Copyright (c)</b> 2018 京东智能-版权所有 <br/>
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class SkillRequest {

    public SkillRequest() {

    }

    public SkillRequest(String requestId, String type) {
        this.requestId = requestId;
        this.type = type;
        this.timestamp=System.currentTimeMillis();
    }

    public SkillRequest(String requestId, String text, String type) {
        this.requestId = requestId;
        this.type = type;
        this.text = text;
        this.dialogState = "STARTED";
        this.timestamp=System.currentTimeMillis();
    }

    /**
     * 请求编号
     */
    private String requestId;

    /**
     * 请求类型
     */
    private String type;

    /**
     * 请求时间戳
     */
    private Long timestamp;

    /**
     * 对话状态
     */
    private String dialogState;

    /**
     * 意图信息
     */
    private SkillRequestIntent intent;

    /**
     * DefaultIntent时返回的用户原始话语
     */
    private String original;

    /**
     * 当前音频的token
     */
    private String token;

    /**
     * 当前音频的播放时间点
     */
    private long offsetInMilliseconds;

    /**
     * 失败原因
     */
    private SkillRequestReason reason;

    private String text;

    private Map<String, String> map;
}