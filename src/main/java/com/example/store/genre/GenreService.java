package com.example.store.genre;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreService {
    GenreRepository genreRepository;
    public GenreService(GenreRepository genreRepository)
    {
        this.genreRepository=genreRepository;
    }
    public List<Genre> getAllGenre()
    {
        return genreRepository.findAll();
    }

    public void addGenre(Genre genre) {
          genreRepository.save(genre);
    }
}
