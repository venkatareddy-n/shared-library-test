def call(Map configMap){
    pipeline {
        agent any
        stages {
            stage('Build') { 
                steps {
                    echo "Build Success"
                }
            }
        }   
    }
}