pipeline {
    agent none	// 不指定全局的服务器, 每个stage都要定义自己的agent{...}
	
    stages {
        stage('Docker Test') {
            agent { 
		docker {	// 用给定的容器执行pipeline脚本或者stage
		    image 'maven:3.8.2-adoptopenjdk-11'
		    label 'test-server'
		} 
	} 
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
            }
        }
        
    }
}
