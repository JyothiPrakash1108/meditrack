package com.example.meditrack.util;

import com.example.meditrack.interfaces.IdStrategy;

public class DoctorIdGenerator implements IdStrategy{
    private static int counter = 1;
    @Override
    public String generate() {
        return "DID-" + (counter++);
    }

}
