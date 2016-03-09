package com.bluecedar

import org.gradle.api.*
import org.gradle.api.tasks.TaskAction

class MyCustomTask extends DefaultTask {
    String prefix = 'Current Gradle Version'

    String basePath = "/Users/bsia"
    int numCount = 10

    @TaskAction
    def justAnotherFunction() {
        println "$prefix: $project.gradle.gradle-Version"
    }

}

