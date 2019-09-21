package net.schastny.contactmanager.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@ApiModel("Модель пользователя")
@Table(name = "contact")
public class Contact {

    @Id
    @Column(name = "id")
    @ApiModelProperty("Идентификатор")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty("Имя")
    @Column(name = "firstname")
    private String firstname;

    @ApiModelProperty("Фамилия")
    @Column(name = "lastname")
    private String lastname;

    @ApiModelProperty("Почта")
    @Column(name = "email")
    private String email;

    @ApiModelProperty("телефон")
    @Column(name = "telephone")
    private String telephone;

    @ApiModelProperty("логин")
    @Column(name = "login")
    private String login;

    @ApiModelProperty("пароль")
    @Column(name = "password")
    private String password;

    @ApiModelProperty("роль")
    @Column(name = "role")
    private String role;

    @ApiModelProperty("создан")
    @Column(name = "created")
    private LocalDateTime created = LocalDateTime.now();
}
