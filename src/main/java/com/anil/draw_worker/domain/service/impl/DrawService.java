package com.anil.draw_worker.domain.service.impl;

import com.anil.draw_worker.domain.model.Draw;
import com.anil.draw_worker.domain.service.ports.input.GenerateDrawUseCase;
import com.anil.draw_worker.domain.service.ports.output.DrawOutputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Slf4j
public class DrawService implements GenerateDrawUseCase {

    private final DrawOutputPort drawOutputPort;

    @Override
    public void generateDraw() {
        drawOutputPort.insertDraws(createDraws());
        log.info("DRAW INSERTED");
    }

    public List<Draw> createDraws() {
        Random random = new Random();
        return List.of(
                Draw.builder()
                    .status(7)
                    .year("2024")
                    .number(String.valueOf(random.nextInt(1,100) + 1))
                    .build(),
                Draw.builder()
                        .status(100)
                        .year("2024")
                        .number(String.valueOf(random.nextInt(1,100) + 1))
                        .build());
    }
}
