plugins {
    `maven-publish`
}

val GITHUB_USER: String by project
val GITHUB_TOKEN: String by project

publishing {
    repositories {
        maven {
            name = "AnimateContentSingleDimension"
            url = uri("https://maven.pkg.github.com/zhelenskiy/AnimateContentSingleDimension")
            credentials {
                username = GITHUB_USER
                password = GITHUB_TOKEN
            }
        }
    }
}