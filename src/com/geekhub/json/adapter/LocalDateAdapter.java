package com.geekhub.json.adapter;

import java.time.LocalDate;

/**
 * Converts object of type java.time.LocalDate to String by using ISO 8601 format
 */
public class LocalDateAdapter implements JsonDataAdapter<LocalDate> {

    @Override
    public Object toJson(LocalDate date) {
        //implement me
        return null;
    }
}
