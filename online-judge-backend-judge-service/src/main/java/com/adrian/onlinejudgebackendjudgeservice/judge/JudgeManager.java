package com.adrian.onlinejudgebackendjudgeservice.judge;

import com.adrian.model.codesandbox.JudgeInfo;
import com.adrian.model.entity.QuestionSubmit;
import com.adrian.onlinejudgebackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.adrian.onlinejudgebackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.adrian.onlinejudgebackendjudgeservice.judge.strategy.JudgeContext;
import com.adrian.onlinejudgebackendjudgeservice.judge.strategy.JudgeStrategy;
import org.springframework.stereotype.Service;

/*
 * Date: 2024/10/2 10:11
 * Author: Adrian
 * Version: 1.0
 * Description: 判题管理,简化调用
 * */
@Service
public class JudgeManager {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
