package com.mongo.realestate.controllers;

import com.mongo.realestate.models.Block;
import com.mongo.realestate.models.Land;
import com.mongo.realestate.repositories.LandRepository;
import com.mongo.realestate.services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BlockController {
    /*
        @Autowired
        BlockService blockService;
        @Autowired
        LandRepository landRepository;
    */
    @PostConstruct
    public void fillDB() {
      /*  Block b = new Block();
        b.setName("A");
        blockService.save(b);
        b = new Block();
        b.setName("B");
        b = blockService.save(b);
        b.setName("updated");
        blockService.save(b);
        Land l = new Land();
        l.setLandAddress("Assuit");
        Land ll = new Land();
        ll.setLandAddress("Cairo");
        List<Land> ls = new ArrayList<>(Arrays.asList(l, ll));
        ls = landRepository.saveAll(ls);
        b.setLands(ls);
        blockService.save(b);*/
    }

    @GetMapping("/all")
    List<Block> fetchAll() {
        return new ArrayList<>();
    }

    @GetMapping("/all-all")
    List<Block> fetchAllA() {
        return new ArrayList<>();
    }

    @GetMapping("/h")
    String fetchString() {
        return "Hello";
    }
    @GetMapping("/h2")
    String fetchString2() {
        return "Hello2";
    }
}
