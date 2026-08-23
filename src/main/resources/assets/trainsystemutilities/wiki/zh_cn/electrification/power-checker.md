---
title: 电力检测器
id: electrification/power-checker
tags: [electrification, tool]
---

# 电力检测器

```embed:item id=trainsystemutilities:power_checker size=48 label=true
```

电气化系统的**调试 / 检查工具**。右键目标方块即可将其电气化状态输出到聊天栏。

[[TOC]]

## 如何使用

手持电力检测器，**右键**点击以下任意目标：

| 目标 | 显示信息 |
|---|---|
| **接触网绝缘子** | 连接的接触网数量 / 通电数量 / 每段接触网的 ON/OFF |
| **箱式变电所**（核心或虚拟） | 缓冲 FE / 容量 / 连接的绝缘子和接触网数量 |
| **FE 逆变器**（已放置） | 缓冲 FE / 容量 |
| **FE 逆变器**（在列车上） | 列车总 `storedEnergy` / 逆变器总容量 |
| **受电弓**（已放置或在列车上） | 当前接触的接触网段 / 本 tick 取得 FE |
| 其他 | "Not applicable" — 透传 |

> [!TIP]
> 输出到**聊天栏**（而非动作栏）。在专用服务器和单人游戏中均可使用。
> 列车显示的数值来自服务器 tick，因此即便在行驶中也是准确的。

## 输出示例

```
[Insulator @ (123, 65, -42)]
  Attached wires: 3
  Energized: 2 / 3
  ▸ wire 1: ON (to insulator @ (118, 65, -42))
  ▸ wire 2: ON (to insulator @ (128, 65, -42))
  ▸ wire 3: OFF (to insulator @ (123, 65, -50))  ← cut grid
```

```
[Substation @ (110, 64, -40)]
  Buffer: 425,032 / 1,000,000 FE (42.5%)
  Energized insulators: 6
  Energized wires: 14
```

```
[FE Inverter (Train #train_jb_03)]
  Train storedEnergy: 12,400 / 80,000 FE (15.5%)
  Mounted inverters: 4 (20,000 FE capacity each)
```

## 故障排查

| 症状 | 检查 |
|---|---|
| "列车不动" | 敲击受电弓——若取流为 0，则上方接触网未通电 |
| "接触网颜色发暗" | 敲击末端的绝缘子 → 沿电网回溯到枢纽 |
| "变电所充不进电" | 敲击变电所——确认缓冲电量和输入速率 |
| "列车耗电太快" | 敲击逆变器——比较消耗与取流 |

## 相关

- [箱式变电所](substation.md) — 主要 FE 电源
- [接触网绝缘子](insulator.md) — 通电节点
- [受电弓](pantograph.md) — 集电器
- [FE 逆变器](fe-inverter.md) — 车载 FE 缓冲
