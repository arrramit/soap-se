package com.aramit.soapse;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LocalWS {
    @WebMethod
    public String getString(String name) {
        return "Hello" + name;
    }

}
