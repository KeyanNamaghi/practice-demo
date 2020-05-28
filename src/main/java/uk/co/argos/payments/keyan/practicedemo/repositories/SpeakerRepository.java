package uk.co.argos.payments.keyan.practicedemo.repositories;

import uk.co.argos.payments.keyan.practicedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
