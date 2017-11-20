package com.lc.builderPattern.director;

import com.lc.builderPattern.advanced.Actor;
import com.lc.builderPattern.builder.ActorBuilder;

public class ActorController {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab)
    {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor=ab.createActor();
        return actor;
    }
}
