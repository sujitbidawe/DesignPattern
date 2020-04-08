package com.bridgelabz.patterns.factory;

public class WindowsOS extends BaseOS {
    public WindowsOS(String version) {
        super(version);
    }

    @Override
    public String getName() {
        return "WindowsOS " + version;
    }
}
