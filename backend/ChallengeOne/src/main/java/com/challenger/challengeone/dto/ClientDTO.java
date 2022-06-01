package com.challenger.challengeone.dto;

import com.challenger.challengeone.entities.Client;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 1L;

        @Getter private Long id;

        @Getter @Setter private String name;
        @Getter @Setter private String cpf;
        @Getter @Setter private Double income;
        @Getter @Setter private Instant birthDate;
        @Getter @Setter private Integer children;

        public ClientDTO (Client client) {
            this.birthDate = client.getBirthDate();
            this.children = client.getChildren();
            this.cpf = client.getCpf();
            this.id = client.getId();
            this.name = client.getName();
            this.income = client.getIncome();

        }

    }

