package com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox;

import com.adrian.model.codesandbox.ExecuteCodeRequest;
import com.adrian.model.codesandbox.ExecuteCodeResponse;

/*
 * Date: 2024/9/27 21:08
 * Author: Adrian
 * Version: 1.0
 * Description: 代码沙箱接口定义
 * */
public interface CodeSandbox {
    /**
     * 执行提交的代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
