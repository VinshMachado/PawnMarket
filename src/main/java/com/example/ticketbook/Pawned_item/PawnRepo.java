package com.example.ticketbook.Pawned_item;

import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PawnRepo extends MongoRepository<PawnItem,String> {
}
