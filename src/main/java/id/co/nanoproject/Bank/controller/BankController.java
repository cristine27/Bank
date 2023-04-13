package id.co.nanoproject.Bank.controller;

import id.co.nanoproject.Bank.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    private ResponseEntity<Boolean> payment(String no_ktp, int harga){
        boolean res = bankService.Payment(no_ktp, harga);
        if(res){
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
