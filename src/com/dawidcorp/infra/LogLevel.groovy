package com.dawidcorp.infra

enum LogLevel {
    OFF(0), INFO(3), DEBUG(10)

    private final int value

    private LogLevel(int value) {
        this.value = value
    }

    boolean info() {
        return value >= INFO.value
    }

    boolean debug() {
        return value >= DEBUG.value
    }
}