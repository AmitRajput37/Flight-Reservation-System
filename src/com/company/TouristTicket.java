package com.company;

public class TouristTicket {
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

    public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
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
