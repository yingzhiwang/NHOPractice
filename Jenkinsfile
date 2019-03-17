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
                sh "mvn test"
     
            }
        }
        
        stage('Deploy-Production'){
            steps{
                echo 'Deploy-Production'
                
            }
        }
    }
}
