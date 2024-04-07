def call() {
    //com.dawidcorp.infra.Config.init({
    //    "logLevel": "INFO"
    //})
    //echo "logLevel: ${com.dawidcorp.infra.Config.logLevel}"
    // if (com.dawidcorp.infra.Config.debug()) {
    //     echo "Debugging is enabled"
    // } else {
    //     echo "Debugging is disabled"
    // }
    echo "mainBranch: ${com.dawidcorp.infra.Config.mainBranch()}"
    echo "logLevel: ${com.dawidcorp.infra.Config.logLevel}"
}
