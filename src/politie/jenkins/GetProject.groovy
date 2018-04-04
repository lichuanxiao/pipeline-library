package politie.jenkins

import politie.jenkins.Constants
import java.io.File

def getProject(){
    path = new  File(".").getPath()
    println path
    new File("src/politie/jenkins/JenkinsProjectList.groovy").eachLine { line ->Constants.PROJECT_LIST.add($line)
        
    }
}

return this;