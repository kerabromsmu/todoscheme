package se.dimage.todoSchemeBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.dimage.todoSchemeBackend.Model.Entry;

public interface ToDoSchemeRepository extends JpaRepository<Entry, Long> {

}
