package org.example.mirai.plugin

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

object ElysianRealmConfig : AutoSavePluginConfig("ElysianRealmConfig") {

    @ValueDescription("新加入角色可自行添加")
    val ElysianRealmConfig: Map<String, Set<String>> by value(

        mapOf(
            "人之律者" to setOf(
                "人律乐土",
                "爱律乐土"
            ),
            "空之律者" to setOf(
                "空律乐土",
                "女王乐土"
            ),
            "格蕾修" to setOf(
                "繁星乐土",
                "格蕾修乐土",
                "绘世乐土"
            ),
            "阿波尼亚" to setOf(
                "阿波尼亚乐土",
                "戒律乐土"
            ),
            "伊甸" to setOf(
                "伊甸乐土",
                "黄金乐土"
            ),
            "帕朵菲莉丝" to setOf(
                "帕朵乐土",
                "猫猫乐土",
                "菲利丝乐土"
            ),
            "伊甸" to setOf(
                "伊甸乐土",
                "黄金乐土"
            ),
            "缭乱星棘" to setOf(
                "火塔乐土",
                "烤箱乐土",
                "星棘乐土",
                "星塔乐土"
            ),
            "天元骑英" to setOf(
                "天元乐土",
                "泥头鹅乐土"
            ),
            "次生银翼" to setOf(
                "大鸭鸭乐土",
                "次生银翼乐土"
            ),
            "卡萝尔" to setOf(
                "卡萝尔乐土"
            ),
            "伊甸" to setOf(
                "伊甸乐土",
                "黄金乐土"
            ),
            "梅比乌斯" to setOf(
                "梅比乌斯乐土",
                "蛇蛇乐土"
            ),
            "渡鸦" to setOf(
                "渡鸦乐土"
            ),
            "雷之律者" to setOf(
                "雷律乐土"
            ),
            "雷律平A流" to setOf(
                "雷律平A流"
            ),
            "雷律天罚流" to setOf(
                "雷律天罚流"
            ),
            "失落迷迭" to setOf(
                "迷迭乐土"
            ),
            "狂热蓝调Δ" to setOf(
                "萝莎莉娅乐土",
                "粉毛乐土",
                "德尔塔乐土"
            ),
            "不灭星锚" to setOf(
                "星锚乐土",
                "星猫乐土"
            ),
            "爱莉希雅" to setOf(
                "爱莉乐土",
                "爱莉希雅乐土"
            ),
            "薪炎之律者" to setOf(
                "炎律乐土",
                "薪炎乐土"
            ),
            "识之律者" to setOf(
                "识律乐土",
                "识宝乐土"
            ),
            "魇夜星渊" to setOf(
                "奶希乐土",
                "冰希乐土"
            ),
            "菲谢尔" to setOf(
                "皇女乐土",
                "菲谢尔乐土"
            ),
            "彼岸双生" to setOf(
                "双生乐土",
                "黑希乐土"
            ),
            "辉骑士 · 月魄" to setOf(
                "幽兰戴尔乐土",
                "月魄乐土",
                "呆鹅乐土"
            ),
            "暮光骑士 · 月煌" to setOf(
                "月煌乐土",
                "紫苑乐土"
            ),
            "圣仪装 · 今样" to setOf(
                "今样乐土",
                "卡莲乐土"
            ),
            "御神装 · 勿忘" to setOf(
                "勿忘乐土",
                "机八乐土",
                "八重樱乐土"
            ),
            "苍骑士 · 月魂" to setOf(
                "月魂乐土",
                "冰箱乐土",
                "冰塔乐土"
            ),
            "破晓强袭" to setOf(
                "强袭乐土"
            ),
            "月下初拥" to setOf(
                "月下乐土"
            ),
            "理之律者" to setOf(
                "理律乐土",
                "摩托鸭乐土",
                "车车乐土"
            ),
            "女武神 · 荣光" to setOf(
                "荣光乐土"
            ),
            "人律蓄力流" to setOf(
                "人律蓄力流",
                "人律纯蓄流",
                "人律蓄力"
            )
        )
    )
}