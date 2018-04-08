package politie.jenkins

import politie.jenkins.Constants
import groovy.text.*
import java.io.*




void createreport(failed_projects,BASEDIR){

templatepath = BASEDIR+"/libs/pipeline-library/src/politie/jenkins/mailtemplate.groovy"
def file = new File(templatepath)

def writable = new SimpleTemplateEngine().createTemplate(file).make(['failed_projects':failed_projects])
def destination = new FileWriter('report.html')
writable.writeTo(destination)
destination.flush()
destination.close()
  
}