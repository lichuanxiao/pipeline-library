package politie.jenkins

def createBuilder() {

    def pipeline

    node {
        pipeline = new JenkinsPipelineBuilder()
        pipeline.initialize()
    }

    return pipeline;
}

def createTest(){
    node{
        echo "hello world"
    }
}