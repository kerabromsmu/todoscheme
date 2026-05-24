package se.dimage.todoSchemeBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.dimage.todoSchemeBackend.Model.Entry;

import java.util.List;

public interface ToDoSchemeRepository extends JpaRepository<Entry, Long> {
    public List<Entry> findByName(String name);
}
