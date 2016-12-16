node {
       try {
       
 		  env.JAVA_HOME="${tool 'Java8'}"
       	  env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"
  	      sh 'java -version'
  	      
         } catch (ex) {
           sh "echo $ex"
           throw ex
        }
}
        