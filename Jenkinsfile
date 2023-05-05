properties([disableConcurrentBuilds()])

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Swedlg/SSPR_LAB_3_Version_2.git'
                bat './gradlew build'
            }
        }
        stage('Test') {
            steps {
                bat './gradlew test'
            }
            post {
                always {
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
        stage("Create Docker Image") {
            steps {
                bat 'docker image build -t swedlg/app .'
            }
        }
        stage("Push Image To Docker Hub") {
            steps {
                withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    bat 'echo ${dockerhubpwd}'
                    bat "docker login --username swedlg --password ${dockerhubpwd}"
                    bat 'docker push swedlg/app'
                }
            }
        }
    }
}
