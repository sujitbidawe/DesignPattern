package com.bridgelabz.patterns.factory;

public class LinuxOS extends BaseOS {
    public LinuxOS(String version) {
        super(version);
    }

    @Override
    public String getName() {
        return "Linux " + version;
    }
}
