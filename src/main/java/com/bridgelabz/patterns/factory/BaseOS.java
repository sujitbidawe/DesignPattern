package com.bridgelabz.patterns.factory;

public abstract class BaseOS {
    String version;

    public abstract String getName();

    public BaseOS(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
