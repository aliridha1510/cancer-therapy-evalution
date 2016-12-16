node {
       try {
       
  	      		sh 'java -version'
  	          // Mark the code checkout 'stage'....
                stage 'Checkout'
                // Checkout code from repository
                checkout scm
                stage 'Build'
                sh 'mvn clean install -Dmaven.test.skip'
  	      
         } catch (ex) {
           sh "echo $ex"
           throw ex
        }
}
        