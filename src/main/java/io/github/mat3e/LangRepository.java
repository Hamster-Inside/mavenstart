package io.github.mat3e;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class LangRepository {


    private List<Lang> languages;

    LangRepository() {
        languages = new ArrayList<>();
        languages.add(new Lang(1L, "WTF ANGIELSKI", "en"));
        languages.add(new Lang(2L, "Siemanko POLSKI", "pl"));
    }

    Optional<Lang> findById(Long id) {
        return languages.stream().filter(l -> l.getId().equals(id)).findFirst();
    }
}