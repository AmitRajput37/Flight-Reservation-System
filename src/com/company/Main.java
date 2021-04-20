package com.company;

import java.text.ParseException;

public class Main {

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());

    }

    public static void main(String[] args) throws ParseException {
	// write your code here
        Flight plane = new Flight("a121","indigo",100,50);
        System.out.println(plane.getFlightDetails());
        System.out.println(plane.checkAvailability());

        Passenger passenger = new Passenger("moti nagar","amravati","mh",
                "amit","9890984945","amit@gmail.com");

        RegularTicket regularTicket = new RegularTicket("123456789","amravati","nagpur",plane,
                "31-Dec-1998 20:37:50",
                "31-Dec-1998 22:37:50",passenger,"101",5000.50f,false,"body massage");

        TouristTicket touristTicket = new TouristTicket("99999999","amravati","nagpur",plane,"252555",
                "5656665",passenger,"101",5000.50f,false,"bankok",
                new String[]{"amt","nag","bang"});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

        System.out.println(regularTicket.getFlightDuration());

        plane.incrementBookingCounter(); // printing number of seats available.

        passenger.updateAddressDetails("karvenagar","pune","mh");  // updating address details whenever required
        System.out.println("updated address: " +passenger.getAddressDetails()); //printing updated address

        passenger.updateContactDetails("karan","656226616626","karan@gmail.com");// updating contact details whenever required
        System.out.println("updated contact: " +passenger.getContactDetails()); //printing updated contact


    }
}
