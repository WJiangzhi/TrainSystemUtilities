---
title: 受电弓
id: electrification/pantograph
tags: [electrification, item, block]
---

# 受电弓

```embed:item id=trainsystemutilities:pantograph size=48 label=true
```

一种安装在列车车厢顶部的集电装置。在接触网下运行时会自动接触，将 FE / Create 能量传输到车厢的缓冲。

[[TOC]]

## 安装

1. 手持受电弓，**右键**点击列车车厢的**车顶（顶面）**以安装。
2. 在将其组装进 Create 列车之前先安装到车厢车顶（一旦组装完成，它会随列车一同移动）。
3. 受电弓是 Geckolib 动画模型，可上下运动（展开 / 收起）。
4. 列车运行时，进入接触网下方会自动**展开**，离开时会**收起**。

> [!NOTE]
> 标准做法是"每节车厢一个受电弓"。在多节编组中，仅部分车厢搭载受电弓、其余车厢通过[FE 逆变器](fe-inverter.md)共享缓冲的设计同样可行。

## 手动展开 / 收起

当你**空手右键已放置的受电弓**时，可手动在展开与折叠之间切换（动作栏会显示 "Pantograph: Extended / Folded"）。适用于诸如仅在停靠车站时降下受电弓等效果。

当你想一次性操作整列车所有的受电弓时，可从管理计算机的[列车标签页](../management-computer/trains.md)选择列车，并在电气化详情中使用"全部展开受电弓" / "全部折叠受电弓"。

## 供电原理

```
[Wire]
     ↓ contact (while moving)
[Pantograph]
     ↓ FE transfer
[Any car's buffer on the same train]
     - Own car's buffer (pantograph-equipped)
     - Other cars' FE Inverters (coupled cars)
     - Onboard Create machines
```

## 整体连接图

```
[FE power source / Create energy]
     ↓
[Substation Cubicle] (FE → wire feed)
     ↓ insulator connection
[Wire]
     ↓ contact
[Train Pantograph]
     ↓
[FE Inverter]
     ↓
[Create machines / other-mod electrical mechanisms]
```

## 多节编组时的行为 {#複数連結時の挙動}

- 即便**只有一节车厢**装有受电弓，FE 也会在整列车范围内共享
- 在其他车厢上放置[FE 逆变器](fe-inverter.md)也能为其缓冲供电
- 即使列车离开接触网，仍可依靠剩余的缓冲 FE 行驶一定距离
- 列车池级别的电气化检查（`isTrainElectrified`）——只要有一节车厢位于接触网下，整列车即视为电气化

> [!TIP]
> 在一节车厢（如前车）放置受电弓 + 在其他车厢放置 FE 逆变器，即便长编组也能由单个受电弓完全供电。

## 与区块加载无关

即便列车停靠在已加载区块之外的车站，其缓冲也不会衰减，返回后重新接触即可继续。
变电所侧通过 [SubstationRegistry](substation.md#savedata)（SavedData）保持与区块无关的持续供电。

## 相关

- [接触网与连接工具](wire-connector.md) — 接触网铺设
- [箱式变电所](substation.md) — 为接触网供电的电源
- [FE 逆变器](fe-inverter.md) — 跨其他车厢的缓冲共享
- [自定义接触网设计](custom-wire.md) — 粗细 / 排数 / 间距的自由设置
