package br.com.anabeatrizfaria.todolist.user;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity(name = "td_users")
public class UserModel {
   @Id
   @GeneratedValue(generator = "UUID")
   private UUID id;

   @Column(unique = true)
   public String username;
   public String name;
   public String password;

   @CreationTimestamp
   private LocalDateTime createdAt;
}
