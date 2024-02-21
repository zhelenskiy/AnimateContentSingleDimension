plugins {
    `maven-publish`
}

group = "com.zhelenskiy"
version = "0.0.1-SNAPSHOT"

publishing {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/zhelenskiy/AnimateContentSingleDimension")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
