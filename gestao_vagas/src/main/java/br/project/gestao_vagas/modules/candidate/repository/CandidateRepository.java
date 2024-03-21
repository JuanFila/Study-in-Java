package br.project.gestao_vagas.modules.candidate.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.project.gestao_vagas.modules.candidate.entitie.CandidateEntity;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {
    // findBy do  JPArepository procura automatico esses campos na tabela  fazendo um select
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
} 