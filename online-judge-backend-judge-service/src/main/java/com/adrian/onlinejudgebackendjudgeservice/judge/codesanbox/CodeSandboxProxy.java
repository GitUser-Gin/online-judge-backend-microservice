package com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox;

import com.adrian.model.codesandbox.ExecuteCodeRequest;
import com.adrian.model.codesandbox.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;

/*
 * Date: 2024/9/29 8:54
 * Author: Adrian
 * Version: 1.0
 * Description:
 * */
@Slf4j
public class CodeSandboxProxy implements CodeSandbox {

    private final CodeSandbox codeSandbox;

    public CodeSandboxProxy(CodeSandbox codeSandbox) {
        this.codeSandbox = codeSandbox;
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息:" + executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱响应信息:" + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
