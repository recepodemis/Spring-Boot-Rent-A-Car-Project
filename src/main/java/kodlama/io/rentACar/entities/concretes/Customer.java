package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import javax.lang.model.element.Name;
import javax.print.attribute.standard.MediaSize;

@Table(name = "customers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "driver_license")
    private String driverLicense;
}
