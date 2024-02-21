plugins {
    `maven-publish`
}

val GITHUB_USER: String by project
val GITHUB_TOKEN: String by project

group = "com.zhelenskiy"
version = "0.0.1-SNAPSHOT"

publishing {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/zhelenskiy/AnimateContentSingleDimension")
            credentials {
                username = GITHUB_USER
                password = GITHUB_TOKEN
            }
        }
    }
}
