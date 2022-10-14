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
                sh 'mkdir shivani'
                sh 'ls -ltrh'

            }
        }
        stage ('creating files') {
            steps {
                sh 'touch f1,f2,f3'
                echo "files copy to the folder"
                
            }
        }
    }
}