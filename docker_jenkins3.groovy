pipeline {
    agent any
    stages{
        stage('printing working directory'){
            steps {
                sh 'pwd'

            }
        }
        stage ('clone repo') {
            steps {
               withCredentials([usernamePassword(credentialsId: 'shivani_git', passwordVariable: 'password', usernameVariable: 'username')]) {
                   echo "repo cloned"
                   sh "ls -lstrh"  
              } 
            }
        }
        stage ('build dockerfile'){
            steps {
                sh "docker build -t image15 ."
            }
        }
    }