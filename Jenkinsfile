pipeline {
    agent none  // 不指定全局的服务器, 每个stage都要定义自己的agent{...}
    tools {
	maven '3.8.3'
    }
	
    stages {
        stage('Tools Test') {
            agent {
		node {
		    label 'test-server'
		}
	    }
            steps {
                sh 'mvn --version'
            }
        }
    }
}
