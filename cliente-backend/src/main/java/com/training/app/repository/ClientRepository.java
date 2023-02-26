/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.repository;

import com.training.app.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
