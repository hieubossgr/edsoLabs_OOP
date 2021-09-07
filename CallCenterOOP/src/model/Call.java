/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author hieub
 */
public class Call implements Serializable{
    private int callid;
    private int callType;
    private int channelid;
    private int conversationType;
    public static int sCallId = 1000;

    public Call() {
        callid = sCallId++;
    }

    public Call(int callid, int channelid, int callType, int conversationType) {
        this.callid = callid;
        this.channelid = channelid;
        this.callType = callType;
        this.conversationType = conversationType;
    }

    public static int getsCallId() {
        return sCallId;
    }

    public static void setsCallId(int sCallId) {
        Call.sCallId = sCallId;
    }
    
    public int getCallid() {
        return callid;
    }

    public void setCallid(int callid) {
        this.callid = callid;
    }

    public int getCallType() {
        return callType;
    }

    public void setCallType(int callType) {
        this.callType = callType;
    }

    public int getChannelid() {
        return channelid;
    }

    public void setChannelid(int channelid) {
        this.channelid = channelid;
    }

    public int getConversationType() {
        return conversationType;
    }

    public void setConversationType(int conversationType) {
        this.conversationType = conversationType;
    }
    
    public Object[] toObject() {
        return new Object[]{
            callid, channelid, callType, conversationType 
        };
    }
    
    
    
    
}