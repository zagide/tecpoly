package com.zagi.droolsserver;

import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsMain {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kc = kieServices.newKieClasspathContainer();
        KieSession session = kc.newKieSession("ksession1");

        Applicant applicant = new Applicant();
        applicant.setName("华仔");
        applicant.setAge(17);
        applicant.setValid(true);
        session.insert(applicant);
        session.fireAllRules();
        session.dispose();

        System.out.println(applicant.toString());
    }
}
