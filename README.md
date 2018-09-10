# alpha-skill-sdk-for-java

Alpha Skills SDK（Java版本）

Maven地址：

```xml
<!-- Alpha Skill SDK -->
<dependency>
    <groupId>com.jd.alpha</groupId>
    <artifactId>alpha-skill-sdk</artifactId>
    <version>0.1</version>
</dependency>
```

使用方法：

1. 引入 Maven 包
2. 新建 Handler 类并继承抽象类 RequestHandler

```java
@Component
public class SampleHandler extends RequestHandler {

    /**
     * 请求合法性校验
     *
     * @param skillData Skill请求数据
     * @return boolean
     */
    @Override
    public boolean validate(SkillData skillData) {
        return false;
    }

    /**
     * Session开始时的响应
     *
     * @param skillData Skill请求数据
     */
    @Override
    public void onSessionStarted(SkillData skillData) {

    }

    /**
     * 技能启动时的响应（一般返回欢迎语句）
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse onLaunchRequest(SkillData skillData) {
        return null;
    }

    /**
     * 自定义意图时的响应（用户在Alpha平台自行定义的意图）
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse onIntentRequest(SkillData skillData) {
        return null;
    }

    /**
     * Session超时退出
     *
     * @param skillData Skill请求数据
     */
    @Override
    public void onSessionEndedRequest(SkillData skillData) {

    }

    /**
     * 取消意图时的响应
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse onCancelIntent(SkillData skillData) {
        return null;
    }

    /**
     * 帮助意图时的响应
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse onHelpIntent(SkillData skillData) {
        return null;
    }

    /**
     * 下一个意图时的响应
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse onNextIntent(SkillData skillData) {
        return null;
    }

    /**
     * 重复播报意图时的响应（暂未支持）
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse onRepeatIntent(SkillData skillData) {
        return null;
    }

    /**
     * 其他内置意图时的响应
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse onOtherBuildInIntent(SkillData skillData) {
        return null;
    }

    /**
     * 默认响应
     *
     * @param skillData Skill请求数据
     * @return SkillResponse
     */
    @Override
    public SkillResponse defaultResponse(SkillData skillData) {
        return null;
    }
}
```

3. 根据业务需要进行 Handler 类的编码操作，进行不同的响应（在 Spring 工程中，可将 SampleHandler 定义为 Component，以便在 Controller 层注入；如果不是 Spring 工程，可直接 new 对象进行调用）

4. 定义一个 Controller ，接收请求数据并调用 Handler 进行处理。

```java
@RestController
public class SampleController {

    @Autowired
    private SampleHandler handler;

    /**
     *
     * @param requestBody 请求JSON字符串
     * @return SkillResponse
     */
    @PostMapping(value = "/sample", produces = { "application/json;charset=UTF-8" })
    public SkillResponse index(@RequestBody String requestBody) {
        // 将得到的JSON数据转换为 SkillData 对象，并交由 Handler 进行处理
        SkillData data = JSON.parseObject(requestBody, SkillData.class);
        SkillResponse response = handler.handle(data);
        return response;
    }

}
```

以上就是 SDK 的简单使用流程，在开发完成之后，将该 URL 放在 Alpha 开发者中心新建应用中的服务端点中，即可进行相关测试。

> 备注：SDK中每个实体类都提供了 Builder 模式，且提供了常量类，可结合 Builder 以及常量类减小开发负担。

```java
    /**
     * 构建简单技能响应
     *
     * @param skillApplicationId 技能ID
     * @param endSession         是否结束会话
     * @param msg                响应消息
     * @return SkillResponse 技能响应消息
     */
    private SkillResponse buildSimpleResponse(String skillApplicationId, boolean endSession, String msg) {
        return SkillResponse.builder()
                .skill(skillApplicationId)
                .shouldEndSession(endSession)
                .response(SkillResponseDetails.builder()
                        .output(SkillResponseOutput.builder()
                                .text(msg)
                                .type(ResponseOutputTypeConstants.PLAIN_TEXT)
                                .build())
                        .build())
                .build();
    }
```

如果在使用SDK过程中有疑惑或者说各种建议，欢迎提出探讨～