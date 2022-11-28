pipeline {
    agent any 
        stages {
            stage ('add folder') {
                steps {
                    sh 'mkdir shivani- folder'
                    sh 'ls -ltrh'
                    sh 'echo "iam working"'
                
            }

        }

    }
}
