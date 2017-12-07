//enablePlugins(ScalaJsMap)

enablePlugins(ScalaJSPlugin)

libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "11.0.0-M6"
libraryDependencies += "com.thoughtworks.binding" %%% "futurebinding" % "11.0.0-M6"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

//libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.1" % Test

//testFrameworks += new TestFramework("utest.runner.Framework")

// Run tests in PhantomJS instead of Rhino
scalaJSStage in Test := FastOptStage
