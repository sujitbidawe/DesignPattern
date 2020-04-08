package com.bridgelabz.patterns.delegate;

public class BottomBarManager {

    DashBoard dashBoard;

    public BottomBarManager(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
    }
    public void init() {
        initBottomBar();
        renderBottomBar();
    }

    private static void initBottomBar() {
        System.out.println("Bottom bar is initialized");
    }

    private static void renderBottomBar() {
        System.out.println("Bottom bar is rendered");
    }
}
