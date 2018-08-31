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

package com.jd.alpha.skill.sdk.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DeviceSupportedMediaConstants {
    /**
     * 音乐播放支持；有屏和无屏设备都支持
     */
    public static final String AUDIO_PLAYER = "AudioPlayer";
    /**
     * 必须为有屏设备，支持文字、图片显示和音影文件播放
     */
    public static final String VIDEO_PLAYER = "VideoPlayer";
    /**
     * 必须为有屏设备，支持简单文字和图片显示，如可以输出card
     */
    public static final String SCREEN_DISPLAY = "ScreenDisplay";
}
