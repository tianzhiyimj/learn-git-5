## 编程要求
请编写一个程序，满足以下语法要求：

- 变量定义：整数 钱包 等于 零 
- 运算（加法）：钱包 增加 四
- 运算（减法）：钱包 减少 四
- 输出：看看 钱包 or 看看 “字符串”

## 样例：

选择：如果 钱包 大于 十 则 看看 “钱太多了” 否则 看看 “我穷死了”
样例
输入：
```
整数 气温 等于 十
气温 减少 三
气温 增加 二
看看 气温
如果 气温 大于 八 则 看看 “你好，世界” 否则 看看 “冻死我了”
```
输出：
```
九
你好，世界
```
## 要求：
**不需要考虑异常处理**，所写的方法要保证样例可以成功运行

全部写静态类和静态方法，需要编写测试类测试方法运行正常

[推荐教程p2-p4](https://www.bilibili.com/video/BV1C7411B7Qs?p=2)

在com.juice.utils下编写类，在com.juice.test下编写测试类

每一个方法都需要编写测试类，用断言判断写的类是否通过测试
类开头和方法开头要写文档注释

详情可参考Transfer,Variable,TransferTest,VariableTest

采用Pull Request方式，注意在dev分支上需改，提交到dev分支
## 分工
按照分工完成对应的方法
```
aaronlinv：
变量的赋值，将中文变量和解析存入Map键值对
中文与数字相互转换
TransferTest类toNum方法和toChStr方法
Variable类的getVar方法和setVar方法

10672661：
赋值运算： AssignVar类assignVar方法
传入字符串“整数 气温 等于 十”，无返回值
解析字符串，用Variable类方法存储变量


TieJiang13：
比较运算符：JudgeOperator类的judgeOperator
传入字符串“气温 大于 八”，返回布尔类型
调用Variable获取变量

soreak：
识别语句关键字，调用对应方法：CallFunction类callFunction方法

Mangnolia：
输出语句：PrintOut类printOut方法
传入字符串“看看 气温” 返回字符串
（看看 “我穷死了” 这个也要实现）

cjw0816：
增减运算：ManipulateNum类的manipulateNum方法
输入字符串“气温 减少 三”，无返回值
将结果写入Variable
（气温 增加 三 也要写）

BlueNeet：
三目运算：TernaryOperator类的ternaryOperator方法
传入字符串“如果...则...否则...”，无返回值
根据如果的真假调用 则 或 否则 后的语句
（使用callFunction）

Oscar-x：
主函数，组装方法实现功能：RunMain类main函数
循环读取用户输入并调用callFunction
```