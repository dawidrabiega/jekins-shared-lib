package com.dawidcorp.infra

class Config {
    static private globalConfig = [
        "repoName": "infra",
        "mainBranch": "master",
        "logLevel": "INFO",
    ]
    static public logLevel = LogLevel.valueOf(globalConfig.logLevel)

    static info() {
        return logLevel.info()
    }

    static debug() {
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