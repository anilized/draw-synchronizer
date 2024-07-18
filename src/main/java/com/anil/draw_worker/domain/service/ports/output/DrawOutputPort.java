package com.anil.draw_worker.domain.service.ports.output;

import com.anil.draw_worker.domain.model.Draw;

import java.util.List;

public interface DrawOutputPort {
    void insertDraw(Draw draw);
    void insertDraws(List<Draw> draws);
}
