pipeline {
    agent any

     stages {
         stage('Add Folder')  {
            steps {
                jobDs1 scriptText: """folder('myFolder'){
          description('my description')
          displayName('My Display Name')
      }"""
            }
         }
     }
}        

 
