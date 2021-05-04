package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BeerModel;

public interface BeerService {

    public List<BeerModel> getAllBeer();
    public BeerModel getBeerById(int id);
    public void createBeer(BeerModel beerModel);
    public void delete(int id);
    public void update(BeerModel beerModel, int id);

}
