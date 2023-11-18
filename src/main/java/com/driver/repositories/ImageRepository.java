package com.driver.repositories;

//import com.driver.models.Image;
//import org.springframework.boot.maven.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

}
