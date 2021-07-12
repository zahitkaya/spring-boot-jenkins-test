pipeline {

    environment {
        registry = "zahit/jenkins-test"
        registryCredential = 'zahit'
        dockerImage = ''
    }

    agent any
    stages {
       stage('Cloning our Git') {
            steps {
                bat"""
                mvn clean install
                """
            }
        }
    }
}
