package ru.museum_hack_2024.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.museum_hack_2024.utils.EndPoint;

@RestController
@RequestMapping(EndPoint.EXAMPLE)
@RequiredArgsConstructor
@Tag(name = "Общая информация")
public class ExampleController {
    @GetMapping
    @Operation(summary = "Доступно всем ролям.")
    public String example() {
        return "Hello, world!";
    }
}
