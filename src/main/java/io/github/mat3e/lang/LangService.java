package io.github.mat3e.lang;

import io.github.mat3e.HibernateUtil;

import java.util.List;

import static java.util.stream.Collectors.toList;

class LangService {
    private LangRepository repository;

    LangService() {
        this(new LangRepository());
    }

    LangService(LangRepository repository) {
        this.repository = repository;
    }

    List<LangDTO> findAll() {

        return repository
                .findAll()
                .stream()
                .map(LangDTO::new)
                .collect(toList());
    }
}