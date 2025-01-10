import sbt._
import Keys._
import play.sbt.PlayScala

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "MyWebProject",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.10",

    libraryDependencies ++= Seq(
      // --- Play Framework (Web) ---
      "com.typesafe.play" %% "play"       % "2.8.20",
      "com.typesafe.play" %% "play-guice" % "2.8.20",

      // --- Kafka ---
      "org.apache.kafka" % "kafka-clients" % "3.5.1",

      // --- JSON (Circe) ---
      "io.circe" %% "circe-core"    % "0.14.5",
      "io.circe" %% "circe-generic" % "0.14.5",
      "io.circe" %% "circe-parser"  % "0.14.5",

      // --- Elasticsearch ---
      "org.elasticsearch.client" % "elasticsearch-rest-high-level-client" % "7.17.9",

      // --- PostgreSQL ---
      "org.postgresql" % "postgresql" % "42.5.0",

      // --- JWT ---
      "com.github.jwt-scala" %% "jwt-core" % "9.2.0",

      // --- Telemetry (OpenTelemetry) ---
      "io.opentelemetry" % "opentelemetry-api" % "1.26.0",

      // --- AWS S3 SDK ---
      "software.amazon.awssdk" % "s3" % "2.20.12",

      // --- Functional Programming Utilities (Cats) ---
      "org.typelevel" %% "cats-core" % "2.9.0",

      // --- Slick for Database Access ---
      // Core Slick library
      "com.typesafe.slick" %% "slick" % "3.4.1",
      // Slick integration with HikariCP (connection pooling)
      "com.typesafe.slick" %% "slick-hikaricp" % "3.4.1",

      // --- Testing ---
      "org.scalatest" %% "scalatest" % "3.2.15" % Test,
      // Optional: Mockito for Scala if you want mocking utilities
      "org.mockito" %% "mockito-scala" % "1.17.14" % Test,
      // If you’re using Play, you can also add:
      "com.typesafe.play" %% "play-test" % "2.8.20" % Test
    )
  )
