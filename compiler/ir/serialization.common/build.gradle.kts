plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    // TODO: decouple from backend.common
    compile(project(":compiler:ir.backend.common"))
    compile(project(":compiler:ir.tree"))
    compile(project(":kotlin-util-klib"))
    testCompile(commonDep("junit:junit"))
}

sourceSets {
    "main" { projectDefault() }
    "test" { projectDefault() }
}

