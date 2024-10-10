package com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.Impl;

import com.adrian.model.codesandbox.ExecuteCodeRequest;
import com.adrian.model.codesandbox.ExecuteCodeResponse;
import com.adrian.model.codesandbox.JudgeInfo;
import com.adrian.model.enums.JudgeInfoMessageEnum;
import com.adrian.model.enums.QuestionSubmitStatusEnum;
import com.adrian.onlinejudgebackendjudgeservice.judge.codesanbox.CodeSandbox;

import java.util.List;

/*
 * Date: 2024/9/27 21:25
 * Author: Adrian
 * Version: 1.0
 * Description: 示例代码沙箱(仅为了跑通业务流程)
 * */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);

        return executeCodeResponse;
    }
}
