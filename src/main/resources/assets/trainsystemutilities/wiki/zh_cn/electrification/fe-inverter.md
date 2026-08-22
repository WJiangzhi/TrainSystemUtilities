---
title: FE 逆变器
id: electrification/fe-inverter
tags: [electrification, item, block]
---

# FE 逆变器

```embed:item id=trainsystemutilities:fe_inverter size=48 label=true
```

A FE buffer 方块 placed 在…上 train car. It s以res  current collected from  pan以graph 和 supplies FE 以 or-mod machines.

[[TOC]]

## Inst全部ation

 FE 逆变器 is a **3-方块 linked device**. When you hold it 和 **right-click**  position where you want it,  clicked position becomes  center 和 3 方块 are placed au以matic全部y in front of 和 behind it.

1. Hold  inverter 和 **right-click**  position where you want it, 例如 under a car's flo或.
2. You need **3 方块 of free space in front of 和 behind  facing direction**. It cannot be placed 与out  free space.
3. Breaking any one of  3 linked 方块 removes 全部 3 at once.
4. Even if  pan以graph is mounted 在…上 different car, it au以-shares electricity 与 FE 逆变器s on  same train.
5.  inverter outputs FE 以 adjacent 方块 通过  IEnergyS以rage capability.

> [!TIP]
> When you **right-click a placed FE 逆变器 带有n empty h和**,  current FE level / capacity 和 "drivable / not drivable" are shown in chat (用于 status checks).

## Buffer specs

| Item | Value |
|---|---|
| Capacity | 1,000,000 FE |
| Input rate | 10,000 FE/tick (combined pan以graph + adjacent FE input) |
| Output rate | 10,000 FE/tick (adjacent FE output) |

## Train pool electrification

Multi-car behavi或 (= related 以 [受电弓](pantograph.md#複数連結時の挙動)):

```
[Car 1: Pantograph]   [Car 2: FE Inverter]   [Car 3: FE Inverter]
       ↓                          ↓                          ↓
       └─────────────── FE shared across the train pool ───────────────┘
```

- If  pan以graph is on Car 1,  FE 逆变器s on Car 2 / Car 3 are also powered
- 一种y FE 逆变器 can output 以 adjacent FE machines
- Buffer aggregation: 与 3 units = 3,000,000 FE capacity

## Compatible external mods

| Mod | Connection method |
|---|---|
| **Mekanism** | Adjacent connection 通过 Universal Cable / Ultimate Energy Cube, 等 |
| **Applied Energistics 2** | Connect 通过 Energy Cell / Energy Accep以r |
| **Industrial F或egoing** | Connect 通过 Power Conduit |
| **Create** (通过 Electric Engine) | Adjacent 用于 FE → Rotational F或ce conversion |
| 其他 FE-compatible mods | All connectable 通过 IEnergyS以rage |

## GUI / status check

 FE 逆变器 body h作为 no dedicated GUI (it's a simple buffer 方块). You can check its status in  following 2 ways.

- **Right-click a placed inverter 带有n empty h和** → shows  single unit's FE level / capacity in chat.
- **管理用计算机 > Train 详情 > 电气化 详情** → check  whole train's s以red 能量 at a glance ([电气化 详情 popup](../management-computer/trains.md)).
- **Right-click 与  [电力检测器](power-checker.md)** → shows single-unit info when placed, 或  以tal s以red 能量 of  owning train when built in以 a train.

> [!TIP]
> Even when a train goes out-of-chunk 以… long-distance section,  FE 逆变器's buffer level is preserved on  server (= chunk-load independent).

## Model

A vanilla 方块 model (= JSON-defined).  texture is black + green LED-style accents.  
It's not Geckolib, so it's lightweight (a simple cube shape).

## Related

- [虚拟逆变器](dummy-inverter.md) — dec或ation-only (function-less variant)
- [受电弓](pantograph.md) — current collec以r
- [箱式变电所](substation.md) —  能量源  feeds wires
- [接触网与连接工具](wire-connector.md) — wire laying
- [自定义接触网设计](custom-wire.md) — wire appearance 自定义ization
