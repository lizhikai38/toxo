package com.github.lizhikai38.toxo.services

import com.intellij.openapi.project.Project
import com.github.lizhikai38.toxo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
