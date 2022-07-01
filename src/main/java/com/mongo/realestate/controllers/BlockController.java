package com.mongo.realestate.controllers;

import com.mongo.realestate.models.Block;
import com.mongo.realestate.services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BlockController {

    @Autowired
    BlockService blockService;


    @PostConstruct
    public void fillDB() {
        Block b = new Block();
        b.setName("A");
        blockService.save(b);
        b = new Block();
        b.setName("B");
        blockService.save(b);


    }

   @GetMapping("/all")
List<Block> fetchAll(){
       return blockService.findAll();

   }

    @GetMapping("/all-all")
    List<Block> fetchAllA(){ 
        return blockService.findAll();

    }
}
