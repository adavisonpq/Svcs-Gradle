package com.proquest

import org.gradle.api.Plugin
import org.gradle.api.Project

class CastorExecPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.task('CastorCodeGen', type: CastorExecTask)
	}
}
