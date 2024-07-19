package com.anil.draw_worker.domain.service.jobs;

import com.anil.draw_worker.domain.service.impl.DrawService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CreateDrawsJob implements Job {

    @Autowired
    DrawService drawService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("Job ** {} ** fired @ {}", jobExecutionContext.getJobDetail().getKey().getName(), jobExecutionContext.getFireTime());
        drawService.createDraws();
        log.info("Next job -> {}", jobExecutionContext.getNextFireTime());
    }
}
