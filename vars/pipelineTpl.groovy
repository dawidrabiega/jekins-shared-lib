def call(Closure body) {
    // Evaluate the body block, and collect configuration into the object
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    def values = "'linux'"

    pipeline {
        agent none
        stages {
            stage('BuildAndTest') {
                matrix {
                    agent any
                    axes {
                        axis {
                            name 'PLATFORM'
                            values "${values}"
                        }
                    }
                    stages {
                        stage('Build') {
                            steps {
                                echo "Do Build for ${PLATFORM}"
                            }
                        }
                        stage('Test') {
                            steps {
                                echo "Do Test for ${PLATFORM}"
                                input message: "Do you want to continue?"
                                echo "Continuing after input for ${PLATFORM}"
                            }
                        }
                    }
                }
            }
        }
    }
}