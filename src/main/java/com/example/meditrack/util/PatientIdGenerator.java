package com.example.meditrack.util;

import com.example.meditrack.interfaces.IdStrategy;

public class PatientIdGenerator implements IdStrategy{
    private static int counter = 1;
    @Override
    public String generate() {
        return "PAT-" + (counter++);
    }
}
