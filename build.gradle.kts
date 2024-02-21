plugins {
    `maven-publish`
}

val GITHUB_USER: String by project
val GITHUB_TOKEN: String by project

group = "animate-content-single-dimension"
version = "0.0.1-SNAPSHOT"

publishing {
    repositories {
        maven {
            name = "animate-content-single-dimension"
            url = uri("https://maven.pkg.github.com/zhelenskiy/AnimateContentSingleDimension")
            credentials {
                username = GITHUB_USER
                password = GITHUB_TOKEN
            }
        }
    }
}
