jdk观察者实现
在 Java 中，通过java.util.Observable类和 java.util.Observer接口定义了观察者模式，只要实现它们的子类就可以编写观察者模式实例。

Observable类是抽象目标类（被观察者），它有一个Vector集合成员变量，用于保存所有要通知的观察者对象，下面是它最重要的 3 个方法：
void addObserver(Observer o) 方法：用于将新的观察者对象添加到集合中。
void notifyObservers(Object arg) 方法：调用集合中的所有观察者对象的update方法，通知它们数据发生改变。通常越晚加入集合的观察者越先得到通知。
void setChange() 方法：用来设置一个boolean类型的内部标志，注明目标对象发生了变化。当它为true时，notifyObservers() 才会通知观察者。