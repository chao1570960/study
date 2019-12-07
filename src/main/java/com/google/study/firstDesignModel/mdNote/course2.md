[TOC]

#### 单例模式（面试重点，尤其是dcl）

##### 懒汉氏
```
public class Singleton1 {
    /**
     * 􏰳􏰳􏰴􏰴􏰵􏰵􏰶􏰶􏰃􏰃􏰷􏰷􏰸􏰸􏰹􏰹􏰺􏰺􏰻􏰻􏰼􏰼􏰇􏰇􏰽􏰽􏰾􏰾优点：没有现成安全问题，简单
     * 缺点：提前初始化会延长类加载器加载类的时间，如果不适用会浪费空间
     */
    private static final Singleton1 instance = new Singleton1();
    private Singleton1(){};
    public static Singleton1 getInstance(){
        return instance; }
}
```

##### 恶汉氏
```
public class Singleton2 {
    /**
     * 􏰳􏰳􏰴 优点􏰴：线程安全，延迟初始化:􏱚􏱚􏱛􏱛􏰷􏰷􏰸􏰸􏰹􏰹􏰺􏰺􏰇􏰇􏱅􏱅􏱜􏱜􏱁􏱁􏱂􏱂􏱃􏱃( Effective Java􏱝􏱝􏱞􏱞􏱟􏱟􏰑􏰑)
     *  枚举类型实现的缺点：有部分屌丝看不懂，
     */
    private Singleton2(){}
    public static Singleton2 getInstance () {
        return Holder.SINGLE_TON; }
    private static class Holder{
        private static final Singleton2 SINGLE_TON = new Singleton2();
    }
}
```
##### 双重校验锁
```
public class Singleton3 {
    private volatile static Singleton3 uniqueSingleton;
// volatile关键字的主要作用是防止指令重排
    private Singleton3() {
    }

    public Singleton3 getInstance() {
        if (null == uniqueSingleton) {
            synchronized (Singleton3.class) {
                if (null == uniqueSingleton) {
                    uniqueSingleton = new Singleton3();
                }
            }
        }
        return uniqueSingleton;
    }
}
```


#### 代理模式

> 代理模式分为三种：
* 静态代理 、 
* jdk动态代理、 
* cglib动态代理

> 􏱿􏱰􏳇􏱤􏰄􏲶􏰆􏰔􏰵􏳄􏳱􏳲􏱫􏰜􏰊􏰋􏰕􏲆􏱿􏱰􏳳􏰬􏰀􏱫􏰯􏰖􏱫􏰜􏰄􏳴􏰻􏳵􏱿􏱰􏳇􏱤􏰄􏲶􏰆􏰔􏰵􏳄􏳱􏳲􏱫􏰜􏰊􏰋􏰕􏲆􏱿􏱰􏳳􏰬􏰀􏱫􏰯􏰖􏱫􏰜􏰄􏳴􏰻􏳵􏱿􏱰􏳇􏱤􏰄􏲶􏰆􏰔􏰵􏳄􏳱􏳲􏱫􏰜􏰊􏰋􏰕􏲆􏱿􏱰􏳳􏰬􏰀􏱫􏰯􏰖􏱫􏰜􏰄􏳴􏰻􏳵􏱿􏱰􏳇􏱤􏰄􏲶􏰆􏰔􏰵􏳄􏳱􏳲􏱫􏰜􏰊􏰋􏰕􏲆􏱿􏱰􏳳􏰬􏰀􏱫􏰯􏰖􏱫􏰜􏰄􏳴􏰻􏳵代理模式的作用：
> 为其他对象提供一种代理以控制这个对象的访问。

##### **代理模式涉及到的角色**
抽象角色：大家都知道的物品，比如说nike
代理角色：有渠道可以联系到真实角色，手中用手可以联系nike的渠道，实质上是拥有真实角色的引用
真实角色：真正的nike，与抽象的nike是有部分类似性的

##### **静态代理的优点**
可以做到不修改目标对象的情况下，为其增加功能

##### **缺点**
每一个代理类都需要实现接口或者继承抽象类，如果其发生变动，则代理类也必须跟着修改
其次，代理类每一个接口对应一个委托对象，如果委托对象􏱴非常多􏱸􏳥􏳦􏱿􏱰􏰢􏴞􏱴􏲘，则代理类就会非常臃肿难以胜任

##### **jdk动态代理**
动态代理解决静态代理中代理类过多的问题，通过反射实现，借助java自带的proxy，通过固定的
规则实现，实质上是实现InvocationHandler接口，重写invoke方法
具体步骤：
1：编写一个委托类的接口（抽象角色）
2：实现一个真正的委托类（真实角色）
3：创建一个动态测试类，实现InvocationHandler接口，并重写该invoke方法
4：在测试类中，生成动态代理的对象

##### **jdk动态代理的总结**
动态代理的抽象角色必须要接口，因此对该对象的所有方法调用都会转发InvocationHandler.invoke()
使用：写一个接口，写一个真实类，写一个proxy就可以完成

##### **cglib动态代理**
实现一个方法拦截器MethodInterceptor，重写intercept方法，

##### **jdk动态代理相比于cglib动态代理**

代理模式最大的用处就是可以再不改动原类的情况下，对该对象进行前后处理，降低系统耦合度
代理对象作为客户端和目标对象的中介，起到保护对象的作用
