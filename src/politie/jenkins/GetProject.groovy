package politie.jenkins

import politie.jenkins.Constants
import java.io.File
import static groovy.io.FileType.*

def getProject(){
    path = new  File("test.txt")
    abpath = path.absolutePath()
    println abpath
    new File("JenkinsProjectList.txt").eachLine { line ->Constants.PROJECT_LIST.add($line)
        
    }
}


def props = new Properties()
new File("message.properties").withInputStream { 
  stream -> props.load(stream) 
}
return this;