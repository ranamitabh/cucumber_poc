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

        stage('Test') {
                    steps {
                        sh 'mvn -B clean test'
                    }
                }
         stage('Build') {
                    steps {
                        sh 'mvn -B -DskipTests package'
                    }
                }
    }
}
