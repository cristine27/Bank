package id.co.nanoproject.Bank.service;

import com.mysql.cj.log.Log;
import id.co.nanoproject.Bank.model.Nasabah;
import id.co.nanoproject.Bank.repository.BankRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BankService {

    @Autowired
    public BankRepository bankRepo;

    public Boolean Payment(String no_ktp, int harga){
        Nasabah nasabah = bankRepo.findNasabahByKtp(no_ktp);
        try {
            int saldo = nasabah.getSaldo();
            if(saldo>harga){
                saldo = saldo-harga;
                nasabah.setSaldo(saldo);
                bankRepo.save(nasabah);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new RuntimeException("Nasabah Tidak ditemukan!");
        }
    }
}
