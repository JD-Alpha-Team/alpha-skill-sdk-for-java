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
public class DirectiveTypeConstants {
    // AudioPlayer Directive
    public static final String AUDIO_PLAYER_PLAY = "AudioPlayer.Play";
    public static final String AUDIO_PLAYER_STOP = "AudioPlayer.Stop";
    public static final String AUDIO_PLAYER_CLEAR_QUEUE = "AudioPlayer.ClearQueue";

    // Dialog Directive
    public static final String DIALOG_DELEGATE = "Dialog.Delegate";
    public static final String DIALOG_ELICIT_SLOT = "Dialog.ElicitSlot";
    public static final String DIALOG_CONFIRM_SLOT = "Dialog.ConfirmSlot";
    public static final String DIALOG_CONFIRM_INTENT = "Dialog.ConfirmIntent";
}
