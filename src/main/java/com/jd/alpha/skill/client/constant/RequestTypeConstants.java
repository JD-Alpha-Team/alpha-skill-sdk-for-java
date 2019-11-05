package com.jd.alpha.skill.client.constant;

import lombok.experimental.UtilityClass;

/**
 * 类描述
 *
 * @author <b>作者：</b> D.Yang（cdyangyang18@jd.com） <br/>
 * <b>时间：</b> 2018/1/31 10:38 <br/>
 * <b>Copyright (c)</b> 2018 京东智能-版权所有 <br/>
 */
@UtilityClass
public class RequestTypeConstants {
    // Default Request
    public static final String LAUNCH_REQUEST = "LaunchRequest";
    public static final String INTENT_REQUEST = "IntentRequest";
    public static final String SESSION_END_REQUEST = "SessionEndedRequest";

    // AudioPlayer Request
    public static final String AUDIO_PLAYER_PLAYBACK_STARTED = "AudioPlayer.PlaybackStarted";
    public static final String AUDIO_PLAYER_PLAYBACK_FINISHED = "AudioPlayer.PlaybackFinished";
    public static final String AUDIO_PLAYER_PLAYBACK_STOPPED = "AudioPlayer.PlaybackStopped";
    public static final String AUDIO_PLAYER_PLAYBACK_NEARLY_FINISHED = "AudioPlayer.PlaybackNearlyFinished";
    public static final String AUDIO_PLAYER_PLAYBACK_FAILED = "AudioPlayer.PlaybackFailed";

    // Playback Request
    public static final String PLAYBACK_CONTROLLER_NEXT_COMMAND="PlaybackController.NextCommandIssued";
    public static final String PLAYBACK_CONTROLLER_PAUSE_COMMAND="PlaybackController.PauseCommandIssued";
    public static final String PLAYBACK_CONTROLLER_PLAY_COMMAND="PlaybackController.PlayCommandIssued";
    public static final String PLAYBACK_CONTROLLER_PREVIOUS_COMMAND="PlaybackController.PreviousCommandIssued";

}
