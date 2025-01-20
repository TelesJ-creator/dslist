package com.devsuper.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuper.demo.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
