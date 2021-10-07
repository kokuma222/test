pipeline {
    agent {
	node {
	    label 'test-server'
	}
    }
    environment {	// 下面的stage都可以使用这个变量
	NEW_VERSION = '1.3.0'
    }
    parameters {
	string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who am I?')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage('Test') {
            when {
                expression {
                    params.executeTests == true
                }
            }
        
            steps {
		echo "${NEW_VERSION}"   // 双引号会解析NEW_VERSION，单引号则会原样输出
                echo '${NEW_VERSION}'
		echo env.GIT_BRANCH
		echo env.JOB_NAME
		
		echo "Hello ${params.PERSON}"
                echo "testing version ${params.VERSION}"
            }
        }
    }
	
    post {
	always {	// 执行清除/恢复环境等操作
	    echo 'Here is always condition ...'
	}
	success {
	    echo env.BUILD_TAG + ' build success.'
	}
	failure {
	    echo env.BUILD_TAG + ' build failed.'
	}
    }
}
