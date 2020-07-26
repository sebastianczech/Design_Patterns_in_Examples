package com.sebastianczech.adapter;

public class AuthenicationAdapter {

    private final AuthenicationServiceLegacy authenicationServiceLegacy;

    public AuthenicationAdapter(AuthenicationServiceLegacy authenicationServiceLegacy) {
        this.authenicationServiceLegacy = authenicationServiceLegacy;
    }

    public boolean authenticateUsingOnlyOneParam(AuthenicationServiceBeta authenicationServiceBeta) {
        authenicationServiceLegacy.setPassword(authenicationServiceBeta.getToken());
        return authenicationServiceLegacy.authenticate(authenicationServiceBeta.getToken());
    }

}
