package com.vampire.service;

import com.vampire.eventall.CommonAppEvent;

/**
 * @ClassName : ExamineVerifyService
 * @Description : 更改这笔融资的状态服务
 * @Author : pw
 * @Date: 2020-09-30 15:35
 */
public interface ExamineVerifyService {
    void changeFinancState(CommonAppEvent event);
}
