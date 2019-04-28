package com.company.hotelreserve.core;

import com.company.hotelreserve.entity.Booking;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;

import javax.inject.Inject;
import java.util.UUID;

@Component(ApprovalHelper.NAME)
public class ApprovalHelper {
    public static final String NAME = "demo_ApprovalHelper";

    @Inject
    private Persistence persistence;

    public void updateState(UUID entityId, String state) {
        try (Transaction tx = persistence.getTransaction()) {
            Booking booking = persistence.getEntityManager().find(Booking.class, entityId);
            if (booking != null) {
                booking.setState(state);
            }
            tx.commit();
        }
    }
}