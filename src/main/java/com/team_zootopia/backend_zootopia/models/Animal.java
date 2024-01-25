package com.team_zootopia.backend_zootopia.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "animals")
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_animal")
  private Long id;
  private String name;
  private String family;
  private String gener;
  private String origin;
  private Date admisDate;
  private String type;
  private String title;
  private String image_path;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public String getGener() {
    return gener;
  }

  public void setGener(String gener) {
    this.gener = gener;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Date getAdmisDate() {
    return admisDate;
  }

  public void setAdmisDate(Date admisDate) {
    this.admisDate = admisDate;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImage_path() {
    return image_path;
  }

  public void setImage_path(String image_path) {
    this.image_path = image_path;
  }
}
