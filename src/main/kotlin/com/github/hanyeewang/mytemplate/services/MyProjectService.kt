package com.github.hanyeewang.mytemplate.services

import com.github.hanyeewang.mytemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
