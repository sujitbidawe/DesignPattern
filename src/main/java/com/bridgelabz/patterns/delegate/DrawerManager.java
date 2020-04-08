package com.bridgelabz.patterns.delegate;

public class DrawerManager {

    DashBoard dashBoard;

    public DrawerManager(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
    }

    public void init() {
        initDrawerViews();
        renderDrawer();
    }

    private static void renderDrawer() {
        System.out.println("Drawing render");
    }

    private static void initDrawerViews() {
        System.out.println("Drawer views is initialized");
    }

}
