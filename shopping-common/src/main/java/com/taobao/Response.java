package com.taobao;

import com.taobao.shoppingmodel.enu.ReturnCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Response<T> {
    private int rtnCode;

    private String rtnMsg;

    private T data;

    public Response(int rtnCode, String rtnMsg, T data) {
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
        this.data = data;
    }

    public Response(int rtnCode, String rtnMsg) {
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
    }

    public Response(int rtnCode) {
        this.rtnCode = rtnCode;
    }

    public Response(ReturnCode returnCode, T data) {
        this.rtnCode = returnCode.getRtnCode();
        this.rtnMsg = returnCode.getRtnMsg();
        this.data = data;
    }

    public Response(ReturnCode returnCode) {
        this.rtnCode = returnCode.getRtnCode();
        this.rtnMsg = returnCode.getRtnMsg();
    }
}
