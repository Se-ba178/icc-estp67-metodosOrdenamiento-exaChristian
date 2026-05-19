package models;

public class CarYear {
  private int years;
  private boolean isValid;

  


  public CarYear() {
  }
  
  public CarYear(int year, boolean isValid) {
    this.years = year;
    this.isValid = isValid;
  }
  

  public boolean isValid(){
    return isValid;
  }
  public void isValid(boolean isValid){
    this.isValid=isValid;
  }

  public int getYear() {
    return years;
  }

  public void setYear(int year) {
    this.years = year;
  }

  @Override
  public String toString() {
    return "CarYear [year=" + years + ", isValid=" + isValid + "]";
  }

  

}
