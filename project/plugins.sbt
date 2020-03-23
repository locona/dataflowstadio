addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.12")

resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("org.scalameta" % "sbt-metals" % "0.7.6")
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.4.0-RC1-69-693de22a")
