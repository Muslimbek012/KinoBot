package kino1409_bot;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "'movie'")
public class Movie {
    @Id
    private String file_id;
    @Column(unique = true)
    private int code;
    private String caption;
    private LocalDate date;




}
