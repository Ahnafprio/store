package com.example.store.genre;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    GenreService genreService;
    public GenreController(GenreService genreService)
    {
        this.genreService=genreService;
    }
    @GetMapping
    public List<Genre>getAllGenre()
    {
        return genreService.getAllGenre();
    }
    @PostMapping
    public Genre addGenre(@RequestBody Genre genre)
    {
         genreService.addGenre(genre);
         return genre;
    }
}
