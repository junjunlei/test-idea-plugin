package com.github.junjunlei.testideaplugin.services

import com.intellij.openapi.project.Project
import com.github.junjunlei.testideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
