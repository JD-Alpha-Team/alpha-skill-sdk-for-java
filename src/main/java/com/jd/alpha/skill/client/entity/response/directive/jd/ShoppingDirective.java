package com.jd.alpha.skill.client.entity.response.directive.jd;

import com.jd.alpha.skill.client.entity.response.directive.Directive;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingDirective extends Directive {

    @Builder.Default
    private String type = "JD.Shopping";

    private Payload payload;

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Payload{
        private String keyword;
        private List<Long> skuList;
    }

}
