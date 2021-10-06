def environmentTest() {
    echo "${NEW_VERSION}"   // 双引号会解析NEW_VERSION，单引号则会原样输出
    echo '${NEW_VERSION}'
    echo env.GIT_BRANCH
    echo env.BUILD_NUMBER
    echo env.JOB_NAME
}

def toolsTest() {
    sh 'mvn --version'
}

def parametersTest() {
    echo "testing version ${params.VERSION}"
}

return this
