package com.bridgelabz.patterns.delegate;

import com.bridgelabz.pattern.observer.Data;

public class DashBoard {
    public static void main(String[] args) {

        DashBoard dashBoard = new DashBoard();
        dashBoard.init();

        BottomBarManager bottomManager = new BottomBarManager(dashBoard);
        DrawerManager drawerManager = new DrawerManager(dashBoard);
        ToolbarManager toolManager = new ToolbarManager(dashBoard);

        bottomManager.init();
        drawerManager.init();
        toolManager.init();
    }

    private void init() {
        initDashboardViews();
        fetchDashboardData();
    }

    private void fetchDashboardData() {
        System.out.println("Fetching Dashboard");
    }

    private void initDashboardViews() {
        System.out.println("Dashboard view is initialized");
    }

    public void onDataReceived(Data data) {
        System.out.println("Data Received :" + data.getMyData());
    }

}
