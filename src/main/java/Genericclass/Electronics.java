package Genericclass;

public class Electronics {

  private String branch;

  public Electronics(String branch) {
    this.branch = branch;
  }

  @Override
  public String toString() {

    return "Electronics: " + branch;
  }
}
