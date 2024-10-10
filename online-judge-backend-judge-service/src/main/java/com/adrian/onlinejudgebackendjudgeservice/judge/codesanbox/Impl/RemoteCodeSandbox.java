package com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.Impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.adrian.model.codesandbox.ExecuteCodeRequest;
import com.adrian.model.codesandbox.ExecuteCodeResponse;
import com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.CodeSandbox;
import com.andrian.common.common.ErrorCode;
import com.andrian.common.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;

/*
 * Date: 2024/9/27 21:25
 * Author: Adrian
 * Version: 1.0
 * Description: 远程代码沙箱(实际调用接口的沙箱)
 * */
public class RemoteCodeSandbox implements CodeSandbox {

    // 定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKey";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://192.168.6.110:8090/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REMOTE_ERROR, "executeCode remoteSandbox error, message = " + responseStr);
        }

        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
