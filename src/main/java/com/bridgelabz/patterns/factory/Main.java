package com.bridgelabz.patterns.factory;

public class Main {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        BaseOS mojave = osFactory.getOS(OSFactory.OS.MAC_OS, "MOJAVE");
        BaseOS highSierra = osFactory.getOS(OSFactory.OS.MAC_OS, "HIGH SIERRA");
        System.out.println(mojave.getName());
        System.out.println(highSierra.getName());
        BaseOS windowos = osFactory.getOS(OSFactory.OS.WINDOWS_OS, "WINDOWS 10");
        System.out.println(windowos.getName());
        BaseOS linuxos = osFactory.getOS(OSFactory.OS.LINUX_OS, "LINUX 16.4");
        System.out.println(linuxos.getName());
    }
}
