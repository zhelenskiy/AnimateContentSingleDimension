plugins {
    `maven-publish`
}

group = "com.zhelenskiy"
version = "1.0.2"

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
