package user_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    @NotBlank(message = "User name is required...")
    private String name;

    @Column(name = "email")
    @NotBlank(message = "Email is required...")
    @Email(message = "Invalid email!")
    private String email;

    @Column(name = "age")
    @NotNull(message = "Age is required...")
    @Positive(message = "Age should be greater than zero.")
    private int age;
}
