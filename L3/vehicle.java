package exe3;

class Car {
    private String type;
    private int no_seats;
    private String fuel;
    private String body_color;

    Car() {
        type = "";
        no_seats = 0;
        fuel = "";
        body_color = "";
    }

    Car(String type, int seats, String fuel, String body_color) {
        this.type = type;
        this.no_seats = seats;
        this.fuel = fuel;
        this.body_color = body_color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoSeats() {
        return no_seats;
    }

    public void setNoSeats(int no_seats) {
        this.no_seats = no_seats;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getBodyColor() {
        return body_color;
    }

    public void setBodyColor(String body_color) {
        this.body_color = body_color;
    }
}

public class vehicle {
    public static void main(String[] args) {
        Car car1 = new Car("Your favorite car", 4, "Gasoline", "Red");
        Car car2 = new Car();

        System.out.print("Car 1 Type: " + car1.getType());
        System.out.print("Car 1 Seats: " + car1.getNoSeats());
        System.out.print("Car 1 Fuel: " + car1.getFuel());
        System.out.print("Car 1 Body Color: " + car1.getBodyColor());

        car2.setType("Another Car");
        car2.setNoSeats(5);
        car2.setFuel("Electric");
        car2.setBodyColor("Blue");

        System.out.print("Car 2 Type: " + car2.getType());
        System.out.print("Car 2 Seats: " + car2.getNoSeats());
        System.out.print("Car 2 Fuel: " + car2.getFuel());
        System.out.print("Car 2 Body Color: " + car2.getBodyColor());

        compareSeats(car1, car2);
    }

    public static void compareSeats(Car car1, Car car2) {
        if (car1.getNoSeats() > car2.getNoSeats()) {
            System.out.print("Car 1 has more passenger seats.");
        } else if (car1.getNoSeats() < car2.getNoSeats()) {
            System.out.print("Car 2 has more passenger seats.");
        } else { 
        	 System.out.print("bOTH CARS HAVE THE SAME NUMBER OF PASSENGER SEETS");
        }
    }}
