package politie.jenkins

import politie.jenkins.Constants
import java.io.File

def getProject(){
    new File("./jenkinsProjectList.groovy").eachLine { line ->Constants.PROJECT_LIST.add($line)
        
    }
}

return this;