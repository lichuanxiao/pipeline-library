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
 // BASEDIR = env.WORKSPACE+"/"+env.BUILD_ID
       BASEDIR = env.JENKINS_HOME+"/jobs/"+env.JOB_NAME+"/builds/"+env.BUILD_ID
        projectList.getProject(BASEDIR)
    }  
    for(project in Constants.PROJECT_LIST) {
        node(){
                stage('project'){
                    build project
                }
            }

        }   
  }

// Return the contents of this script as object so it can be re-used in Jenkinsfiles.
return this;



