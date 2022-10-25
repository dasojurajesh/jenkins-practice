pipeline {
    agent any
    stages {
        stage('printing working directory'){
            steps {
                sh 'pwd'

            }
        }
        stage ('clone repo'){
            steps {
                withCredentials([usernamePassword(credentialsId: 'shivani_git', passwordVariable: 'password', usernameVariable: 'username'), usernamePassword(credentialsId: 'shivani_git', passwordVariable: 'password', usernameVariable: 'username')]) {
                  echo "repo cloned"
                  sh "ls-ltrh"
                }
            }
        }
        stage ('install package'){
          steps {
            sh "apt install ngnix -y"
          }
          }
        stage ('build dockerfile'){
            steps {
                sh "docker build -t image14 ."
            }
        }
        stage ('docker image'){
            steps {
                sh "dockerimages"
            }
        }
        stage ('run the image'){
            steps {
                sh "docker run -d -p 8080:8089 image14"
            }
        }


    }
}




