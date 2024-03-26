package org.example;

import lombok.Data;

@Data
public class PaginationDemo {
    String name;
    String timezone;

    public void County(String name, String timeZone) {
        this.name = name;
        this.timezone = timeZone;
    }
}
