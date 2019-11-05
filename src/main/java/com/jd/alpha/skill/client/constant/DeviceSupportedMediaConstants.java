package com.jd.alpha.skill.client.constant;

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
