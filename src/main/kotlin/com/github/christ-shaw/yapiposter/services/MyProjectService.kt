package com.github.christ-shaw.yapiposter.services

import com.intellij.openapi.project.Project
import com.github.christ-shaw.yapiposter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
