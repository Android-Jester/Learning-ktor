import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
val ktorVersion: String = "2.0.2"
val kotlinVersion: String = "1.6.21"
val logbackVersion: String = "1.2.11"
plugins {
    application
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

group = "com.joker"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap")}
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    testImplementation("io.ktor:ktor-server-test-host:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}