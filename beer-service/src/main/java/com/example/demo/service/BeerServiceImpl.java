package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BeerDao;
import com.example.demo.model.BeerModel;
@Service
public class BeerServiceImpl implements BeerService{
    private BeerDao beerDao;


    @Autowired
    public BeerServiceImpl(BeerDao beerDao) {
        super();
        this.beerDao = beerDao;
    }


    @Override
    public List<BeerModel> getAllBeer() {
        return beerDao.findAll();
    }

    @Override
    public BeerModel getBeerById(int id) {
         return beerDao.findById(id).get();

    }

    @Override
    public void createBeer(BeerModel beerModel) {
            beerDao.save(beerModel);

    }

    @Override
    public void delete(int id) {

            beerDao.deleteById(id);

    }

    @Override
    public void update(BeerModel beerModel, int id) {

            beerDao.save(beerModel);

    }
}