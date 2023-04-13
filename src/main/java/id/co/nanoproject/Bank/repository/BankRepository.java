package id.co.nanoproject.Bank.repository;

import id.co.nanoproject.Bank.model.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Nasabah, Integer> {

    @Query("SELECT * FROM customer WHERE no_ktp=:ktp")
    Nasabah findNasabahByKtp(@Param("ktp") String nomorKtp);
}
