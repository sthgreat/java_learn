mybatis初体验<br>
流程：<br>
1.创建POJO类<br>
2.使用配置文件生成sqlsessionfactory（单例模式），以后的每次回话使用sqlsessionfactory创建一个数据库连接（其中sqlsessionfactory相当于一个连接池）<br>
3.创建映射器，映射器由两部分构成：其一是配置文件xml，用来存放sql语句；另一部分是映射器接口（java接口），用来定义函数和传入参数类型。<br>
  映射器接口中函数名称需要与xml中id名称相同（不要有空格！），xml中需要定义参数类型（paramterType），与返回值类型（resultType）<br>
4.在主函数中依次创建sqlsession，mapper，使用mapper中的函数进行操作，最后提交事务，关闭数据源（sqlsession）<br>
