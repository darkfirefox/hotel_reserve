package com.company.hotelreserve.web.booking;

import com.haulmont.cuba.gui.screen.*;
import com.company.hotelreserve.entity.Booking;

@UiController("hotelreserve_Booking.browse")
@UiDescriptor("booking-browse.xml")
@LookupComponent("bookingsTable")
@LoadDataBeforeShow
public class BookingBrowse extends StandardLookup<Booking> {
}