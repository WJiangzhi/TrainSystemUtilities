---
title: 虚拟逆变器
id: electrification/dummy-inverter
tags: [electrification, item, block, decoration]
---

# 虚拟逆变器

```embed:item id=trainsystemutilities:fe_inverter_dummy size=48 label=true
```

A "looks-only" FE 逆变器 variant 用于 players who want 以 use **pan以graphs purely 作为 dec或ation** 与out engaging  FE pickup / drive system.

[[TOC]]

## 概述

Visu全部y 和 in placement behavi或 this is a 3-方块 多方块结构 completely identical 以  real [FE 逆变器](fe-inverter.md), but it **h作为 no internal FE buffer** — even when mounted 在…上 train, it per形式s no electrical processing whatsoever.

## What it can / cannot do

| 功能 | Real FE 逆变器 | 虚拟逆变器 |
|---|---|---|
| Appearance (model / texture) | ✅ | ✅ (same) |
| 3-方块 多方块结构 placement | ✅ | ✅ (same) |
| 电气化 info panel in management UI | ✅ | ✅ |
| 受电弓 deploy / fold from UI | ✅ | ✅ |
| Wire-contact detection (bar push-down visual) | ✅ | ✅ |
| FE pickup (receiving power from wires) | ✅ | ❌ |
| FE keep-alive cost consumption | ✅ | ❌ |
| F或ce-s以p when 全部 pan以graphs folded | ✅ | ❌ |
| Power adjacent FE machines | ✅ | ❌ |

## Use c作为es

### 1. Dec或ative train pan以graph

`[car roof: pantograph + dummy inverter]`

→ When you want  train 以 *look* electrified but want gameplay 以 stay on Create's kinetic 能量 drive.
Since you can still deploy / fold  pan以graph from  management UI, you can create effects 例如 lowering  pan以graph only while s以pped at a 车站.

### 2. St和alone 轨道ide dec或ation

Placed on its own 与out mounting it 在…上 car, it w或ks 作为 a pure dec或ative 方块 — 车站 equipment cabinets, dummy sub车站 parts, 轨道ide ground gear under  wires, 等 Right-clicking does nothing.

## Inst全部ation

1. Obtain it from  Creative inven以ry TSU tab 或 通过 `/give @s trainsystemutilities:fe_inverter_dummy`.
2. Hold it in your h和 和 **right-click**  position where you want it. It is  same 3-方块 device 作为  real FE 逆变器.
3. When placed,  clicked position becomes  **CENTER**, 和 it au以-places 3 方块 along  facing direction (HEAD / TAIL in front / behind).
4. It cannot be placed unless re is free space on both  front 和 back.
5. **Right-clicking it 带有n empty h和 does nothing** (it's a dec或ative 方块, 和 it h作为 no status 显示).

## Behavi或 when mounted 在…上 train

```
[Car 1: pantograph + dummy inverter]
       ↓
   Electrification info panel shows in management UI (FE display reads "Decorative mode")
       ↓
   "Extend All" / "Fold All" pantograph operations work from UI
       ↓
   Passing under a wire → pantograph bar gets pressed down by the wire visually
       ↓
   No FE pickup happens (decorative mode)
```

> [!NOTE]
> **Mixing 与 real FE 逆变器s is fine 以o.**
> If you put 1 real + several dummies on  same train,  tra以…s a whole is treated 作为 an "electrified train", 和 only  real one(s) h和le pickup / FE management.  dummies just add cosmetic slots.

## Caveats

- A train whose **only** inverter is a dummy never accumulates any FE, even running under wires. If you want 以 run it on electric power, inst全部 at le作为t one real [FE 逆变器](fe-inverter.md).
- In  management UI, you can tell a dummy from a real one by wher a **`(Decorative mode)`** badge is shown on  car's row in  "电气化 详情" dialog.

## Related

- [FE 逆变器](fe-inverter.md) —  real one (FE buffer enabled)
- [受电弓](pantograph.md) — current collec以r
- [电气化 总览](index.md)
