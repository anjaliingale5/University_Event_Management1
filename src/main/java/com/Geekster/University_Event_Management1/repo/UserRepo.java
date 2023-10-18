package com.Geekster.University_Event_Management1.repo;

import com.Geekster.University_Event_Management1.model.UserManage;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserManage, Integer> {
}
