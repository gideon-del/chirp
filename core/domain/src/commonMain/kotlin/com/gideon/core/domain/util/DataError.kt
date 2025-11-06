package com.gideon.core.domain.util

sealed  interface DataError: Error {
    enum class Remote: DataError {
     BAD_REQUEST,
     REQUEST_TIMEOUT,
     SERVER_ERROR,
     UNAUTHORIZED,
     FORBIDDEN,
     NOT_FOUND,
     CONFLICT,
        TOO_MANY_REQUESTS,
        SERVICE_UNAVAILABLE,

PAYLOAD_TOO_LARGE,
        SERIALIZATION,

        UNKNOWN
    }

    enum class Local: DataError{
DISK_FULL,
        FILE_NOT_FOUND,
        UNKNOWN
    }
}