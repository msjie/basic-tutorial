
allprojects {
    group = "cn.yusite.basic.tutorial"
    version = "0.0.1-SNAPSHOT"
}

subprojects {

    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/public/")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/spring/")
        }
        mavenCentral()
    }

}