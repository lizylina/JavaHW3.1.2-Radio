package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetRequiredRadioStation() {
        radio.setCurrentRadioStation(5);
        int expected = 5;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseCurrentRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.increaseCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseCurrentRadioStationIfLimit() {
        radio.setCurrentRadioStation(9);
        radio.increaseCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseCurrentRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.decreaseCurrentRadioStation();
        int expected = 4;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseCurrentRadioStationIfLimit() {
        radio.setCurrentRadioStation(0);
        radio.decreaseCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        int expected = 6;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfLimit() {
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expected = 4;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }
}