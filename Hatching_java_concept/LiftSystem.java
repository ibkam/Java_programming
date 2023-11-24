package ibkamcodes;

import java.util.Scanner;

class Lift {
    private int currentFloor;
    private int capacity;

    public Lift(int capacity) {
        this.currentFloor = 1;
        this.capacity = capacity;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return capacity == 0;
    }

    public void move(int destinationFloor) {
        System.out.println("Lift moving from floor " + currentFloor + " to floor " + destinationFloor);
        currentFloor = destinationFloor;
    }

    public void allocate() {
        if (!isFull()) {
            System.out.println("Lift allocated. Current floor: " + currentFloor);
            capacity--;
        } else {
            System.out.println("Lift is full. Please wait for the next available lift.");
        }
    }
}

public class LiftSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create six lifts
        Lift[] lifts = new Lift[6];
        for (int i = 0; i < lifts.length; i++) {
        	lifts[i] = new Lift(12);
        }

        // User input
        System.out.print("Enter the desired floor: ");
        int desiredFloor = scanner.nextInt();

        // Loop through lifts to find an empty one
        boolean liftAllocated = false;
        for (Lift lift : lifts) {
            if (!lift.isFull()) {
                lift.move(desiredFloor);
                lift.allocate();
                liftAllocated = true;
                break;
            }
        }
            if (!liftAllocated) {
            	for (Lift lift : lifts) {
            		if (!lift.isFull()) {
            			System.out.println("All lifts are full. Please wait for an available lift.");
            			liftAllocated = true;
                        break;
            		}
            	}
            }

        // If no empty lift is found
        if (!liftAllocated) {
            System.out.println("All lifts are full. Please wait for an available lift.");
        }
    }
}


