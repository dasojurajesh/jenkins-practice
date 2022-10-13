pipeline {
    agent any
    stages{
        stage ('printing working directory') {
            steps{
                sh 'pwd'
        
            }
        }
    
        stage ('creating folder') {
        steps{
            sh 'mkdir shivani'
            sh 'mkdir srujana'
        }
      }
    }
}
