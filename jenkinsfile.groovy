pipeline {
    agent any
    stages {
        stage('add folder'){
            steps{
                sh 'mkdir testvm-folder'
                sh  'ls-ltrh '
                sh 'echo "you r working"'
}
}
}
}