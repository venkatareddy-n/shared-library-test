def call(Map configMap){
    pipeline {
        agent any
        stages {
            stage('Test') { 
                steps {
                    echo "Test Stage"
                }
            }
        }   
    }
}