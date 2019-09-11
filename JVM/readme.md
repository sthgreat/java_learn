初始化类的时机：

1. new一个实例对象的时候，读取或设置一个类的静态字段，调用一个类的静态方法

2. 对类进行反射调用的时候

3.初始化一个类的时候，如果其父类没有被初始化，其父类会被初始化

4.虚拟机启动时，指定执行的主类（包含main()方法的那个类），虚拟机会先初始化主类
#-----------------------------------#
被动引用：
  不会触发初始化
  例子：
  
  通过子类引用父类的静态字段，不会触发子类的初始化
  public class SuperClass{
      static{
          System.out.println("SuperClass init!");
      }
      public static int value = 123;
  }
  
  public class SubClass extends SuperClass{
      static{
          System.out.println("SubClass init!");
      }
  }
  
  public class NotInitalization{
      public static void main(String[] args){
          System.out.println(SubClass.value);
      }
  }
  
  例子：数组中包含的类不会触发初始化
  
  例子：调用某一类中final标识的静态变量，不会触发初始化
  
  
