package politie.jenkins

import politie.jenkins.Constants

def pipelineSteps;

// Constructor, called from PipelineBootstrap.createBuilder().
void initialize() {
    echo 'Initializing PipelineBuilder.'
    pipelineSteps = new JenkinsPipelineSteps()
    pipelineSteps.initialize();
}

def getPipelineSteps() {
    return pipelineSteps
}

void allbuild(){
    
    node(){
        projectList = new GetProject()
        sh "pwd"
        sh "echo $WORKSPACE/$BUILD_ID"
        sh "echo $JENKINS_HOME"
        sh "env"
       // BASEDIR = env.WORKSPACE+"/"+env.BUILD_ID
       BASEDIR = env.BUILD_ID
        projectList.getProject(BASEDIR)
    }  
    for(project in Constants.PROJECT_LIST) {
        node(){
                stage('sonarscan'){
                    echo "${project} sonarscan"
                }
                stage('build'){
                    echo "${project} build"
                }
            }

        }   
  }

// Return the contents of this script as object so it can be re-used in Jenkinsfiles.
return this;



