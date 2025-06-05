package com.example.demo;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class McpServerConfiguration {

    @Bean
    public List<ToolCallback> toolCallBacks(CourseService courseService) {
        return List.of(ToolCallbacks.from(courseService));
    }
}
