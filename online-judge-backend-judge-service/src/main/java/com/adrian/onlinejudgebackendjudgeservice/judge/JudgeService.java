package com.adrian.onlinejudgebackendjudgeservice.judge;

import com.adrian.model.entity.QuestionSubmit;

/*
 * Date: 2024/9/29 9:22
 * Author: Adrian
 * Version: 1.0
 * Description: 判题服务
 * */
public interface JudgeService {
    QuestionSubmit doJudge(long questionSubmitId);
}
