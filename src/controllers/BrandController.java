package controllers;

import models.Brand;

public class BrandController {
  public Brand[] sortBubbleDesc(Brand[] brands) {
    int n = brands.length;
    boolean y;
    for (int i = 0; i < n - 1; i++) {
      y = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (brands[j].getTotalValidYears() < brands[j + 1].getTotalValidYears()) {
          Brand b = brands[j];
          brands[j] = brands[j + 1];
          brands[j + 1] = b;
          y = true;
        }
      }
      if (!y) {
        break;
      }
    }
    return brands;

  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    sortBubbleDesc(brands);
    int bajo = 0;
    int alto = brands.length - 1;
    while (bajo <= alto) {
      int centro = (bajo + alto) / 2;
      if (brands[centro].getTotalValidYears() == validYears) {
        return brands[centro];
      }
      if (bajo >= centro) {
        alto = centro - 1;
      } else {
        bajo = centro + 1;
      }

    }
    return null ;
  }

  public void imprimir(Brand[] brands) {
    for (Brand bry : brands) {
      System.out.println(bry.getBrandName() + " " + bry.getTotalValidYears());

    }

  }

}
