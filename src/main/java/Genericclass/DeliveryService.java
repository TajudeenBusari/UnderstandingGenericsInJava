package Genericclass;

/**
 * Copyright © 2025
 * @Author = TJTechy (Tajudeen Busari)
 * This file is part of the DeliveryService project towards understanding
 * the concept of Generics in Java
 */
public class DeliveryService {

  private String packageItem;
  private String deliveryAddress;

  public void setPackageItem(String packageItem) {
    this.packageItem = packageItem;
  }
  public String getPackageItem() {
    return packageItem;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }
  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  /**
   * Instead of hard-coding the data type of the packageItem and deliveryAddress
   * we can use Generic to make the class more flexible and reusable.
   */

}
