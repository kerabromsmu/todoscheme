package se.dimage.todoSchemeBackend.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.dimage.todoSchemeBackend.Repository.ToDoSchemeRepository;

@Service
@RequiredArgsConstructor
public class ToDoSchemeService {

    private static ToDoSchemeRepository repository;

    public static boolean saveText(String text) {

        //repository.save();
        return false;
    }
}
