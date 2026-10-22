package com.detrox.auth.app.auth.payload;

public record LoginRequest(
        String email,
        String password
) {
}
