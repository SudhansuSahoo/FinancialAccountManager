pipeline {

	agent any
	
	stages{
	
		stage("build"){
		
			steps{
				withMaven(maven: 'maven_3_5_0'){
					sh 'mvn clean package'
				}
			
			}
		}	
		stage("test"){
		
			steps{
				echo 'testing the application...'
			}
		}	
		stage("deploy"){
		
			steps{
				withCredentials([[$class: 'UsernamePasswordMultiBinding',
				credentialsId:'PCF_LOGIN',
				usernameVariable:'USERNAME',
				passwordVariable: 'PASSWORD']]){
				sh '/usr/local/bin/cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
				sh '/usr/local/bin/cf push'
				}
			}
		}	
	}
}