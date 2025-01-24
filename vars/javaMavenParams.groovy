def call(Map configMap){
    pipeline {
        agent any
        environment {
            project = configMap.get("project")
            component = configMap.get("component")
        }
        stages {
            stage('Build') { 
                steps {
                    sh """
                    echo "${component} Build Success"
                    """

                }
            }
            stage('Test') { 
                steps {
                    echo "Test Success"
                }
            }
            stage('Deploy') { 
                    sh """
                    echo "${project} Deployment Success"
                    """
            }
        }   
    }
}