# Open-closed principle：开闭原则
## 开闭原则的含义
&emsp;&emsp;开闭原则意为一个软件实体如类，模块和函数应该对扩展开放、对修改关闭。即当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
## 开闭原则的作用
&emsp;&emsp;遵循开闭原则可以提高代码的可扩展性。在现实生活中，对一个软件功能的需求是不断变化的，因此软件需要不断进行版本维护以适应这种变化。因为代码之间存在依赖性，会出现修改多处代码的情况，这样就增加了修改出错的可能性。如果不改变原有的代码，只添加新的代码，原有功能就不会因为代码修改不当而出错，继而提高了代码的可扩展性。
## 一个遵循开闭原则的代码实例
实例背景：现在需要对书籍打折销售，因此书籍显示的售价需要发生变化。
定义的书籍接口类：
```
public interface Book {
    public String getName();
    public String getAuth();
    public Double getPrice();
}
```
某一种书实现接口:
```
public class JavaBook implements Book {
    private String name;
    private String auth;
    private Double price;

    public JavaBook(String name, String auth, Double price) {
        this.name = name;
        this.auth = auth;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getAuth() {
        return this.auth;
    }

    public Double getPrice() {
        return this.price;
    }
}
```
当需要打折销售这本书的时候,不能在原有的getPrice方法中修改源码，这样子会导致无法获得原价。应该加入一个方法，并且当以后有不同的折扣销售这本书的时候，又需要对价格进行修改，所以应该去扩展这个类。
```
public class JavaDiscountPrice extends JavaBook{
    public JavaDiscountPrice(String name, String auth, Double price) {
        super(name, auth, price);
    }

    public Double getJavaDiscountPrice(){
        return super.getPrice()*0.6;
    }
}
```
本文代码参考自[Open-Closed Principle（开闭原则）](https://zhuanlan.zhihu.com/p/158674874)
