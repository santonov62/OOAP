package com.santonov;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("... but he's stuck outside");
        System.out.println("\nFido starts barking...");
        System.out.println("... so Gina grabs the remote control.");
        remote.pressButton();
        System.out.println("\nFido's back inside...");
    }

}
