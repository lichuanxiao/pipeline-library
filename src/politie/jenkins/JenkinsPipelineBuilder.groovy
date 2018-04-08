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
        try {
            node(){
                    stage(project){build project}
                    Constants.BUILD_NUM += 1
                  }
            }
        catch(e) {
            println project+":build error"
            Constants.BUILD_FAILED += 1

            }
        }
    node(){
        Constants.SUCCEED = Constants.BUILD_NUM - Constants.BUILD_FAILED
    }
}

// Return the contents of this script as object so it can be re-used in Jenkinsfiles.
return this;