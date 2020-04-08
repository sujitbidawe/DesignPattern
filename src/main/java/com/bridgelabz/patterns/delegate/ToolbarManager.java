package com.bridgelabz.patterns.delegate;

public class ToolbarManager {

    DashBoard dashBoard;

    public ToolbarManager(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
    }

    public void init() {
        initToolbarViews();
        renderToolbar();
    }
    private static void initToolbarViews() {
        System.out.println("Toolbar is initialized");
    }

    private static void renderToolbar() {
        System.out.println("Toolbar is rendered");
    }
}
