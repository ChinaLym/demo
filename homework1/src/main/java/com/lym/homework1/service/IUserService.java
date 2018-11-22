package com.lym.homework1.service;

import java.util.List;

import com.lym.homework1.entity.User;

public interface IUserService
{
    public List<User> findAll();

    public void saveUser(User book);

   
    public User findOne(long id);

    public void delete(long id);

    public List<User> findByName(String name);

}
