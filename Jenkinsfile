@Library('shared-lib') _

pipeline{
    
    agent any
    
    tools {
        maven "jenkins-maven"
    }
    
    stages{
        
        stage('build'){
            steps{
                script{
                    ConstruirMaven
                }
            }
        }
        stage ('Test'){
            steps{
                script{
                    UnitTest
                }
            }
        }
    }
    
}