package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        House house = new House();
        Key key = new Key();
        ArrayList<Window> windows = new ArrayList<>();
        ArrayList<Door> doors = new ArrayList<>();
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        windows.add(window1);
        windows.add(window2);
        windows.add(window3);
        Door door1 = new Door();
        Door door2 = new Door();
        Door door3 = new Door();
        Door door4 = new Door();
        doors.add(door1);
        doors.add(door1);
        doors.add(door1);
        doors.add(door1);
        house.setDoors(doors);
        house.setWindows(windows);
        house.lockTheHouseByKey(key);
        house.printQuantityOfWindows();
        house.printQuantityOfDoors();
    }
}
