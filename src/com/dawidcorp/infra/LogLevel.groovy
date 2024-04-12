package com.dawidcorp.infra

enum LogLevel {
    OFF(0), INFO(100), WARN(200), DEBUG(400)

    private final int value

    private LogLevel(int value) {
        this.value = value
    }

    static public LogLevel fromString(String level) {
        switch (level) {
            case "INFO":
                return INFO
            case "WARN":
                return WARN
            case "DEBUG":
                return DEBUG
            default:
                return DEBUG
        }
    }
}