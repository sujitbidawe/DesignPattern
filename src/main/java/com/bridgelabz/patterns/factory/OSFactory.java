package com.bridgelabz.patterns.factory;

public class OSFactory {
    enum OS {MAC_OS, WINDOWS_OS, LINUX_OS}

    BaseOS getOS(OS os, String version) {
        switch (os) {
            case MAC_OS:
                return new MacOS(version);
            case WINDOWS_OS:
                return new WindowsOS(version);
            case LINUX_OS:
                return new LinuxOS(version);
        }
        return null;
    }
}
