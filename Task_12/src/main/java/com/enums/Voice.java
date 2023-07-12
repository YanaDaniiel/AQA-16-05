package com.enums;

public enum Voice { //the sounds produced by birds/animals are not limited, but normally represented by a specific sound
    WHISTLE("whistle"),
    HONK("honk"),
    HOWL("howl"),
    ROAR("roar");
    private String voice;

    public String getVoice() {
        return voice;
    }

    Voice(String voice) {
        this.voice = voice;
    }

    Voice() {
    }

    @Override
    public String toString() {
        return "Voice{" +
                "Voice='" + voice + '\'' +
                '}';
    }

    public static void printEnum() {
        for (Voice voice : Voice.values())
            System.out.println("voices: " + voice);
    }
}
