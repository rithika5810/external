pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                bat 'javac Factorial.java TestFactorial.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java TestFactorial'
                bat 'java Factorial'
            }
        }
        stage('Package JAR') {
            steps {
                bat 'jar cfm Factorial.jar manifest.txt Factorial.class'
            }
        }
    }
    post {
        success {
            echo 'successful!'
        }
        failure {
            echo 'failed!'
        }
    }
}