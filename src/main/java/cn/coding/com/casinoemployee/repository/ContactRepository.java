package cn.coding.com.casinoemployee.repository;

import cn.coding.com.casinoemployee.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    Contact findFirstByEmail(String email);
}
