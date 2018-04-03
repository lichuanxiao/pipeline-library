package politie.jenkins

def projectlist = ["appfront","member","tran","oms"]

def project(){
    def projectname
    for(projectname in projectlist) {
        println projectname
    }
    return projectlist
}

//return this