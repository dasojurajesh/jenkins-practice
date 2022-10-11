pipeline {
    agent any
    stages {
        stage('add folder'){
            steps{
                sh 'mkdir test-folder'
                sh  'ls -ltrh '
                sh 'echo "you r working"'
}
}
}
}