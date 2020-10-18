
package com.xzb.services
import com.intellij.openapi.project.Project
import com.xzb.MyBundle


class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
