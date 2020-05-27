
allprojects {
    group = "cn.yusite.basic.tutorial"
    version = "0.0.1-SNAPSHOT"
}

subprojects {

    apply(plugin = "org.jetbrains.kotlin.jvm:1.3.70")

    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/public/")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/spring/")
        }
        mavenCentral()
    }

    dependencies {
        // Align versions of all Kotlin components
        "implementation"(platform("org.jetbrains.kotlin:kotlin-bom"))

        // Use the Kotlin JDK 8 standard library.
        "implementation"("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

        // Use the Kotlin test library.
        "testImplementation"("org.jetbrains.kotlin:kotlin-test")

        // Use the Kotlin JUnit integration.
        "testImplementation"("org.jetbrains.kotlin:kotlin-test-junit")
    }
}