package com.AJ.HelpDesk.api.entity.repository;

import com.AJ.HelpDesk.api.entity.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String > {

    Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingOrderByDateDesc(
            String title, String status, String priority, Pageable pages
    );

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndUserIdOrderByDateDesc(
            String title, String status, String priority, Pageable pages
    );

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndAssignedUserIdOrderByDateDesc(
            String title, String status, String priority, Pageable pages
    );

    Page<Ticket> findByNumber(Integer number, Pageable pages);
}
