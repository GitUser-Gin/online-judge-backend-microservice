package com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox;

import com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.Impl.ExampleCodeSandbox;
import com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.Impl.RemoteCodeSandbox;
import com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.Impl.ThirdPartyCodeSandbox;

/*
 * Date: 2024/9/27 21:48
 * Author: Adrian
 * Version: 1.0
 * Description: 代码沙箱工厂(根据字符串参数创建制定的代码沙箱实例)
 * */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱示例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
