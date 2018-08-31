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

package com.jd.alpha.skill.sdk;

import com.jd.alpha.skill.sdk.constant.IntentTypeConstants;
import com.jd.alpha.skill.sdk.constant.RequestTypeConstants;
import com.jd.alpha.skill.sdk.entity.request.SkillData;
import com.jd.alpha.skill.sdk.entity.response.SkillResponse;

public abstract class RequestHandler {

    public SkillResponse handle(SkillData skillData) {
        try {
            if (!validate(skillData)) {
                return SkillResponse.builder().shouldEndSession(true).build();
            }

            if (skillData.getSession().isNew()) {
                onSessionStarted(skillData);
            }

            String requestType = skillData.getRequest().getType();

            switch (requestType) {
                case RequestTypeConstants.LAUNCH_REQUEST:
                    return onLaunchRequest(skillData);
                case RequestTypeConstants.INTENT_REQUEST:
                    return handleIntentRequest(skillData);
                case RequestTypeConstants.SESSION_END_REQUEST:
                    onSessionEndedRequest(skillData);
                    break;
                case RequestTypeConstants.AUDIO_PLAYER_PLAYBACK_STARTED:
                    return onAudioPlayerPlaybackStartedRequest(skillData);
                case RequestTypeConstants.AUDIO_PLAYER_PLAYBACK_FINISHED:
                    return onAudioPlayerPlaybackFinishedRequest(skillData);
                case RequestTypeConstants.AUDIO_PLAYER_PLAYBACK_STOPPED:
                    onAudioPlayerPlaybackStoppedRequest(skillData);
                    break;
                case RequestTypeConstants.AUDIO_PLAYER_PLAYBACK_NEARLY_FINISHED:
                    return onAudioPlayerPlaybackNearlyFinishedRequest(skillData);
                case RequestTypeConstants.AUDIO_PLAYER_PLAYBACK_FAILED:
                    return onAudioPlayerPlaybackFailedRequest(skillData);
                case RequestTypeConstants.PLAYBACK_CONTROLLER_NEXT_COMMAND:
                    return onPlaybackControllerNextCommand(skillData);
                case RequestTypeConstants.PLAYBACK_CONTROLLER_PAUSE_COMMAND:
                    return onPlaybackControllerPauseCommand(skillData);
                case RequestTypeConstants.PLAYBACK_CONTROLLER_PLAY_COMMAND:
                    return onPlaybackControllerPlayCommand(skillData);
                case RequestTypeConstants.PLAYBACK_CONTROLLER_PREVIOUS_COMMAND:
                    return onPlaybackControllerPreviousCommand(skillData);
                default:
                    defaultResponse(skillData);
            }
            return SkillResponse.builder().shouldEndSession(true).build();
        } catch (Exception e) {
            e.printStackTrace();
            return defaultResponse(skillData);
        }
    }

    public SkillResponse handleIntentRequest(SkillData skillData) {
        String intentName = skillData.getRequest().getIntent().getName();

        if (!intentName.startsWith("Alpha.")) {
            return onIntentRequest(skillData);
        }

        switch (intentName) {
            case IntentTypeConstants.CANCEL_INTENT:
                return onCancelIntent(skillData);
            case IntentTypeConstants.HELP_INTENT:
                return onHelpIntent(skillData);
            case IntentTypeConstants.NEXT_INTENT:
                return onNextIntent(skillData);
            case IntentTypeConstants.REPEAT_INTENT:
                return onRepeatIntent(skillData);
            case IntentTypeConstants.PREVIOUS_INTENT:
                return onPreviousIntent(skillData);
            case IntentTypeConstants.PAUSE_INTENT:
                return onPauseIntent(skillData);
            case IntentTypeConstants.RESUME_INTENT:
                return onResumeIntent(skillData);
            case IntentTypeConstants.LOOP_OFF_INTENT:
                return onLoopOffIntent(skillData);
            case IntentTypeConstants.LOOP_ON_INTENT:
                return onLoopOnIntent(skillData);
            case IntentTypeConstants.SHUFFLE_OFF_INTENT:
                return onShuffleOffIntent(skillData);
            case IntentTypeConstants.SHUFFLE_ON_INTENT:
                return onShuffleOnIntent(skillData);
            case IntentTypeConstants.START_OVER_INTENT:
                return onStartOverIntent(skillData);
            case IntentTypeConstants.DEFAULT_INTENT:
                return defaultResponse(skillData);
            default:
                return onOtherBuildInIntent(skillData);
        }
    }

    public boolean validate(SkillData skillData) {
        return true;
    }

    public void onSessionStarted(SkillData skillData) {

    }

    public abstract SkillResponse onLaunchRequest(SkillData skillData);

    public abstract SkillResponse onIntentRequest(SkillData skillData);

    public void onSessionEndedRequest(SkillData skillData) {

    }

    public SkillResponse onAudioPlayerPlaybackStartedRequest(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onAudioPlayerPlaybackFinishedRequest(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public void onAudioPlayerPlaybackStoppedRequest(SkillData skillData) {
    }

    public SkillResponse onAudioPlayerPlaybackNearlyFinishedRequest(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onAudioPlayerPlaybackFailedRequest(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onPlaybackControllerNextCommand(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onPlaybackControllerPauseCommand(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onPlaybackControllerPlayCommand(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onPlaybackControllerPreviousCommand(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public abstract SkillResponse onCancelIntent(SkillData skillData);

    public abstract SkillResponse onHelpIntent(SkillData skillData);

    public SkillResponse onNextIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onRepeatIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onPreviousIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onPauseIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onResumeIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onLoopOffIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onLoopOnIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onShuffleOffIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onShuffleOnIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onStartOverIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public SkillResponse onOtherBuildInIntent(SkillData skillData) {
        return SkillResponse.builder().shouldEndSession(true).build();
    }

    public abstract SkillResponse defaultResponse(SkillData skillData);

}
