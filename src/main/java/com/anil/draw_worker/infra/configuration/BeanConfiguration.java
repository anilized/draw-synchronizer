package com.anil.draw_worker.infra.configuration;

import com.anil.draw_worker.domain.service.ports.output.DrawOutputPort;
import com.anil.draw_worker.infra.repository.adapters.DrawSQLAdapter;
import com.anil.draw_worker.infra.repository.jpa.DrawRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    DrawOutputPort drawOutputPort(DrawRepository drawRepository) {
        return new DrawSQLAdapter(drawRepository);
    }

}
