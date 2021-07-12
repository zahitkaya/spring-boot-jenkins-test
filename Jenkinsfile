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
                git 'https://github.com/zahitkaya/spring-boot-jenkins-test'
            }
        }
    }
}
