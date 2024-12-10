package org.example.drivers.strategies;

import org.openqa.selenium.WebDriver;

public interface DriverStrategy {

    default WebDriver setStrategy() {
        return null;
    }
}
