package ru.netology;

public class Radio {
    private int currentStationNumber;
    private int currentSoundVolume;

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber >= 0 && newCurrentStationNumber <= 9) {
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
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    public void previousStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
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
