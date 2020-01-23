package com.company;

import java.util.ArrayList;

public class House<windows> {
    //region properties
    private Window window;
    private Door door;
    private Key key;
    private ArrayList<Window> windows;
    private ArrayList<Door> doors;
    //endregion

    //region Methods
    public void lockTheHouseByKey(Key key) {
        System.out.println("The house was locked by key");
    }

    public void printQuantityOfWindows() {
        System.out.println("Quality of windows is " + windows.size());
    }

    public void printQuantityOfDoors() {
        System.out.println("Quality of doors is " + doors.size());
    }
    //endregion

    //region  Constructors
    public House() {
    }

    public House(Window window, Door door, Key key, ArrayList<Window> windows, ArrayList<Door> doors) {
        this.window = window;
        this.door = door;
        this.key = key;
        this.windows = windows;
        this.doors = doors;
    }

    //endregion

    //region Getters Setters

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
    //endregion

    //region toString equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (window != null ? !window.equals(house.window) : house.window != null) return false;
        if (door != null ? !door.equals(house.door) : house.door != null) return false;
        if (key != null ? !key.equals(house.key) : house.key != null) return false;
        if (windows != null ? !windows.equals(house.windows) : house.windows != null) return false;
        return doors != null ? doors.equals(house.doors) : house.doors == null;
    }

    @Override
    public int hashCode() {
        int result = window != null ? window.hashCode() : 0;
        result = 31 * result + (door != null ? door.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (windows != null ? windows.hashCode() : 0);
        result = 31 * result + (doors != null ? doors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "window=" + window +
                ", door=" + door +
                ", key=" + key +
                ", windows=" + windows +
                ", doors=" + doors +
                '}';
    }
//endregion
}
