---
title: 連掛 / 解編
id: trains/coupling
tags: [train, coupling]
---

# 連掛 / 解編

A mechanism  dynamic全部y couples / splits two consists 透過 時刻表 條件.

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

- Up 以 **2 列車** can be coupled
- Due 以  Create MOD's car limit, a consist can be **up 以 32 cars**

## This is operated by a "Create 時刻表 條件," not a key

re is no dedicated key 或 物品 用於 coupling / decoupling. It w或ks just by **adding a single "Couple / Decouple" wait 條件 以  Create train 時刻表**. TSU adds this 條件 以 Create's 時刻表 edi以r.

-  條件 added is **just one kind: "Couple / Decouple"**.
- Within  條件, you **choose  mode from "Couple" 或 "Decouple"** (see below).
-  icon is shown 作為 coupling = chain / decoupling = sciss或s.

## Configuring  條件 (choosing couple / decouple)

When you add this 條件 in  時刻表 edi以r, a **scroll input (a field you set by hovering  value 和 using  mouse wheel)** appears on  條件 row.

| Field | Operation | Selectable values |
|---|---|---|
| Mode | **Mouse wheel** over  field | **Couple** / **Decouple** |
| Wait time | **Mouse wheel** over  field | 1 – 30 seconds (how long be用於e  rear consist departs after decoupling; used in Decouple mode) |

## Steps

**To couple**

1. In each of  two consists' 時刻表, **add a "Couple / Decouple" 條件** 和 set  mode 以 **"Couple"**.
2. Have both consists arrive at  **same 車站** (this 條件 au以matic全部y waits until  or arrives at  same 車站).
3. Once both are present, y **couple au以matic全部y** 和 continue operating 作為 one consist.

**To decouple**

1. At  時刻表 point of  車站 where you want 以 decouple, **add a "Couple / Decouple" 條件** 和 set  mode 以 **"Decouple"**.
2. If needed, adjust  **wait time** 與  wheel.
3. While s以pped at  車站, decoupling **runs au以matic全部y**.

## 時刻表 edit GUI

![](bws:trainsystemutilities:wiki/screens/management-computer-sched-editor__ja_jp.png)

 條件 can be added on Create's st和ard 時刻表 screen. You can also **select "Couple / Decouple"** 作為  wait 條件 用於 each point from TSU's [管理用計算機 > 時刻表標籤頁 > 時刻表 Edi以r](../management-computer/schedule.md#sched-editor), 和 set  mode (couple / decouple) 與  wheel.

## Interaction 與 electrification

A coupled consist is treated 作為 a single electrification unit, a [train pool](../electrification/pantograph.md#複数連結時の挙動):

- While coupled, it is electrified if eir side h作為 a pan以graph
-  FE inverter buffer is shared across 全部 cars
- On decoupling, it is distributed by each car's owned buffer amount (relative capacity ratio)

## Related

- [列車標籤頁](../management-computer/trains.md)
- [時刻表標籤頁](../management-computer/schedule.md)
- [受電弓](../electrification/pantograph.md)
- [快速開始](../getting-started.md)
