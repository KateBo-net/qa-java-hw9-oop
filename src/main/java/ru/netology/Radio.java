package ru.netology;

public class Radio {
    private int countStations = 10;
    private int currentStationNumber = 0;
    private int currentSoundVolume = 0;

    public Radio(int countStations) {
        this.countStations = countStations;
    }

    public Radio() {

    }

    public int getCountStations() {
        return countStations;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber >= 0 && newCurrentStationNumber <= countStations - 1) {
            this.currentStationNumber = newCurrentStationNumber;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume >= 0 && newCurrentSoundVolume <= 100) {
            this.currentSoundVolume = newCurrentSoundVolume;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void nextStation() {
        if (currentStationNumber == countStations - 1) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    public void previousStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = countStations - 1;
        } else {
            currentStationNumber--;
        }
    }

    public void increaseVolume() {
        if (currentSoundVolume == 100) {
            return;
        }
        currentSoundVolume++;
    }

    public void turnDownVolume() {
        if (currentSoundVolume == 0) {
            return;
        }
        currentSoundVolume--;
    }
}
