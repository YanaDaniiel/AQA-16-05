package com.enums;

public enum Voice {
    WHISTLE("whistle"),
    HONK("honk"),
    HOWL("howl");
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

    public void printEnum(){
        System.out.println("voices: " + voice);
    }


}
