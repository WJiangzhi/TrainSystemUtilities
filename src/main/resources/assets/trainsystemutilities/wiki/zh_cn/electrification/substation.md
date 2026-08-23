---
title: 箱式变电所
id: electrification/substation
tags: [electrification, block, multiblock]
---

# 箱式变电所

```embed:item id=trainsystemutilities:substation size=48 label=true
```

一种 3×4×2 = 24 方块的多方块结构。它接受外部 FE 电力（Mekanism / AE2 / Industrial Foregoing 等），并通过绝缘子输送到接触网。

[[TOC]]

## 安装

1. 确保放置空间充足（= 3 宽 × 4 深 × 2 高 = 24 方块体积）。
2. 手持变电所主体，**右键点击你想要作为基础方块的位置**。结构的朝向由玩家面朝的方向决定。
3. 以点击位置为基础，自动放置 23 个虚拟方块，完成 3×4×2 结构。
4. 该结构被视为单个逻辑方块（右键任意方块都会作为主体响应）。

> [!WARNING]
> 若放置空间不足，会出现 `Not enough space to place (3×4×2 required)` 提示且放置失败。
> 拆除时，破坏 24 个方块中的任意一个，全部方块会同时消失。

## 状态检查（右键）

当你**空手右键已放置的变电所**时，其当前状态会在聊天栏显示（不会打开专用 GUI 界面）。

| 显示 | 含义 |
|---|---|
| **通电中** | FE 可用，正通过绝缘子向接触网网络供电 |
| **等待连接** | FE 可用，但尚未连接绝缘子 / 接触网 |
| **FE 短缺** | 外部电源未输入 FE |

同时还会显示当前 FE 电量 / 容量以及连接的接触网网络数量。需要更详细调查时，请使用[电力检测器](power-checker.md)。

## 连接（输入 + 输出）

```
[FE power source (Mekanism Cable / Create Energy etc)]
     ↓ connect (any face)
[Substation Cubicle]
     ↓ via insulator block
[Wire]
     ↓
[Train Pantograph]
```

### FE 输入

- 变电所在任意虚拟面上接受 IEnergyStorage 能力
- 任何兼容 FE 的电源均可：Mekanism Universal Cable、AE2 Energy Cell、Create 电动引擎等
- 内部缓冲容量：1,000,000 FE
- 接收速率：10,000 FE/tick

### 接触网输出

要从变电所向接触网输送电力，需在**紧贴**变电所的位置立起一个绝缘子，并从那里布设接触网。

1. 右键在**紧邻**变电所主体的方块上放置[接触网绝缘子](insulator.md)（该绝缘子成为连接变电所和接触网的入口点）。
2. 用[连接工具](wire-connector.md)切换到放置模式右键该绝缘子 → 然后右键下一个绝缘子即可布设接触网。
3. 紧邻变电所的绝缘子之外的接触网网络会变为**通电**（通电的接触网会发出更亮的光）。
4. 单个变电所可分支多段接触网。

## 与区块加载无关 {#savedata}

`SubstationRegistry`（按维度的 SavedData）记录变电所的位置 + FE + 朝向。
即便玩家未加载该区块：

- 变电所的 FE 摄入仍会持续（前提是外部电源所在区块已加载）
- 已加载区块之外的通电列车会继续从缓冲抽取 FE
- 列车返回时缓冲电量保持准确

> [!TIP]
> 在大规模铁路线上，只要缓冲未耗尽，列车即便离开已加载区块仍能驶过长距离路段。反之，缓冲容量设计也很重要。

## 模型

基于 Geckolib 的静态模型（无动画）。纹理为灰色 + 点缀色。
3×4×2 结构中全部 24 方块的外观由单个 BlockEntity 渲染。

> [!NOTE]
> 变电所核心方块带有 BlockEntity。23 个虚拟方块无 BlockEntity；能力访问通过 [SubstationMultiblock.findCore](https://github.com/hololocheck/TrainSystemUtilities/blob/master/src/main/java/com/trainsystemutilities/electrification/block/SubstationMultiblock.java) 路由到核心。

## 相关

- [受电弓](pantograph.md) — 在接触网下运行的集电器
- [接触网与连接工具](wire-connector.md) — 接触网铺设
- [FE 逆变器](fe-inverter.md) — 列车侧 FE 缓冲
- [自定义接触网设计](custom-wire.md) — 接触网外观自定义
