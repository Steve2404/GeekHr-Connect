package fr.afrogeek.geekhrconnect.entity;

import fr.afrogeek.geekhrconnect.enums.Genre;
import fr.afrogeek.geekhrconnect.enums.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity// definir classe comme Table dans DB
@Table(name = "employees") // renomme la table dans BD

//04 annotations faites via Lombock, gestion des access des attr. et constr.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id // cle primaire
    @GeneratedValue() // generation automatique
    private UUID id;

    @Enumerated(EnumType.STRING) // enregistreme comme str dans BD
    @Column(nullable = false) // colonne non null
    private Genre genre;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)// colonne unique et non null
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    @Column(nullable = false)
    private Long remainingVacationDays;

    @Column(nullable = false)
    private boolean onVacation;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Position position;


}
