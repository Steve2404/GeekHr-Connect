package fr.afrogeek.geekhrconnect.entity;

import fr.afrogeek.geekhrconnect.enums.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity// defini cette comme etant une table dans DB
@Table(name = "employees") // renomme la DB
// 04 annotations faites via Lombock, gestion des acces des attr. et constr.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id // cette attribut defini comme cle primaire
    @GeneratedValue //generation automatique des cle
    private UUID id;
    @Column(nullable = false) // cette attribut ne dois pas etre null
    private String genre;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true) // dois etre unique et non null
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
    @Column(nullable = false)
    @Enumerated(EnumType.STRING) // enregistre sous forme de str dans DB
    private Position position;

}
