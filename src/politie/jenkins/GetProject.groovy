package politie.jenkins

import politie.jenkins.Constants
import java.io.File
import static groovy.io.FileType.*

def getProject(BASEDIR){
    FILEPATH = "/var/jenkins_home/jobs/jst-tran-Analysis/builds/"+BASEDIR+"/libs/pipeline-library/src/politie/jenkins/JenkinsProjectList.groovy"

    new File(FILEPATH).eachLine { line ->println line
    }
}


def props = new Properties()
new File("message.properties").withInputStream { 
  stream -> props.load(stream) 
}
return this;