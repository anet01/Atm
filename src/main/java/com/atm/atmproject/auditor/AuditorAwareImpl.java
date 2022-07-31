package com.atm.atmproject.auditor;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    //Normalde dbden veya sessiondan kullanıcı çekilir ama test amaçlı tek kullanıcı olduğu için statik verildi
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Berkay");
    }


}


