pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'grails clean'
                sh 'grails compile'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'grails prod run-app'
            }
        }
    }
}