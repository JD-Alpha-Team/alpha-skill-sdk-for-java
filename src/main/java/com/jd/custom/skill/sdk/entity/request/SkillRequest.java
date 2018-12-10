/*
 * Copyright 2018. JD.COM Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jd.custom.skill.sdk.entity.request;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillRequest {

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

}