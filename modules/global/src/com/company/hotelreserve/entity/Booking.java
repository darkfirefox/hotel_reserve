package com.company.hotelreserve.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@NamePattern("%s|name")
@Table(name = "HOTELRESERVE_BOOKING")
@Entity(name = "hotelreserve_Booking")
public class Booking extends StandardEntity {
    @NotNull
    @Column(name = "PASSPORT_NUMBER", nullable = false)
    protected Integer passport_number;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Pattern(regexp = "^((\\+7|7|8)+([0-9]){10})$")
    @NotNull
    @Column(name = "PHONE", nullable = false)
    protected String phone;

    @Email(regexp = ".*")
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "ARRIVAL_DATE", nullable = false)
    protected Date arrival_date;

    @Min(0)
    @NotNull
    @Column(name = "NIGHT_NUMBER", nullable = false)
    protected Integer night_number;

    @Min(0)
    @NotNull
    @Column(name = "ROOM_NUMBER", nullable = false)
    protected Integer room_number;

    @Column(name = "STATE")
    protected String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public Integer getNight_number() {
        return night_number;
    }

    public void setNight_number(Integer night_number) {
        this.night_number = night_number;
    }

    public Date getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(Date arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(Integer passport_number) {
        this.passport_number = passport_number;
    }
}