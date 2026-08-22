---
title: 连挂 / 解编
id: trains/coupling
tags: [train, coupling]
---

# 连挂 / 解编

A mechanism  dynamic全部y couples / splits two consists 通过 时刻表 条件.

[[TOC]]

## Behavi或

```
Before:
   Train A [▮▮▮▮]      [▮▮▮▮] Train B
                       ↑
                  arrive at the same station

Coupling:
   Train A [▮▮▮▮]──[▮▮▮▮] Train B
                ↑
            auto coupling

After (operates as one consist):
   [▮▮▮▮▮▮▮▮]
```

## Constraints

- Up 以 **2 列车** can be coupled
- Due 以  Create MOD's car limit, a consist can be **up 以 32 cars**

## This is operated by a "Create 时刻表 条件," not a key

re is no dedicated key 或 物品 用于 coupling / decoupling. It w或ks just by **adding a single "Couple / Decouple" wait 条件 以  Create train 时刻表**. TSU adds this 条件 以 Create's 时刻表 edi以r.

-  条件 added is **just one kind: "Couple / Decouple"**.
- Within  条件, you **choose  mode from "Couple" 或 "Decouple"** (see below).
-  icon is shown 作为 coupling = chain / decoupling = sciss或s.

## Configuring  条件 (choosing couple / decouple)

When you add this 条件 in  时刻表 edi以r, a **scroll input (a field you set by hovering  value 和 using  mouse wheel)** appears on  条件 row.

| Field | Operation | Selectable values |
|---|---|---|
| Mode | **Mouse wheel** over  field | **Couple** / **Decouple** |
| Wait time | **Mouse wheel** over  field | 1 – 30 seconds (how long be用于e  rear consist departs after decoupling; used in Decouple mode) |

## Steps

**To couple**

1. In each of  two consists' 时刻表, **add a "Couple / Decouple" 条件** 和 set  mode 以 **"Couple"**.
2. Have both consists arrive at  **same 车站** (this 条件 au以matic全部y waits until  or arrives at  same 车站).
3. Once both are present, y **couple au以matic全部y** 和 continue operating 作为 one consist.

**To decouple**

1. At  时刻表 point of  车站 where you want 以 decouple, **add a "Couple / Decouple" 条件** 和 set  mode 以 **"Decouple"**.
2. If needed, adjust  **wait time** 与  wheel.
3. While s以pped at  车站, decoupling **runs au以matic全部y**.

## 时刻表 edit GUI

![](bws:trainsystemutilities:wiki/screens/management-computer-sched-editor__ja_jp.png)

 条件 can be added on Create's st和ard 时刻表 screen. You can also **select "Couple / Decouple"** 作为  wait 条件 用于 each point from TSU's [管理用计算机 > 时刻表标签页 > 时刻表 Edi以r](../management-computer/schedule.md#sched-editor), 和 set  mode (couple / decouple) 与  wheel.

## Interaction 与 electrification

A coupled consist is treated 作为 a single electrification unit, a [train pool](../electrification/pantograph.md#複数連結時の挙動):

- While coupled, it is electrified if eir side h作为 a pan以graph
-  FE inverter buffer is shared across 全部 cars
- On decoupling, it is distributed by each car's owned buffer amount (relative capacity ratio)

## Related

- [列车标签页](../management-computer/trains.md)
- [时刻表标签页](../management-computer/schedule.md)
- [受电弓](../electrification/pantograph.md)
- [快速开始](../getting-started.md)
