package politie.jenkins

import politie.jenkins.Constants
import java.io.File

def getProject(){
    new  File(".").getPath()
    new File("politie/jenkins/JenkinsProjectList.groovy").eachLine { line ->Constants.PROJECT_LIST.add($line)
        
    }
}

return this;