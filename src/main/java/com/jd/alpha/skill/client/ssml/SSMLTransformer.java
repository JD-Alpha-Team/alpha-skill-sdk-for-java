package com.jd.alpha.skill.client.ssml;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.jd.alpha.skill.client.ssml.element.AudioElement;
import com.jd.alpha.skill.client.ssml.element.BackgroundElement;
import com.jd.alpha.skill.client.ssml.element.BreakElement;
import com.jd.alpha.skill.client.ssml.element.ISSMLElement;
import com.jd.alpha.skill.client.ssml.element.SayAsElement;
import com.jd.alpha.skill.client.ssml.element.SimpleTextElement;
import com.jd.alpha.skill.client.ssml.element.SubElement;
import com.jd.alpha.skill.client.ssml.element.VoiceElement;

public class SSMLTransformer implements ISSMLTransformer {
    private static DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

    private DocumentBuilder builder;

    private Transformer transformer;

    protected SSMLTransformer() throws Exception {

        builder = documentBuilderFactory.newDocumentBuilder();
        transformer = TransformerFactory.newInstance().newTransformer();

    }

    public String toSSMLString(AbstractSSMLText ssmlText) throws Exception {

        StringBuffer buffer = new StringBuffer();
        buffer.append("<speak>");
        for (ISSMLElement node : ssmlText.getList()) {
            buffer.append(toSSMLString(node));
        }
        buffer.append("</speak>");
        return buffer.toString();
    }

    private String toSSMLString(ISSMLElement node) throws Exception {

        if (node instanceof SimpleTextElement) {
            return ((SimpleTextElement) node).getText();
        } else if (node instanceof AudioElement) {
            return toXmlString((AudioElement) node);
        } else if (node instanceof BackgroundElement) {
            return toXmlString((BackgroundElement) node);
        } else if (node instanceof VoiceElement) {
            return toXmlString((VoiceElement) node);
        } else if (node instanceof SubElement) {
            return toXmlString((SubElement) node);
        } else if (node instanceof SayAsElement) {
            return toXmlString((SayAsElement) node);
        } else if (node instanceof BreakElement) {
            return toXmlString((BreakElement) node);
        }
        return "";
    }

    private String toXmlString(AudioElement node) throws Exception {

        Document document = builder.newDocument();
        Element root = document.createElement("audio");
        root.setAttribute("src", node.getSrc());

        document.appendChild(root);

        // 创建转换工厂，然后将创建的document转换输出到文件中或控制台
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(stringWriter));

        String str = stringWriter.toString();

        return str.substring(str.indexOf("\"?>") + 3);

    }

    private String toXmlString(BackgroundElement node) throws Exception {

        Document document = builder.newDocument();
        Element root = document.createElement("background");
        root.setAttribute("src", node.getSrc());
        root.setAttribute("repeat", node.getRepeat().name());
        root.setAttribute("times", String.valueOf(node.getTimes()));
        root.setTextContent(node.getText());
        document.appendChild(root);

        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(stringWriter));

        String str = stringWriter.toString();

        return str.substring(str.indexOf("\"?>") + 3);

    }

    private String toXmlString(VoiceElement node) throws Exception {

        Document document = builder.newDocument();
        Element root = document.createElement("voice");
        root.setAttribute("name", node.getName().name());
        root.setTextContent(node.getText());
        document.appendChild(root);

        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(stringWriter));

        String str = stringWriter.toString();

        return str.substring(str.indexOf("\"?>") + 3);

    }

    private String toXmlString(SubElement node) throws Exception {

        Document document = builder.newDocument();
        Element root = document.createElement("sub");
        root.setAttribute("alias", node.getAlias());
        root.setTextContent(node.getOrigin());
        document.appendChild(root);

        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(stringWriter));

        String str = stringWriter.toString();

        return str.substring(str.indexOf("\"?>") + 3);

    }

    private String toXmlString(SayAsElement node) throws Exception {

        Document document = builder.newDocument();
        Element root = document.createElement("say-as");
        root.setAttribute("type", node.getType().name());
        root.setTextContent(node.getText());
        document.appendChild(root);

        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(stringWriter));

        String str = stringWriter.toString();

        return str.substring(str.indexOf("\"?>") + 3);

    }

    private String toXmlString(BreakElement node) throws Exception {

        Document document = builder.newDocument();
        Element root = document.createElement("break");
        root.setAttribute("time", "" + node.getTime());
        document.appendChild(root);

        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(stringWriter));

        String str = stringWriter.toString();

        return str.substring(str.indexOf("\"?>") + 3);

    }

}
