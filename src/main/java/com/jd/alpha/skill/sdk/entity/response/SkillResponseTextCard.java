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

package com.jd.alpha.skill.sdk.entity.response;

import com.jd.alpha.skill.sdk.constant.ResponseCardTypeConstants;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillResponseTextCard extends SkillResponseCard {

    @Builder.Default
    private String type = ResponseCardTypeConstants.TEXT;
    /**
     * 标题
     */
    private String title;
    /**
     * 文字内容显示
     */
    private String content;


}
