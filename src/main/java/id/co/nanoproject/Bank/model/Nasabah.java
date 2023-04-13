package id.co.nanoproject.Bank.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@Data
public class Nasabah {

    @Id
    private int id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "email")
    private String email;

    @Column(name = "no_ktp")
    private String noKtp;

    @Column(name = "saldo")
    private int saldo;

}
