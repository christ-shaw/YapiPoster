package com.xzb.listeners





import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.xzb.services.MyProjectService


internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.getService(MyProjectService::class.java)
    }
}
