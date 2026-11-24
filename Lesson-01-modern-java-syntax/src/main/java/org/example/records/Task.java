package org.example.records;

public record Task(String title, int priority) {
    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (priority < 1 || priority > 5) {
            throw new IllegalArgumentException("Priority must be between 1 and 5");
        }
    }
}

