plugins {
    kotlin("jvm") version "1.5.10"
    id("io.izzel.taboolib") version "1.12"
}

group = "io.insinuate"
version = "2.0-PRE-1"

repositories {
    mavenCentral()
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("https://repo.codemc.org/repository/maven-public")
}

taboolib {
    install(
        "common",
        "common-5",
        "module-ai",
        "module-chat",
        "module-configuration",
        "module-database",
        "module-database-mongodb",
        "module-effect",
        "module-kether",
        "module-lang",
        "module-metrics",
        "module-navigation",
        "module-nms",
        "module-nms-util",
        "module-porticus",
        "module-ui",
        "module-ui-receptacle",
        "platform-bukkit",
        "platform-bungee",
        "platform-nukkit",
        "platform-sponge-api7",
        "platform-sponge-api8",
        "platform-velocity"
    )

    description {
        contributors {
            name("Score2")
        }

        dependencies {
            name("PlaceholderAPI").optional(true)
        }
    }

    classifier = null
    version = "6.0.0-pre30"
}

dependencies {
    compileOnly("ink.ptms.core:v11701:11701:universal")
    implementation("me.clip:placeholderapi:2.10.9")
}