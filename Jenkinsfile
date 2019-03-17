pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'Building'
                
            }
        }
        stage('Test'){
            steps{
                echo 'Testing'
                sh "./mvnw clean test"
     
            }
        }
        
        stage('Deploy-Production'){
            steps{
                echo 'Deploy-Production'
                
            }
        }
    }
}
