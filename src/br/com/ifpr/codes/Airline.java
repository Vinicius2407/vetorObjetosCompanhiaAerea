package br.com.ifpr.codes;

public class Airline {
    private String name;
    private String telephone;
    private String email;
    private int flightsCount;
    private Flight[] vetFlights;

    public Airline() {
        this.vetFlights = new Flight[20];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFlightsCount() {
        return flightsCount;
    }

    public void setFlightsCount(int flightsCount) {
        this.flightsCount = flightsCount;
    }

    public Flight getVetFlights(int index) {
        return vetFlights[index];
    }

    public void setVetFlights(Flight flight) {
        this.setFlightsCount(flightsCount + 1);

        int index = this.getFlightsCount() - 1;

        this.vetFlights[index] = flight;
    }
}
