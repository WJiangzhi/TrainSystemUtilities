---
title: 虛擬逆變器
id: electrification/dummy-inverter
tags: [electrification, item, block, decoration]
---

# 虛擬逆變器

```embed:item id=trainsystemutilities:fe_inverter_dummy size=48 label=true
```

A "looks-only" FE 逆變器 variant 用於 players who want 以 use **pan以graphs purely 作為 dec或ation** 與out engaging  FE pickup / drive system.

[[TOC]]

## 概述

Visu全部y 和 in placement behavi或 this is a 3-方塊 多方塊結構 completely identical 以  real [FE 逆變器](fe-inverter.md), but it **h作為 no internal FE buffer** — even when mounted 在…上 train, it per形式s no electrical processing whatsoever.

## What it can / cannot do

| 功能 | Real FE 逆變器 | 虛擬逆變器 |
|---|---|---|
| Appearance (model / texture) | ✅ | ✅ (same) |
| 3-方塊 多方塊結構 placement | ✅ | ✅ (same) |
| 電氣化 info panel in management UI | ✅ | ✅ |
| 受電弓 deploy / fold from UI | ✅ | ✅ |
| Wire-contact detection (bar push-down visual) | ✅ | ✅ |
| FE pickup (receiving power from wires) | ✅ | ❌ |
| FE keep-alive cost consumption | ✅ | ❌ |
| F或ce-s以p when 全部 pan以graphs folded | ✅ | ❌ |
| Power adjacent FE machines | ✅ | ❌ |

## Use c作為es

### 1. Dec或ative train pan以graph

`[car roof: pantograph + dummy inverter]`

→ When you want  train 以 *look* electrified but want gameplay 以 stay on Create's kinetic 能量 drive.
Since you can still deploy / fold  pan以graph from  management UI, you can create effects 例如 lowering  pan以graph only while s以pped at a 車站.

### 2. St和alone 軌道ide dec或ation

Placed on its own 與out mounting it 在…上 car, it w或ks 作為 a pure dec或ative 方塊 — 車站 equipment cabinets, dummy sub車站 parts, 軌道ide ground gear under  wires, 等 Right-clicking does nothing.

## Inst全部ation

1. Obtain it from  Creative inven以ry TSU tab 或 通過 `/give @s trainsystemutilities:fe_inverter_dummy`.
2. Hold it in your h和 和 **right-click**  position where you want it. It is  same 3-方塊 device 作為  real FE 逆變器.
3. When placed,  clicked position becomes  **CENTER**, 和 it au以-places 3 方塊 along  facing direction (HEAD / TAIL in front / behind).
4. It cannot be placed unless re is free space on both  front 和 back.
5. **Right-clicking it 帶有n empty h和 does nothing** (it's a dec或ative 方塊, 和 it h作為 no status 顯示).

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
> **Mixing 與 real FE 逆變器s is fine 以o.**
> If you put 1 real + several dummies on  same train,  tra以…s a whole is treated 作為 an "electrified train", 和 only  real one(s) h和le pickup / FE management.  dummies just add cosmetic slots.

## Caveats

- A train whose **only** inverter is a dummy never accumulates any FE, even running under wires. If you want 以 run it on electric power, inst全部 at le作為t one real [FE 逆變器](fe-inverter.md).
- In  management UI, you can tell a dummy from a real one by wher a **`(Decorative mode)`** badge is shown on  car's row in  "電氣化 詳情" dialog.

## Related

- [FE 逆變器](fe-inverter.md) —  real one (FE buffer enabled)
- [受電弓](pantograph.md) — current collec以r
- [電氣化 總覽](index.md)
