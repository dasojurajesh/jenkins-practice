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
                sh 'ls -ltrh'
            }
        }
        stage ('rename folder') {
            steps {
                sh 'mv test shivani'
            }
        }
        stage ('validate') {
            steps {
                sh 'ls -ltrh'
                echo "folder test renaming shivani "
            }
        }
    }
}