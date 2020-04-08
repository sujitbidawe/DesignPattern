package com.bridgelabz.patterns.factory;

public class MacOS extends BaseOS {

    public MacOS(String version) {
        super(version);
    }

    @Override
    public String getName() {
        return "MacOS " + version;
    }
}
