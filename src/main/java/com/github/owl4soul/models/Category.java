package com.github.owl4soul.models;

public enum Category {
    IT,
    SCIENCE,
    SPORT,
    POLITICS,
    OTHER;

    Category() {
    }

    public String getName() {
        return this.name();
    }

}
