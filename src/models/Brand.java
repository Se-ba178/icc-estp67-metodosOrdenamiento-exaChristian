package models;

import java.util.Arrays;

public class Brand {
  private String brandName;
  private CarModel[] models;

  public Brand() {
  }

  public Brand(String banName, CarModel[] models) {
    this.brandName = banName;
    this.models = models;
  }

  // Metodo Propio BIG O(n^2)
  public int getTotalValidYears() {
    int contador = 0;
    for (CarModel arreglo : models) {
      for (CarYear amios : arreglo.getYears()) {
        if (amios.isValid()) {
          contador++;
        }

      }

    }

    return contador;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBanName(String branName) {
    this.brandName = branName;
  }

  public CarModel[] getModels() {
    return models;
  }

  public void setModels(CarModel[] models) {
    this.models = models;
  }

  @Override
  public String toString() {
    return "Brand [banName=" + brandName + ", models=" + Arrays.toString(models) + "]";
  }

}
