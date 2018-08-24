package com.zoushiyou.model.core;

import com.zoushiyou.model.base.BaseModel;

/**
 * 定时任务类
 */
public class QuartzJob extends BaseModel {
    /**
     * 任务分组
     */
    private String jobGroup;
    /**
     * 任务状态
     */
    private Integer jobStatus;
    /**
     * 任务表达式
     */
    private String jobCron;

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobCron() {
        return jobCron;
    }

    public void setJobCron(String jobCron) {
        this.jobCron = jobCron;
    }
}
