package com.restful.booker.model;

import java.util.HashMap;

public class BookingDates {
    public HashMap<String, Object> getBookingDates(){
        HashMap<String,Object> bookingDates = new HashMap<>();
        bookingDates.put("checkin", "2018-02-23");
        bookingDates.put("checkout", "2019-10-23");
        return bookingDates;

        //"checkin": "2013-02-23",
        //        "checkout": "2014-10-23"
    }

}
