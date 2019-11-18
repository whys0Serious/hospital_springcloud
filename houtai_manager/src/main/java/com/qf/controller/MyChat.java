package com.qf.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
@ServerEndpoint("/mychat")
public class MyChat {
    //用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<MyChat> webSocketSet = new CopyOnWriteArraySet<MyChat>();
    private Session session;
    @OnOpen
    public void string(Session session){
        this.session=session;
        webSocketSet.add(this);
        System.out.println("建立连接");
    }
    @OnMessage
    public void  stringg2(@RequestBody String user){
        for (MyChat chat : webSocketSet) {
            chat.session.getAsyncRemote().sendText(user);
        }
    }

}
