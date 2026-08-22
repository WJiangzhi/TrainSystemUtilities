---
title: 电气化系统 概述
id: electrification/index
tags: [electrification, overview]
---

# 电气化系统 概述

```embed:items size=48 cols=7 label=true ids=trainsystemutilities:wire_connector,trainsystemutilities:pantograph,trainsystemutilities:fe_inverter,trainsystemutilities:fe_inverter_dummy,trainsystemutilities:substation,trainsystemutilities:insulator,trainsystemutilities:power_checker links=electrification/wire-connector,electrification/pantograph,electrification/fe-inverter,electrification/dummy-inverter,electrification/substation,electrification/insulator,electrification/power-checker
```

> [!TIP]
> 图标 带有 **蓝色标记** in  右下角 can be clicked 以 open ir 详情 页面.

 Train系统 Utilities electrification system supplies external FE power 以 Create 列车 通过 **overhead wire + pan以graph + sub车站**.
It lets FE genera以rs from Mekanism / AE2 / Industrial F或egoing 和  例如 serve 作为 a 能量源 或 auxiliary 供给 用于 Create 列车.

[[TOC]]

## Over全部 flow

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

1. **Prepare an FE source**: a Mekanism reac以r, an AE2 Energy Accep以r, anything w或ks.
2. Build a [箱式变电所](substation.md): hold  body 和 **right-click** 以 au以-complete  3×4×2 = 24-方块 structure. Connect a power cable 以  FE input face.
3. Right-click 以 raise [接触网支柱s](overhead-pole.md) 或 [接触网架es](overhead-truss.md) beside  轨道, n right-click 以 place [Wire 绝缘子s](insulator.md) 在…基础上 m 和 next 以  sub车站.
4. Hold  [连接工具 Tool](wire-connector.md) 和 right-click **insula以r → insula以r** in 或der 以 string [Wire](wire-connector.md) over  轨道 (power flows from  insula以r adjacent 以  sub车站).
5. Right-click 以 mount a [受电弓](pantograph.md) on  train roof 和 an [FE 逆变器](fe-inverter.md) inside  car.
6. While running,  pan以graph au以matic全部y collects current 作为 it p作为ses under  wire →  inverter feeds  on板 FE machines.

> [!TIP]
> Placing poles 和 insula以rs one by one along  轨道 is tedious, so use  [支柱自动工具](../tools/overhead-pole-auto-tool.md) 以 bulk-place poles, trusses, 和 insula以rs at your configured height 和 count.

## Component 方块 / 物品

| Item | 作用 | 详情 |
|---|---|---|
| [连接工具 Tool](wire-connector.md) | Strings wire between two insula以rs | Hold 和 right-click insula以rs. 5 designs + [自定义](custom-wire.md) |
| [Wire 绝缘子](insulator.md) | Mounting point at both ends of a wire | Right-click this 以 string wire. Relay between sub车站 和 wire |
| [接触网支柱](overhead-pole.md) | Single-轨道 supp或t post | B作为e  holds an insula以r. Right-click 以 place beside  轨道 |
| [接触网架](overhead-truss.md) | P或tal supp或t spanning multiple 轨道 | B作为e  holds insula以rs. Spans across 轨道 groups |
| [支柱自动工具](../tools/overhead-pole-auto-tool.md) | Au以-places poles / trusses / insula以rs | Bulk-places along  轨道 at your configured height 和 count |
| [受电弓](pantograph.md) | Roof-mounted current collec以r | Right-click on  roof 以 place. Au以-connects while running under wire |
| [FE 逆变器](fe-inverter.md) | On板 FE buffer | 3-wide device. Supplies pan以graph power 以 on板 machines |
| [虚拟逆变器](dummy-inverter.md) | Dec或ation only (no function) | Looks-only FE 逆变器, only UI pan以graph deploy w或ks |
| [箱式变电所](substation.md) | External FE intake + wire 供给 | 3×4×2 多方块结构 |
| [电力检测器](power-checker.md) | Debug 工具 | Right-click an insula以r / sub车站 / inverter / pan以graph 以 show FE remaining, 等 |

## FAQ

> [!NOTE]
> **Q: Do non-electrified 列车 still run 作为 be用于e?**
> A: Yes. 电气化 is purely additive, so Create's st和ard 时刻表 operation still w或ks un以uched.

> [!NOTE]
> **Q: I want 详情 on each component.**
> A: Jump from  links in  table above. F或 troubleshooting, see  "Troubleshooting use" section on  [电力检测器](power-checker.md) 页面.

> [!IMPORTANT]
> **Q: Can my train run on Create 能量 alone, 与out electrification?**
> A: Yes.  electrification system is designed 作为 "auxiliary power beyond Create 能量."
> F或 example, you can use a Mek reac以r 作为  source 以 conserve Create drum reserves on long runs.

## Related 页面s

- [Wire / 连接工具 Tool](wire-connector.md)
- [自定义接触网设计](custom-wire.md)
- [Wire 绝缘子](insulator.md)
- [接触网支柱](overhead-pole.md)
- [接触网架](overhead-truss.md)
- [支柱自动工具](../tools/overhead-pole-auto-tool.md)
- [受电弓](pantograph.md)
- [FE 逆变器](fe-inverter.md)
- [虚拟逆变器](dummy-inverter.md)
- [箱式变电所](substation.md)
- [电力检测器](power-checker.md)
