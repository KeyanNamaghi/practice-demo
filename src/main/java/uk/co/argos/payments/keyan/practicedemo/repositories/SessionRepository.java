package uk.co.argos.payments.keyan.practicedemo.repositories;

import uk.co.argos.payments.keyan.practicedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
