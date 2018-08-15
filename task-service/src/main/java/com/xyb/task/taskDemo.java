package com.xyb.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * 系统自动执行job
 *
 * @author 陈旭东
 * @version v.0.1
 * @date
 */
@Component
@EnableScheduling
public class taskDemo implements SchedulingConfigurer {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        Runnable task = () -> {
            //任务逻辑代码部分.
            log.info("AutoXxxxTask task is running ... " + new Date());
            autoAppraise();
        };

        Trigger trigger = triggerContext -> {
            String cron = "0/59 * * * * *";
//            if (configService == null) {
//                cron = "0/59 * * * * *";
//            } else {
//                cron = configService.getAutoXxxxTaskCron();
//            }
//            if (U.isBlank(cron)) {
//                // 如果没有, 给一个默认值.
//                cron = "0/59 * * * * *";
//            }

            log.info("AutoXxxxTask cron change to:" + cron);

            //任务触发，可修改任务的执行周期.
            return new CronTrigger(cron).nextExecutionTime(triggerContext);
        };
        taskRegistrar.addTriggerTask(task, trigger);
    }

    private void autoAppraise() {
//        LogUtil.recordTime();

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            Integer minCount = 0 ; // configService.getAutoAppraiseLong();
            calendar.add(Calendar.MINUTE, minCount == null ? -21600 : -minCount);
            Date dt1 = calendar.getTime();

            Integer count = 0 ; // 写具体逻辑函数
//            Integer count = baseOrderItemAppraiseService.systemOrderAppraise(dt1);
            if (count > 0) {
//                LogUtil.ROOT_LOG.info("自动Xxxx成功");
            }
        } catch (Exception e) {
//            if (LogUtil.ROOT_LOG.isErrorEnabled()) {
//                LogUtil.ROOT_LOG.error("自动异常", e);
//            }
        }

//        if (LogUtil.ROOT_LOG.isInfoEnabled()) {
//            LogUtil.ROOT_LOG.info("自动操作完成");
//        }
//        LogUtil.unbind();
    }
}