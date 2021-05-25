package karmanchik.bounching.clientapi.daos;

import karmanchik.bounching.clientapi.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AgentRepository extends JpaRepository<Agent, Integer> {
}
