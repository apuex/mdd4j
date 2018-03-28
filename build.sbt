import Dependencies._

name         := "mdd4j"
scalaVersion := scalaVersionNumber
organization := mdd4jGroupName
version      := mdd4jVersionNumber

pipelineStages := Seq(digest,gzip)

lazy val root = (project in file("."))
  .aggregate(
    codegen
  )

lazy val codegen = (project in file("codegen"))

publishTo := localRepo
