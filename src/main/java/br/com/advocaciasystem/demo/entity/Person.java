package br.com.advocaciasystem.demo.entity;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;



@Entity
@Table(name = "PERSONS")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSON")
    private  Long id ;

    @Column(name = "PERSON_NAME", nullable = false, length = 50)
    private String nome;

    @Column(name = "PERSON_CPF",nullable = false, length = 14)
    private String cpf;

    @Column(name = "PERSON_RG",nullable = false,length = 40)
    private String RG;

    @Column(name = "PERSON_DATA_NASCIMENTO",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;



    public long getId() {return id;}

    public void setId(long id) {this.id = id; }

    public String getNome() {return nome; }

    public void setNome(String nome) {this.nome = nome; }

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getRG() {return RG; }

    public void setRG(String RG) {this.RG = RG; }

    public LocalDate getDataNascimento() {return dataNascimento;}

    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento; }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", RG='" + RG + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
