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
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage ('JacocoTests'){
            steps{
                script{
                    JacocoTest
                }
            }
        }
        stage('Empaquetado'){
            steps{
                script{
                    EmpaquetarMaven
                }
            }
        }
    }
    
}