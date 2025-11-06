package org.gideon.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform