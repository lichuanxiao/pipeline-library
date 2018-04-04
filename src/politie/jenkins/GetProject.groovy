package politie.jenkins

import politie.jenkins.Constants
import java.io.File
import static groovy.io.FileType.*

def getProject(BASEDIR){
    FILEPATH = BASEDIR+"/libs/pipeline-library/src/politie/jenkins/JenkinsProjectList.groovy"
    Constants.PROJECT_LIST = new File(FILEPATH).readLines() 
    }   
return this;