[TOC]
## 设计模式
#### 设计模式六大原则
##### **单一原则**
* 对象的操作应该具有独立性，不应出现A操作的变动引起B操作发生变化，目的是为了降低类的复杂度，提高维护性和扩展性

##### **里式替换原则**
* 只要父类可以出现的地方，子类都可以出现，寓意是子类可以完美的替换父类，好处是增强了程序的健壮性。

* 注意：如果子类重写父类方法出现了畸变，应该降低其耦合度，改为使用依赖，聚合这些较弱的关系代替继承，意味着，在使用继承的时候，尽量不要破坏类的继承关系。

##### **依赖导致原则**
* 高层模块不应该依赖底层模块，二者都该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象，主要意思就是要将系统的高层和低层清晰的分化，高层调用低层时，不应该直接调用低层的实现类，而是调用低层的接口和抽象类，最常见的应用就是代码分层。

##### **接口隔离原则**
* 类之间的依赖关系应该建立在最小的接口上，
主旨是尽量将接口的功能细化，各个接口中的方法应该尽可能的少。

##### **迪米特法则**
* 类间解耦，高内聚低耦合，具体的做法就是多用组合少用继承，应该继承之间的关联性过强。

##### **开放封闭原则**
* 尽量通过扩展软件实体来解决需求变化，而不是通过修改已有的代码来完成变化。在系统设计实现时，就应该考虑系统的可扩展性和灵活性，应为需求变更是必不可少的，意味着对外扩展开放，对内修改关闭。

#### 工厂模式
##### **为什么使用工厂模式**？

> 使用工厂模式主要是为了符合设计模式六大原则中的单一职责

##### **简单工厂模式**

主要角色
* 工厂类角色
* 抽象产品角色
* 具体产品角色

实现方式：
* 简单工厂模式主要通过多个子类继承一个抽象类来实现，工厂类通过不同的参数返回一个不同的子类类实现不同子类的创建。

##### **工厂方法模式**

> 主要角色
* 具体工厂角色
* 抽象产品角色
* 具体产品角色

> 实现方式：
子类通过实现接口分散简单工厂模式工厂类的压力，客户端可以直接通过创建子类的方式完成具体产品的创建.

##### **为什么会有工厂方法模式的出现**
* 在业务逻辑较为简单，子类数量较少的情况下，抽象工厂模式是一个较为不错的选择，但是当子类参数过多，工厂类本身就要承载较大的压力，所以有了抽象工厂方法模式的出现，降低了工厂的压力，由客户端直接选择子类创建，不过要求客户端熟知子类的信息。

#### **策略模式**

> 主要角色
* 封装角色：上层访问策略的入口，它持有抽象策略角色的引用。
* 抽象策略角色：提供接口或者抽象类，定义策略组必须拥有的方法和属性。
* 具体策略角色：实现抽象策略，定义具体的算法逻辑。

##### 策略模式的优点
* 可以将公用的代码提炼出来放在父类之中，避免代码重复
* 可以避免多重的if/else判断

##### 策略模式的缺点
* 使用方必须知道其所使用的策略
* 策略本身存放在一个类中，策略越多，由此产生的类越多

##### 工厂模式和策略模式相结合
策略模式和工厂模式相结合，可以使得策略中的判断也可以省去

#### 命令模式

> 为什么使用命令模式？

主要是为了降低发送者和接受者之间的耦合度，因为在真实业务环境中，发送方和接收方并一定不是一人完成的，通过命令模式，发送方只需要知道如何发送请求即可。

##### **什么是命令模式**

命令模式(Command Pattern):将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化;对请求排 队或者记录请求日志，以及支持可撤销的操作。命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务 (Transaction)模式。

##### **角色组成**

Command: 抽象命令类 ConcreteCommand: 具体命令类 
Invoker: 调用者
Receiver: 接收者
Client:客户类

##### **缺点**
命令模式的缺点，使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个命令都需要设计一个具体命令类，因此某些系 统可能需要大量具体命令类，这将影响命令模式的使用。

##### **命令模式的使用**
先创建一个接受者
在创建一个命令，是命令的接受者和命令做关联
最后创建一个命令的发布者，发布命令
