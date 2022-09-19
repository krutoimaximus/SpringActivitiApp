package com.reunico.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class Generation implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        int userData = 20;
        int randomData = (int) (Math.random() * 100);

        delegateExecution.setVariable("userData", userData);
        delegateExecution.setVariable("randomData", randomData);
    }
}
