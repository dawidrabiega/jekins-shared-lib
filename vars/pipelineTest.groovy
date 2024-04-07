def call(Closure body) {
    // Evaluate the body block, and collect configuration into the object
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    
    //pipelineTpl(valuexs: "linux, windows, mac")
}