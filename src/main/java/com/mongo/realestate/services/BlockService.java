package com.mongo.realestate.services;

import com.mongo.realestate.models.Block;
import com.mongo.realestate.repositories.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockService {

    @Autowired
    BlockRepository blockRepository;


    public Block save(Block b) {
       return blockRepository.save(b);

    }

    public List<Block> findAll() {
        return blockRepository.findAll();
    }
}
