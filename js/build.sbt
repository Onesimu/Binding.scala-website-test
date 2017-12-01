enablePlugins(ScalaJsMap)

enablePlugins(ScalaJSPlugin)

libraryDependencies += "com.thoughtworks.binding" %%% "futurebinding" % "9.0.1"

libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "9.0.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.1" % Test

testFrameworks += new TestFramework("utest.runner.Framework")

// Run tests in PhantomJS instead of Rhino
scalaJSStage in Test := FastOptStage
