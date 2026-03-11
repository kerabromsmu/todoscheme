package se.dimage.todoSchemeBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Entry {

    final static String THE_ONE_NAME = "TheOne";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name = THE_ONE_NAME; // to identify the one text in the beginning

    private String text;

    private Timestamp timestamp;
}
