package Heritage.Interface;

public class Body implements VisualElement {
    public VisualElement visualElement;
    //聚合：Body拥有一个VisualElement对象

    public Body(VisualElement visualElement){
        this.visualElement = visualElement;
    }
    // 构造方法用于创建带有指定VisualElement的Body实例

    public VisualElement getVisualElement() {
        return visualElement;
    }
    // 获取聚合的VisualElement对象的getter方法

    public void setVisualElement(VisualElement visualElement) {
        this.visualElement = visualElement;
    }
    //设置聚合的VisualElement对象的setter方法
    @Override
    public void display() {

    }

    @Override
    public String log() {
        return null;
    }
}

//解释当前实例化的 Body 中 VisualElement 元素的数量与VisualElement类的计数器属性值之间的差异是什么？
/*
VisualElement 类的计数器属性值：
VisualElement 类的计数器属性是一个静态属性，它属于类而不是对象。
这意味着它对于所有 VisualElement 类的对象都是共享的。
计数器属性用于记录创建的 VisualElement 对象的数量，每当创建一个新的 VisualElement 对象时，计数器属性都会自增。

Body 对象中的 VisualElement 元素数量：
Body 类中的 VisualElement 元素数量是特定 Body 对象内部包含的 VisualElement 对象的数量。
每个 Body 对象都可以包含一个或多个 VisualElement 对象，这取决于在创建 Body 对象时聚合了多少个 VisualElement 对象。
 */