package c2c.convention;

import org.gradle.api.*;

class Camptocamp {
    String filterResourcesIn
    String filterResourcesOut

    String filterWebappIn
    String filterJettyWebappOut
    String filterWebappOut


    public Camptocamp(Project project) {
        filterResourcesIn = project.file("src/main/filter-resources")
        filterResourcesOut = project.file("$project.buildDir/classes/main/")

        filterWebappIn = project.file("src/main/filter-webapp")
        filterJettyWebappOut = project.file("src/main/webapp/")
        filterWebappOut = project.file("$project.buildDir/filtered/webapp")
    }
}
