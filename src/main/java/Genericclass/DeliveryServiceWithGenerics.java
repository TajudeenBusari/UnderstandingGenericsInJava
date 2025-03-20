package Genericclass;

/**
 * Copyright © 2025
 * @Author = TJTechy (Tajudeen Busari)
 * This file is part of the DeliveryService project towards understanding
 * the concept of Generics in Java
 */
public class DeliveryServiceWithGenerics <T> {
  /**
   * Instead of hard-coding the data type of the packageItem and deliveryAddress
   * we can use Generic to make the class more flexible and reusable.
   * T Can be any data type--> String, Integer, Book(Object), Electronics(object), etc
   */
  private T packageItem;
  private T deliveryAddress;

  public void setPackageItem(T packageItem) {
    this.packageItem = packageItem;
  }
  public T getPackageItem() {
    return packageItem;
  }

  public void setDeliveryAddress(T deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public T getDeliveryAddress() {
    return deliveryAddress;
  }
}
