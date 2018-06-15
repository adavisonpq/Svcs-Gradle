package com.proquest

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CastorExecTask extends DefaultTask {
	String xsdFile ="";// = getProject().getProjectDir().getPath() + "/src/main/resources/" + getProject().getName()
	String packageName ="";// = project.getProperty('serviceSchemaPackage');
	String codegenOutputDir ="";
	
	@TaskAction
	def action1() {
		project.javaexec {
			main = 'org.exolab.castor.builder.SourceGeneratorMain'
			args '-i', xsdFile, '-dest', codegenOutputDir, '-package', packageName, '-types', 'j2', '-verbose', '-f'
			classpath = project.configurations['castor'].fileCollection {return true}
		}
	}
}
