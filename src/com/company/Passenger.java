package com.company;

public class Passenger {
    private static int idCounter;
    private int id;

    private static class Address{
        String street,city,state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

    }
    private Address address;

    private static class Contact{
        String name,phone,email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;

    static{
        idCounter = 0;
    }

    public Passenger(String addressStreet,String addressCity,String addressState,
                     String contactName,String contactPhone, String contactEmail) {
            this.id = ++idCounter;
            this.address = new Address(addressStreet,addressCity,addressState);
            this.contact = new Contact(contactName,contactPhone,contactEmail);
    }

    public int getId(){
        return this.id;
    }

    public String getAddressDetails(){
        return  address.street+", "+address.city+", "+address.state;
    }

    public void updateAddressDetails(String addressStreet,String addressCity,String addressState){
            this.address = new Address(addressStreet,addressCity,addressState);
        }


    public String getContactDetails(){
        return contact.name+", "+contact.phone+", "+contact.email;
    }

    public void updateContactDetails(String contactName,String contactPhone,String contactEmail){
        this.contact = new Contact(contactName,contactPhone,contactEmail);
    }

    public int getPassengerCount(){
        return this.id;
    }
}
