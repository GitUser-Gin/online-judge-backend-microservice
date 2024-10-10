package com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.Impl;

import com.adrian.model.codesandbox.ExecuteCodeRequest;
import com.adrian.model.codesandbox.ExecuteCodeResponse;
import com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.CodeSandbox;

/*
 * Date: 2024/9/27 21:25
 * Author: Adrian
 * Version: 1.0
 * Description: 第三方代码沙箱(调用网上现成的代码沙箱)
 * */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
