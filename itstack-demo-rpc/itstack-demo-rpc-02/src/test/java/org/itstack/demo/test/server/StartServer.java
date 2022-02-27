package org.itstack.demo.test.server;

import org.itstack.demo.rpc.network.server.ServerSocket;

/**
 * @author ssqswyf
 * @date 2022/2/27
 */
public class StartServer {

    public static void main(String[] args) {
        System.out.println("启动服务端开始");
        new Thread(new ServerSocket()).start();
        System.out.println("启动服务端完成");
    }

}
