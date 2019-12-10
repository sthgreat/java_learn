final:
final成员变量表示常量，只能被赋值一次，赋值后值不再改变。当final修饰一个基本数据类型时，表示该基本数据类型的值一旦在初始化后便不能发生变化；
如果final修饰一个引用类型时，则在对其初始化之后便不能再让其指向其他对象了，但该引用所指向的对象的内容是可以发生变化的。
本质上是一回事，因为引用的值是一个地址，final要求值，即地址的值不发生变化。

构造代码块：每次实例化某个对象总会调用
父类静态变量/静态代码块 -> 子类静态变量/静态代码块 -> 父类构造代码块 -> 父类构造方法 -> 子类构造代码块 -> 子类构造方法
