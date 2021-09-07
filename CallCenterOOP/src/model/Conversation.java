/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author hieub
 */
public class Conversation implements Serializable{
    private int conversationId;
    private List<Call> callList;
    public static int sConversationId = 100;

    public Conversation() {
        conversationId = sConversationId++;
    }

    public Conversation(int conversationId, List<Call> callList) {
        this.conversationId = conversationId;
        this.callList = callList;
    }
    
    public static int getSConversationId() {
        return sConversationId;
    }
    
    public static void setSConversationId(int sConversationId) {
        Conversation.sConversationId = sConversationId;
    }

    public int getConversationId() {
        return conversationId;
    }

    public void setConversationId(int conversationId) {
        this.conversationId = conversationId;
    }

    public List<Call> getCallList() {
        return callList;
    }

    public void setCallList(List<Call> callList) {
        this.callList = callList;
    }
    
    public Object[] toObject(int index) {
        return new Object[]{
            conversationId, callList.get(index).getCallid(),
            callList.get(index).getChannelid(), callList.get(index).getCallType(), 
            callList.get(index).getConversationType()
        };
    }
}