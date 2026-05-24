package se.dimage.todoSchemeBackend.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.dimage.todoSchemeBackend.Model.Entry;
import se.dimage.todoSchemeBackend.Repository.ToDoSchemeRepository;

@Service
@RequiredArgsConstructor
public class ToDoSchemeService {

    private static ToDoSchemeRepository repository;

    public static boolean saveText(String text) {

        Entry entry = repository.findByName(Entry.THE_ONE_NAME).stream().findFirst().orElse(new Entry());
        entry.setText(text);
        repository.save(entry);
        return false;
    }
}
