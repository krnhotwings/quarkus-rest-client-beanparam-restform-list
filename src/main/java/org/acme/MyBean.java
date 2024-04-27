package org.acme;

import java.util.List;

import org.jboss.resteasy.reactive.RestForm;

public class MyBean {
    @RestForm List<String> params;

    public void setParams(final List<String> params) {
        this.params = params;
    }
}
