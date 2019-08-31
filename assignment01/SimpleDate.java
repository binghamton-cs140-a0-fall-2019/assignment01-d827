package assignment01;

public class SimpleDate{
  private int year;
  private int month;
  private int day;

  public SimpleDate(int years, int months, int days){
    year = years;
    month = months;
    day = days;
  }

  public static SimpleDate of(int yr, int m, int d){
    var returnValue = new SimpleDate(yr, m, d);
    returnValue.year = yr;
    returnValue.month = m;
    returnValue.day = d;
    return returnValue;
  }

  public boolean before(SimpleDate other){
    if(this.year < other.year){
      return true;
    }
    if(this.year == other.year){
      if(this.month < other.year){
        return true;
      }
      if(this.month == other.month){
        if(this.day < other.day){
          return true;
        }
        if(this.day == other.day){
          return false;
        }
      }
    }
    else{
      return false;
    }
    return false;
  }
}
