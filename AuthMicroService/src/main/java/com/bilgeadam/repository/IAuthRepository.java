package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IAuthRepository extends JpaRepository<Auth,Long> {
//    /**
//     * Bu kullanıcı adı daha önce kullanılmış mı?
//     * @param username
//     * @return
//     */
    @Query(value = "select COUNT(a)>0 from Auth a where a.email=?1")
    boolean isEmail(String email);
//
//    /**
//     * Kullanıcı adı ve şifresi verilen kaydın olup olmadığı kontol ediliyor.
//     * @param username
//     * @param password
//     * @return
//     */
    Optional<Auth> findOptionalByEmailAndPassword(String email, String password);
    Optional<Auth> findOptionalByEmail(String email);

}
