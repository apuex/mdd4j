import Dependencies._

name := "codegen"
scalaVersion := scalaVersionNumber
organization := mdd4jGroupName
version      := mdd4jVersionNumber

libraryDependencies ++= {
  Seq(
    scalaTest % Test
  )
}

publishTo := localRepo
