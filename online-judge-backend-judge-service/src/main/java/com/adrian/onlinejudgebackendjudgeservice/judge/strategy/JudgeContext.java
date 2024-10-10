package com.adrian.onlinejudgebackendjudgeservice.judge.strategy;

import com.adrian.model.codesandbox.JudgeInfo;
import com.adrian.model.dto.question.JudgeCase;
import com.adrian.model.entity.Question;
import com.adrian.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/*
 * Date: 2024/10/1 19:52
 * Author: Adrian
 * Version: 1.0
 * Description: 上下文(用于定义在策略中传递的参数)
 * */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCasesList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
