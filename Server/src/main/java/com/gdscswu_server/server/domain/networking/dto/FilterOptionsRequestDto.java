package com.gdscswu_server.server.domain.networking.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class FilterOptionsRequestDto {
    private List<String> departments;
    private List<String> parts;
    private List<String> levels;

    public FilterOptionsRequestDto(List<String> departments, List<String> parts, List<String> levels) {
        this.departments = departments;
        this.parts = parts;
        this.levels = levels;
    }
}
