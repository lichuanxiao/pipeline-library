package politie.jenkins

def projectlist = ["appfront","member","tran","oms"]

def project(){
    for(projectname in projectlist) {
        println projectname
    }
}

return this