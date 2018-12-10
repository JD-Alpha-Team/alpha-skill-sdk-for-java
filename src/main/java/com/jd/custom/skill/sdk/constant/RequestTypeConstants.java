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

package com.jd.custom.skill.sdk.constant;

import lombok.experimental.UtilityClass;

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
