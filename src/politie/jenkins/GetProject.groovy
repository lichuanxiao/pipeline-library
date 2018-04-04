package politie.jenkins

import politie.jenkins.Constants
import java.io.File
import static groovy.io.FileType.*

def getProject(BASEDIR){
    FILEPATH = BASEDIR+"/libs/pipeline-library/src/politie/jenkins/JenkinsProjectList.txt"

    new File(FILEPATH).eachLine { line ->Constants.PROJECT_LIST.add($line)
        
    }
}


def props = new Properties()
new File("message.properties").withInputStream { 
  stream -> props.load(stream) 
}
return this;