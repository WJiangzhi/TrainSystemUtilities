---
title: 电气化系统概述
id: electrification/index
tags: [electrification, overview]
---

# 电气化系统概述

```embed:items size=48 cols=7 label=true ids=trainsystemutilities:wire_connector,trainsystemutilities:pantograph,trainsystemutilities:fe_inverter,trainsystemutilities:fe_inverter_dummy,trainsystemutilities:substation,trainsystemutilities:insulator,trainsystemutilities:power_checker links=electrification/wire-connector,electrification/pantograph,electrification/fe-inverter,electrification/dummy-inverter,electrification/substation,electrification/insulator,electrification/power-checker
```

> [!TIP]
> 图标右下角带有**蓝色标记**的可以点击打开其详情页面。

TrainSystem Utilities 的电气化系统通过**接触网 + 受电弓 + 箱式变电所**为 Create 列车提供外部 FE 电力。
它可以让来自 Mekanism / AE2 / Industrial Foregoing 等的 FE 发电机作为 Create 列车的电源或辅助供电。

[[TOC]]

## 总体流程

```
[FE generator (Mek/AE2/IF)] ──FE──▶ [Substation cubicle]
                                       │
                                  (steps up to the wire via insulator)
                                       │
                                       ▼
[Roof-mounted Pantograph] ◀──runs under wire──▶ [Overhead Wire]
        │
        ▼
[FE Inverter] ──FE──▶ [Onboard Create / Mek / ... machines]
```

1. **准备 FE 电源**：Mekanism 反应堆、AE2 能量接收器，任何 FE 源都可以。
2. 搭建[箱式变电所](substation.md)：手持主体并**右键**即可自动完成 3×4×2 = 24 方块的结构。将电力线缆接到 FE 输入面。
3. 右键在轨道旁升起[接触网支柱](overhead-pole.md)或[接触网桁架](overhead-truss.md)，然后右键在它们顶部以及变电所旁放置[接触网绝缘子](insulator.md)。
4. 手持[连接工具](wire-connector.md)，按顺序右键**绝缘子 → 绝缘子**，在轨道上方架设[接触网](wire-connector.md)（电力从变电所旁的绝缘子流出）。
5. 右键在列车车顶安装[受电弓](pantograph.md)，在车厢内安装[FE 逆变器](fe-inverter.md)。
6. 运行时，受电弓在经过接触网下方时会自动集流 → 逆变器为车载 FE 机器供电。

> [!TIP]
> 沿轨道逐一放置支柱和绝缘子非常繁琐，因此可以使用[接触网支柱自动工具](../tools/overhead-pole-auto-tool.md)按你设定的高度和数量批量放置支柱、桁架和绝缘子。

## 部件方块 / 物品

| 物品 | 作用 | 详情 |
|---|---|---|
| [连接工具](wire-connector.md) | 在两个绝缘子之间架设接触网 | 手持并右键绝缘子。5 种样式 + [自定义](custom-wire.md) |
| [接触网绝缘子](insulator.md) | 接触网两端的悬挂点 | 右键此方块以架设接触网。变电所与接触网之间的中继 |
| [接触网支柱](overhead-pole.md) | 单轨道支撑柱 | 承载绝缘子的底座。右键放置在轨道旁 |
| [接触网桁架](overhead-truss.md) | 跨越多条轨道的龙门支撑 | 承载绝缘子的底座。跨越轨道组 |
| [接触网支柱自动工具](../tools/overhead-pole-auto-tool.md) | 自动放置支柱 / 桁架 / 绝缘子 | 按设定的高度和数量沿轨道批量放置 |
| [受电弓](pantograph.md) | 车顶集电器 | 右键在车顶放置。在接触网下运行时自动连接 |
| [FE 逆变器](fe-inverter.md) | 车载 FE 缓冲 | 3 格宽设备。将受电弓的电力提供给车载机器 |
| [模拟逆变器](dummy-inverter.md) | 仅装饰（无功能） | 外观同 FE 逆变器，仅 UI 受电弓展开有效 |
| [箱式变电所](substation.md) | 外部 FE 接入 + 接触网供电 | 3×4×2 多方块结构 |
| [电力检测器](power-checker.md) | 调试工具 | 右键绝缘子 / 变电所 / 逆变器 / 受电弓以显示剩余 FE 等 |

## 常见问题

> [!NOTE]
> **问：未电气化的列车还能像以前一样运行吗？**
> 答：可以。电气化系统完全是附加功能，因此 Create 的标准时刻表运行不受影响。

> [!NOTE]
> **问：我想了解每个部件的详细信息。**
> 答：从上表中的链接跳转即可。如需故障排查，请参阅[电力检测器](power-checker.md)页面中的"故障排查使用"章节。

> [!IMPORTANT]
> **问：我的列车可以仅靠 Create 能量运行，不使用电气化吗？**
> 答：可以。电气化系统被设计为"超越 Create 能量的辅助电力"。
> 例如，你可以使用 Mek 反应堆作为电源，以便在长途运行中节省 Create 桶装能量储备。

## 相关页面

- [接触网 / 连接工具](wire-connector.md)
- [自定义接触网设计](custom-wire.md)
- [接触网绝缘子](insulator.md)
- [接触网支柱](overhead-pole.md)
- [接触网桁架](overhead-truss.md)
- [接触网支柱自动工具](../tools/overhead-pole-auto-tool.md)
- [受电弓](pantograph.md)
- [FE 逆变器](fe-inverter.md)
- [模拟逆变器](dummy-inverter.md)
- [箱式变电所](substation.md)
- [电力检测器](power-checker.md)
