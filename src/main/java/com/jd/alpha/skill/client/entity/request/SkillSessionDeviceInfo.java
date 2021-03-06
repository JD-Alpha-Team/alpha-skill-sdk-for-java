package com.jd.alpha.skill.client.entity.request;

import lombok.*;

/**
 * Skill Session 设备信息
 *
 * @author <b>作者：</b> D.Yang（cdyangyang18@jd.com） <br/>
 * <b>时间：</b> 2017/11/29 16:05 <br/>
 * <b>Copyright (c)</b> 2018 京东智能-版权所有 <br/>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillSessionDeviceInfo {

    /**
     * 设备Id
     */
    private String deviceId;
    /**
     * 设备支持媒体；VideoPlayer和ScreenDisplay 必须为有屏设备
     */
    private String[] supportedMedias;

}
