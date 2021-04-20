package com.company;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public TouristTicket(String pnr,String from,String to,Flight flight,String departureDateTime,String arrivalDateTime,
                         Passenger passenger,String seatNo,float price,boolean cancelled,String hotelAddress, String[] selectedTouristLocation) {
        super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price,cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }


    public String getHotelAddress(){
        return this.hotelAddress;
    }

    public String[] getTouristLocation(){
        return this.selectedTouristLocation;
    }

    public void removeTouristLocation(String location){

    }

    public void addTouristLocation(String location){

    }
}
