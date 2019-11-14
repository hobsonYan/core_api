package com.hobson.api.config.context;

/**
 * @author yan hongbo
 * @date 2019/11/14 11:08
 * @description 用户信息
 */
public class ClientContext {

    private static final ThreadLocal<ClientInfo> clientInfo = new ThreadLocal<>();

    private ClientContext() {
    }

    public static ThreadLocal<ClientInfo> getClientInfo() {
        return clientInfo;
    }

}
