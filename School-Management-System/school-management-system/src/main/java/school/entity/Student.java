package school.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roll_no")
    private int rollNo;

    @NotBlank(message = "Student Name is required...")
    @Column(name = "student_name")
    private String name;

    @NotBlank(message = "Student Address is required...")
    @Column(name = "student_address")
    private String address;

    @NotNull(message = "Student age is not null...")
    @Column(name = "student_age")
    private int age;
}
