package io.github.mat3e;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class LangRepository {


    private List<Lang> languages;

    LangRepository() {
        languages = new ArrayList<>();
        languages.add(new Lang(1, "WTF ANGIELSKI", "en"));
        languages.add(new Lang(2, "Siemanko POLSKI", "pl"));
    }

    Optional<Lang> findById(Integer id) {
        return languages.stream().filter(l -> l.getId().equals(id)).findFirst();
    }
}
