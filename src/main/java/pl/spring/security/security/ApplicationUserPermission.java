package pl.spring.security.security;

import lombok.Getter;

public enum ApplicationUserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    @Getter
    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}
