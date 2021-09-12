package com.aramit.soapse;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LocalWS {
    @WebMethod
    public Message getMessage(Message name ) {
        Message message = new Message();
        message.setText("Hello, "+ name.getText());
        return message;
    }

}
