package br.com.ifpr.codes;

public class Flight {
    private String flightNumber;
    private String airplaneNumber;
    private String date;
    private String origin;
    private String destination;
    private Boolean isInternational;
    private int passangersCount;
    private Passenger[] vetPassengers = {};

    public Flight() {
        this.vetPassengers = new Passenger[20];
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneNumber() {
        return airplaneNumber;
    }

    public void setAirplaneNumber(String airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Boolean getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(Boolean isInternational) {
        this.isInternational = isInternational;
    }

    public int getPassangersCount() {
        return passangersCount;
    }

    public void setPassangersCount(int passangersCount) {
        this.passangersCount = passangersCount;
    }

    public Passenger getVetPassengers(int index) {
        return vetPassengers[index];
    }

    public void setVetPassengers(Passenger passengers) {
        this.setPassangersCount(this.getPassangersCount() + 1);

        int index = this.getPassangersCount() - 1;

        this.vetPassengers[index] = passengers;
    }
}
