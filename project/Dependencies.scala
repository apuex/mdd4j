import sbt._

object Dependencies {
  lazy val scalaVersionNumber    = "2.12.3"
  lazy val mdd4jGroupName         = "com.wincom.mdd4j"
  lazy val mdd4jVersionNumber     = "1.0.0"

  lazy val scalaXml        = "org.scala-lang.modules"    %%  "scala-xml"                           % "1.0.6"
  lazy val jodaTime        = "joda-time"                 %   "joda-time"                           % "2.9.9"
  lazy val logback         = "ch.qos.logback"            %   "logback-classic"                     % "1.2.3"
  lazy val scalaTest       = "org.scalatest"             %%  "scalatest"                            % "3.0.4"
  lazy val scalacheck      = "org.scalacheck"            %%  "scalacheck"                          % "1.13.4"

  lazy val localRepo = Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
}
