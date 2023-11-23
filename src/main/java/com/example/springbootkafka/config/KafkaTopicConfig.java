package com.example.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name1}")
    private String topicName1;

    @Value("${spring.kafka.topic.name2}")
    private String topicName2;

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(topicName1).build();
    }

    @Bean
    public NewTopic jsonTopic() {
        return TopicBuilder.name(topicName2).build();
    }
}
