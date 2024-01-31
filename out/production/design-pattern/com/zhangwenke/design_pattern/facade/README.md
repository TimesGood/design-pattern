
*外观模式又称门面模式，提供了一个统一的接口，用来访问子系统中的一群接口。*

* 特征：门面模式定义了一个高层接口，让子系统更容易使用。

**外观（Facade）模式包含以下主要角色：**
*  外观（Facade）角色：为多个子系统对外提供一个共同的接口。
*  子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。

*适用场景：*
*  -对分层结构系统构建时，使用外观模式定义子系统中每层的入口点可以简化子系统之间的依赖关系。
*  -当一个复杂系统的子系统很多时，外观模式可以为系统设计一个简单的接口供外界访问。
*  -当客户端与多个子系统之间存在很大的联系时，引入外观模式可将它们分离，从而提高子系统的独立性和可移植性。

*优点：*
*  -简化了调用过程，无需深入了解子系统，以防给子系统带来风险。
*  -减少系统依赖、松散耦合。
*  -更好地划分访问层次，提高了安全性。
*  -遵循迪米特法则，即最少知道原则。

*缺点：*
*  -当增加子系统和扩展子系统行为时，可能容易带来未知风险。
*  -不符合开闭原则。
*  -某些情况下可能违背单一职责原则。

*简单的说就是把一些比较复杂的一系列操作整合起来，让使用者能用简单的操作就可以达到目的。但其实你在调用某一个接口/方法时其实里面做了很多操作
比如说我要睡觉时需要去关灯、关电视、关风扇等等一系列操作，如果让你自己去操作可能会出问题，比如忘记关某电器等。这时我定义一个动作睡觉，这个动作逻辑
自己去把要关的东西都关了，我们不需要知道里面干了什么，反正最终目的就是要睡觉而已*