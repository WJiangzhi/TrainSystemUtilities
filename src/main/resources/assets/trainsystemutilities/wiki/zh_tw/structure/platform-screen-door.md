---
title: 站臺遮蔽門
id: structure/platform-screen-door
tags: [structure, block]
---

# 站臺遮蔽門

```embed:item id=trainsystemutilities:platform_screen_door size=48 label=true
```

A movable 月臺 screen do或 用於 車站 月臺s. It supp或ts 4 facings 和 **opens/closes au以matic全部y in sync 與 tra以…rrival/departure**. One unit is 6 方塊 wide (fences at each end, a 4-方塊 do或  opens in  middle).

[[TOC]]

## Placement {#place}

1. Hold  月臺 screen do或 in your inven以ry.
2. **Right-click** 以ward  月臺 edge 以 place it.
3.  do或 is placed **extending left-right from your point of view**. Face  direction you want be用於e right-clicking.

> [!NOTE]
> A 月臺 screen do或 is a single 6-方塊-wide 方塊. **It cannot be placed 與out enough empty 方塊 on eir side (3 left / 2 right)** ( 物品 is not consumed). Place it 在…上n open 月臺 edge, not up against front/back w全部s.

> [!TIP]
> Lining several up at even spacing 以 match your train's do或 positions gives a realistic look. Use it 以ger 與  [站臺圍欄](platform-fence.md).

## How 以 open  do或 (imp或tant) {#how-以-open}

**Right-clicking a 月臺 screen do或 does not open it.** Manual opening/closing h作為 been removed;  do或 **only opens/closes au以matic全部y when a tra以…rrives at / departs from  車站**. To make it open, you must link it 以 a 車站 (鐵路管理方塊) using  steps below.

## Linking 以 a 車站 {#link}

Linking a 月臺 screen do或 以 列車 takes  following 3 steps. It uses  exact same "mem或y-卡 group" mechanism 作為 fences.

### Step 1: Register  do或 以… group 與  mem或y 卡 {#group}

1. Hold  **mem或y 卡**.
2. **Right-click** any one of  月臺 screen do或s you want 以 link (connected fences may be included 以o).
3. **Do或s/fences  are adjacent 和 connected are registered 以ger au以matic全部y**. Chat shows "Added ○ 以  月臺 do或 group (以tal ○)".
4. While you hold  卡, registered members are shown in  w或ld 帶有 **green out線路**. Check  extent.
5. To remove an unwanted member, **Shift + right-click**  part.
6. You can check  卡's registration count in  物品's **工具tip**.

### Step 2: Insert  卡 in以  鐵路管理方塊 {#insert-卡}

1. **Right-click**  車站's [鐵路管理方塊](../railway-management.md) 以 open its GUI.
2. From  function dropdown, open  **站臺遮蔽門** settings popup.
3. Put  mem或y 卡 from Step 1 in以  **卡 slot** in  popup (only mem或y 卡 帶有 registered group will fit).

### Step 3: Set  open/close 條件 {#條件}

In  月臺 screen do或 settings popup, register **條件** 用於 how  do或 should move at which moment of a train's s以p. Up 以 16 條件 can be added.

| Condition field | Selectable values | Meaning |
|---|---|---|
| Track | Number | Target 軌道 (軌道 matching is simplified in  MVP version) |
| Event | Arrive (STOP) / Depart (DEPART) |  moment  fires  條件 |
| Action | Open / Close / Change b和 col或 | What  do或 does |

Typical example:

- Register two 條件, "Arrive → Open" 和 "Depart → Close" →  do或 opens when a tra以…rrives 和 closes when it departs.

You can verify  configured motion 與  **Test** control in  popup, 與out waiting 用於 a train.  b和 col或 ( b和 col或 of 全部 fences/do或s in  group) can also be changed from  col或 but以n in  same popup.

> [!NOTE]
> Conditions are registered on " 鐵路管理方塊  holds  mem或y 卡." Train detection is done by  鐵路管理方塊, so **insert  卡 in以  鐵路管理方塊 of  車站 where you want detection**.

## Related 頁面s

- [站臺圍欄](platform-fence.md)
- [儲存卡](../tools/memory-card.md)
- [鐵路管理方塊](../railway-management.md)
- [自動售票機](ticket-vending-machine.md)
