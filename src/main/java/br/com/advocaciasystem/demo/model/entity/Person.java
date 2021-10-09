package br.com.advocaciasystem.demo.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;



@Entity
@Table(name = "PERSONS")
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSON")
    private  Long id ;

    @Column(name = "PERSON_NAME", length = 50)
    private String nome;

    @Column(name = "PERSON_CPF", length = 14)
    private String cpf;

    @Column(name = "PERSON_RG",length = 40)
    private String RG;

    @Column(name = "PERSON_DATA_NASCIMENTO")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;



}
