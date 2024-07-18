package com.anil.draw_worker.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Draw {
    private String year;
    private String number;
    private int status;
}
