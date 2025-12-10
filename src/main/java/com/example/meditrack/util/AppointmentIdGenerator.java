package com.example.meditrack.util;

import com.example.meditrack.interfaces.IdStrategy;

public class AppointmentIdGenerator implements IdStrategy{
    private static int counter = 1;
    @Override
    public String generate() {
        return "APT-" + (counter++);
    }

}
