package com.jd.alpha.skill.client.ssml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jd.alpha.skill.client.ssml.element.AudioElement;
import com.jd.alpha.skill.client.ssml.element.BackgroundElement;
import com.jd.alpha.skill.client.ssml.element.BreakElement;
import com.jd.alpha.skill.client.ssml.element.SayAsElement;
import com.jd.alpha.skill.client.ssml.element.SayAsElement.SAYAS_TYPE;
import com.jd.alpha.skill.client.ssml.element.SimpleTextElement;
import com.jd.alpha.skill.client.ssml.element.SubElement;
import com.jd.alpha.skill.client.ssml.element.VoiceElement;
import com.jd.alpha.skill.client.ssml.element.VoiceElement.VOICE_NAME;

public class SSMTest {

    public static void main(String[] args) throws Exception {
        AudioElement node = new AudioElement("http://storage.jd.local/background-voice/background.wav");

        BackgroundElement background = new BackgroundElement("http://storage.jd.local/background-voice/background.wav",
                "背景旁白");

        DefaultSSMLText ssmlText = new DefaultSSMLText();
        ssmlText.addSSMLNode(new SimpleTextElement("第一句"));
        ssmlText.addSSMLNode(background);
        ssmlText.addSSMLNode(new SimpleTextElement("第二句"));
        ssmlText.addSSMLNode(node);
        ssmlText.addSSMLNode(new SimpleTextElement("第三句"));

        ssmlText.addSSMLNode(new SayAsElement(SAYAS_TYPE.tel, "138"));

        ssmlText.addSSMLNode(new SimpleTextElement("开始停顿两秒"));
        ssmlText.addSSMLNode(new BreakElement(2));

        ssmlText.addSSMLNode(new SubElement("哈哈", "haha"));

        ssmlText.addSSMLNode(new VoiceElement(VOICE_NAME.binbin, "彬彬在说话"));
        ssmlText.addSSMLNode(new VoiceElement(VOICE_NAME.taotao, "桃桃在说话"));
        String str = ssmlText.toSSML();
        System.out.println(str);

        // Pattern pattern = Pattern.compile("src=\"(http[s]?://.*?)\" ");

        Pattern pattern = Pattern.compile("src=\"(http[s]?://.*?)\"");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {

            System.out.println(matcher.group(1));
        }

    }
}
