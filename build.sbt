name := "ScalaTestGroup"

version := "0.1"

scalaVersion := "2.13.4"

<<<<<<< HEAD
//libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.2.2" % "test"
//libraryDependencies += "org.mockito" % "mockito-core" % "2.7.22" % Test
//libraryDependencies += "org.scalatestplus" %% "mockito-3-4" % "3.2.2.0" % "test"

libraryDependencies ++= Seq(
	"org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
	"org.mockito" % "mockito-core" % "2.7.22" % Test,
	"org.reactivemongo" %% "play2-reactivemongo" % "0.20.3-play27",
	"org.scalatest" %% "scalatest" % "3.0.8" % Test,
	"org.scalatest" %% "scalatest-funspec" % "3.2.2" % Test
)
=======
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-wordspec" % "3.2.2" % "test"
libraryDependencies += "org.scalatestplus" %% "mockito-3-4" % "3.2.2.0" % "test"

>>>>>>> lloyd.flatspec.branch
