package com.usermangement.user.entity;
import com.usermangement.user.VO.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "user_details")
public class User {

    @Id
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
   }
