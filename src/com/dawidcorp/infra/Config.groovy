package com.dawidcorp.infra

class Config {
    private static globalConfig = [
        "repoName": "infra",
        "mainBranch": "master",
        "logLevel": "INFO",
    ]
    private static logLevel = LogLevel.valueOf(globalConfig.logLevel)

    public static info() {
        return logLevel.info()
    }

    public static debug() {
        return logLevel.debug()
    }

    public static mainBranch() {
        return globalConfig.mainBranch
    }

    public static init(Map config) {
        globalConfig = globalConfig + config
        logLevel = LogLevel.valueOf(globalConfig.logLevel)
    }

    //static {
    //    logLevel = LogLevel.valueOf(globalConfig.logLevel)
    //}
}