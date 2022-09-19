package com.reunico.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class Generation implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        int userData = (int) delegateExecution.getVariable("userData");
        int randomData = (int) (Math.random() * 100);
        String resultStatus;
        boolean taskResult = false;

        if ((userData + randomData) < 100) {
            taskResult = true;
            resultStatus = "Task_1";
        } else {
            resultStatus = "Task_2";
        }

        delegateExecution.setVariable("randomData", randomData);
        delegateExecution.setVariable("resultStatus", resultStatus);
        delegateExecution.setVariable("taskResult", taskResult);
    }
}
