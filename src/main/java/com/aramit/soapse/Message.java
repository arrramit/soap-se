package com.aramit.soapse;

import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

public class Message {
    private String text;

    public Message() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
