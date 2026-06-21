package se.dimage.todoSchemeBackend.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "entries")
public class Entry {
    public final static String THE_ONE_NAME = "TheOne";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name = THE_ONE_NAME; // to identify the one text in the beginning

    private String text;

    @CreationTimestamp
    private Timestamp createTimestamp;

    @UpdateTimestamp
    private Timestamp updateTimestamp;
}
