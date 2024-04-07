package com.dawidcorp.infra

enum LogLevel {
    OFF(0), INFO(100), WARN(200), DEBUG(400)

    private final int value

    LogLevel(int value) {
        this.value = value
    }

    boolean info() {
        return this.value >= 100 // LogLevel.INFO.value
    }

    boolean debug() {
        return this.value >= 400 //LogLevel.DEBUG.value
    }

    static LogLevel fromString(String level) {
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