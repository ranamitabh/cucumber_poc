pipeline {
    agent any

   tools {
           maven 'M2_HOME'
       }

    stages {
    stage ('Initialize') {
                   steps {
                       sh '''
                           echo "M2_HOME = ${M2_HOME}"
                       '''
                   }
               }
        stage('Build') {
            steps {
                sh 'mvn -B clean Test package'
            }
        }
    }
}
