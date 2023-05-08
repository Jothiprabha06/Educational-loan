package com.Eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eduloan.demo.Model.loginModel;


@Repository
public interface loginModelRepo extends JpaRepository<loginModel,String> {

}
