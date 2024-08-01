package fr.afrogeek.geekhrconnect.entity;

import fr.afrogeek.geekhrconnect.enums.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
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
    @Enumerated(EnumType.STRING)
    private Position position;

}
