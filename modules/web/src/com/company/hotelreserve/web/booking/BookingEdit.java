package com.company.hotelreserve.web.booking;

import com.haulmont.bpm.gui.procactionsfragment.ProcActionsFragment;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.hotelreserve.entity.Booking;

import javax.inject.Inject;

@UiController("hotelreserve_Booking.edit")
@UiDescriptor("booking-edit.xml")
@EditedEntityContainer("bookingDc")
public class BookingEdit extends StandardEditor<Booking> {
    private static final String PROCESS_CODE = "hotelReserve";

    @Inject
    private InstanceContainer<Booking> bookingDc;

    @Inject
    protected ProcActionsFragment procActionsFragment;

    @Inject
    private InstanceLoader<Booking> bookingDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        bookingDl.load();
        procActionsFragment.initializer()
                .standard()
                .init(PROCESS_CODE, getEditedEntity());
    }
}