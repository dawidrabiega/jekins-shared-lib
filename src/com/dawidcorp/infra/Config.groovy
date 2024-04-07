package com.dawidcorp.infra

class Config {
    static private globalConfig = [
        "repoName": "infra",
        "mainBranch": "master",
        "logLevel": "DEBUG",
    ]
    static public logLevel

    //static boolean info() {
    //    return logLevel.info()
    //}

    //static boolean debug() {
    //    return logLevel.debug()
    //}

    public static mainBranch() {
        return globalConfig.mainBranch
    }

    public static init(Map config) {
        globalConfig = globalConfig + config
        //logLevel = LogLevel.fromString(globalConfig.logLevel)
    }
}