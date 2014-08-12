name := "play20-liquibase"

version := "1.2.1-SNAPSHOT"

organization := "play"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

resolvers += Classpaths.sbtPluginReleases

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Typesafe snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= {
  val playVersion = "2.3.2"
  val liquibaseVersion = "3.2.2"
  Seq(
    "com.typesafe.play" %% "play" % playVersion,
    "com.typesafe.play" %% "play-jdbc" % playVersion,
	  "org.liquibase" % "liquibase-core" % liquibaseVersion,
    // Test-only
    "org.hsqldb" % "hsqldb" % "2.3.1" % "test",
    "com.typesafe.play" %% "play-test" % playVersion % "test",
    "org.mockito" % "mockito-all" % "1.9.5" % "test")
}
