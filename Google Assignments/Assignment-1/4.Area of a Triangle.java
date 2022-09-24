import java.util.*;
class AreaOfTriangle { 
    static double area(int x1, int y1, int x2, int y2, 
      int x3, int y3) 
    { 
      return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + 
        x3 * (y1 - y2)) / 2.0);  
    } 
  
    public static void main(String[] args) 
    { 
      int x1 = 0, y1 = 0; 
      int x2 = 2, y2 = 5; 
      int x3 = 5, y3 = 2; 
  
      double area = area(x1, y1, x2, y2, x3, y3);
      System.out.println("Area of Triangle is " + area);
    }
  }
