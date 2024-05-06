package xyz.sherin.springmvcreact.domain;


import org.springframework.data.annotation.Id;

public record Car(@Id long id, String make, String model, int year) {
}
