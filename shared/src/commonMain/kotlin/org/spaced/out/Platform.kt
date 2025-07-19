package org.spaced.out

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform