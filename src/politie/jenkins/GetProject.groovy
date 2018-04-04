package politie.jenkins

import politie.jenkins.Constants
import java.io.File

def getProject(){
    path = new  File(".").getPath()
    println path
    new File(baseDir,"JenkinsProjectList.groovy").eachLine { line ->Constants.PROJECT_LIST.add($line)
        
    }
}


def props = new Properties()
new File("message.properties").withInputStream { 
  stream -> props.load(stream) 
}
return this;