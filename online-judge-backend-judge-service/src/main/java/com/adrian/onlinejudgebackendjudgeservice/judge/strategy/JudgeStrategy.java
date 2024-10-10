package com.adrian.onlinejudgebackendjudgeservice.judge.strategy;

import com.adrian.model.codesandbox.JudgeInfo;

/*
 * Date: 2024/10/1 19:52
 * Author: Adrian
 * Version: 1.0
 * Description: 判题策略
 * */
public interface JudgeStrategy {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
