node {
       try {
       
  	      		sh 'java -version'
  	          // Mark the code checkout 'stage'....
                stage 'Checkout'
                // Checkout code from repository
                checkout scm
                stage 'Build'
                sh 'mvn clean install -Dmaven.test.skip'
                
                stage 'Unit Test'
				sh 'mvn test -Dmaven.test.failure.ignore'
				
                stage ('Deploy'){
                sh 'pwd'
                sh 'cp cancer-therapy-evolution-api/target/cancer-therapy-evolution-api.jar /opt/therapy-evolution/jar/'
                }
  	      
         } catch (ex) {
           sh "echo $ex"
           throw ex
        }
}
        