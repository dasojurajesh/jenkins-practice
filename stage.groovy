pipeline {
    agent any
    stages{
        stage ('printing working directory') {
            steps {
                sh 'pwd'
            }
        }
        stage ('creating folder') {
            steps {
                sh 'mkdir test'
                sh 'mkdir stage1'
                sh 'mkdir stage2'
                sh 'mkdir stage3'
                sh 'ls -ltrh'
            }
        }
        stage ('delete folder') {
            steps {
                sh 'rm-r stage3'
            }
        }
        stage ('validate') {
            steps {
                sh 'ls -ltrh'
                echo "delete folder stage3 "
            }
        }
    }
}