package se.dimage.todoSchemeBackend.Controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.dimage.todoSchemeBackend.Dto.TextRequestDto;
import se.dimage.todoSchemeBackend.Service.ToDoSchemeService;

@RestController
@RequestMapping
public class ToDoSchemeController {
    @GetMapping
    public ResponseEntity<String> getText() {
        return ResponseEntity.ok("TODO list");
    }

    @PostMapping
    public ResponseEntity<String> postText(@RequestBody @Valid TextRequestDto textRequestDto) {
        if (ToDoSchemeService.saveText(textRequestDto.getText())) {
            return ResponseEntity.ok("Text changed: " +  textRequestDto.getText());
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
