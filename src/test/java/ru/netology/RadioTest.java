package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetRequiredRadioStation() {
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetCurrentRadioStationOverLimit() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(11);
        assertEquals(10, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldIncreaseCurrentRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.increaseCurrentRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseCurrentRadioStationIfLimit() {
        radio.setCurrentRadioStation(10);
        radio.increaseCurrentRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseCurrentRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.decreaseCurrentRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseCurrentRadioStationIfLimit() {
        radio.setCurrentRadioStation(0);
        radio.decreaseCurrentRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfLimit() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfLimit() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}