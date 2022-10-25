pipeline {
    agent any
    stages ('printing working directory') {
        steps{
            sh 'pwd'
        }
    }
    stage ('clone repo'){
        steps{
            withCredentials([usernamePassword(credentialsId: 'shivani_git', passwordVariable: 'password', usernameVariable: 'username')]) {
            echo "repocloned"
            sh 'ls -ltrh'
       }
    }
    stage ('build dockerfile'){
        steps{
            sh "docker build -t image1 ."

        }
    }
     
    }
     
}
    
