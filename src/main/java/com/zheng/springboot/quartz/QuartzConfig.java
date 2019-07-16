package com.zheng.springboot.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhenglian
 * @Date 2019/7/16
 */
@Configuration
public class QuartzConfig {
    
    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(TestTask.class).withIdentity("testTask").storeDurably().build();
    }
    
    @Bean
    public Trigger jobTrigger() {
        return TriggerBuilder.newTrigger().forJob(jobDetail())
                .withIdentity("testTask")
                .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
                .build();
    }
    
}
