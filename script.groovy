def test() {
    echo "${NEW_VERSION}"   // 双引号会解析NEW_VERSION，单引号则会原样输出
    echo '${NEW_VERSION}'
    echo env.GIT_BRANCH
    echo env.JOB_NAME
    
    echo "Hello ${params.PERSON}"
    echo "testing version ${params.VERSION}"
}

def toolsTest() {
    sh 'mvn --version'
}

return this
