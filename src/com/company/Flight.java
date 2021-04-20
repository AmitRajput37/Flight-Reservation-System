package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public Flight(Flight flight){
        this.flightNumber =flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;
    }

    public String getFlightDetails(){
        return "flight number: "+this.flightNumber+"Airline: "+this.airline+"capacity: "+this.capacity+"Booked seats: "
                +this.bookedSeats;
    }

    public boolean checkAvailability(){
        return this.capacity <= this.bookedSeats;
    }

    public void incrementBookingCounter(){
        int bookingCounter = 0;
        for(int i=0;i<=this.capacity;i++){
            bookingCounter++;
        }
    }


}
