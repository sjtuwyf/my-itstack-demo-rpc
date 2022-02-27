package org.itstack.demo.rpc.network.msg;

/**
 * @author ssqswyf
 * @date 2022/2/27
 */
public class Response {

    private String requestId;
    private String param;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
