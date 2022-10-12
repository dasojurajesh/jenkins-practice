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
                sh 'mkdir test22'
                sh 'mkdir stageoo1'
                sh 'mkdir stage872'
                sh 'ls -ltrh'
            }
        }
        stage ('rename folder') {
            steps {
                sh 'mv test22 shivani'
            }
        }
        stage ('validate') {
            steps {
                sh 'ls -ltrh'
                echo "folder test22 renaming shivani "
            }
        }
    }
}
