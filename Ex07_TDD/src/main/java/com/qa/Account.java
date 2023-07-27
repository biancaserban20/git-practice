package com.qa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Comparable<Account>{
    private String cardTypes[];
    private String sortCode;
    private String accountNumber;
    private String password;

    @Override
    public int compareTo(Account o) {
        if(Arrays.asList(this.cardTypes).contains(o.cardTypes[0]))
            if(this.sortCode.equals(o.sortCode))
                if(this.accountNumber.equals(o.accountNumber))
                    if(this.password.equals(o.password))
                        return 0;
        return -1;
    }

}
