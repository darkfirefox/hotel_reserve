-- begin HOTELRESERVE_BOOKING
create table HOTELRESERVE_BOOKING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PASSPORT_NUMBER integer not null,
    NAME varchar(255) not null,
    PHONE varchar(255) not null,
    EMAIL varchar(255) not null,
    ARRIVAL_DATE date not null,
    NIGHT_NUMBER integer not null,
    ROOM_NUMBER integer not null,
    --
    primary key (ID)
)^
-- end HOTELRESERVE_BOOKING
