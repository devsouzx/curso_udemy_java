package sections.section13.exerciseMine.entities;

import sections.section13.exerciseMine.entities.enums.RoomType;

import java.util.Date;

public class Room {
  private Integer number;
  private Double price;
  private RoomType type;
  private Client client;

  public Room(Integer number, Double price, RoomType type, Client client) {
    this.number = number;
    this.price = price;
    this.type = type;
    this.client = client;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public RoomType getType() {
    return type;
  }

  public void setType(RoomType type) {
    this.type = type;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

}
