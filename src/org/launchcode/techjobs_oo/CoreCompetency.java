package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency {

    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }
}
