package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    int countStations = 25;
    int minStation = 0;
    int minVolume = 0;
    int maxVolume = 100;
    int defCountStations = 10;
    Radio radio = new Radio(countStations);

    @Test
    public void shouldSetStationNumber() {

        radio.setCurrentStationNumber(countStations - 1);

        int expected = countStations - 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefaultStationNumber() {

        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverMax() {

        radio.setCurrentStationNumber(countStations);

        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {

        radio.setCurrentStationNumber(minStation - 1);

        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxOnNextStation() {

        radio.setCurrentStationNumber(countStations - 1);
        radio.nextStation();

        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextStation() {

        radio.setCurrentStationNumber(countStations - 2);
        radio.nextStation();

        int expected = countStations - 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMinOnPrevStation() {

        radio.setCurrentStationNumber(minStation);
        radio.previousStation();

        int expected = countStations - 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPrevStation() {

        radio.setCurrentStationNumber(minStation + 1);
        radio.previousStation();

        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {

        radio.setCurrentSoundVolume(maxVolume);

        int expected = maxVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeOverMax() {

        radio.setCurrentSoundVolume(maxVolume + 1);

        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeUnderMin() {

        radio.setCurrentSoundVolume(minVolume - 1);

        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.increaseVolume();

        int expected = minVolume + 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {

        radio.setCurrentSoundVolume(maxVolume);
        radio.increaseVolume();

        int expected = maxVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {

        radio.setCurrentSoundVolume(minVolume + 1);
        radio.turnDownVolume();

        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownVolume() {

        radio.turnDownVolume();

        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreateDefaultCountStations() {

        Radio defRadio = new Radio();

        int expected = defCountStations;
        int actual = defRadio.getCountStations();
        Assertions.assertEquals(expected, actual);
    }
}
