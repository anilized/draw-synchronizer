package com.anil.draw_worker.infra.repository.adapters;

import com.anil.draw_worker.domain.model.Draw;
import com.anil.draw_worker.domain.service.ports.output.DrawOutputPort;
import com.anil.draw_worker.infra.repository.jpa.DrawRepository;
import com.anil.draw_worker.infra.repository.model.DrawEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DrawSQLAdapter implements DrawOutputPort {

    private final DrawRepository drawRepository;

    @Override
    public void insertDraw(Draw draw) {
        drawRepository.save(DrawEntity.builder()
                .year(draw.getYear())
                .number(draw.getNumber())
                .status(draw.getStatus())
                .build()
        );
    }

    @Override
    public void insertDraws(List<Draw> draws) {

        List<DrawEntity> drawEntities = draws.stream()
                .map(d ->
                        DrawEntity.builder()
                        .year(d.getYear())
                        .number(d.getNumber())
                        .status(d.getStatus())
                        .build())
                .toList();

        drawRepository.saveAll(drawEntities);
    }
}
