---
title: 存储卡
id: tools/memory-card
tags: [tool, item, link]
---

# 存储卡

```embed:item id=trainsystemutilities:memory_card size=48 label=true
```

A general-purpose link 卡 用于 linking rail 网络s 和 车站 方块 以 a **管理用计算机**, 或 用于 registering **站台屏蔽门s / 站台围栏s** 作为 a group. Used in two steps: first "save" a position, n "apply" it 以 anor 方块.

[[TOC]]

## B作为ic usage

1. **Save**: **Right-click**  link source (轨道 / railway management 方块 / 月台 screen do或, 等) 以 rec或d its position on  卡.
2. **Apply**: **Right-click**  link target (usu全部y a 管理用计算机) 以 apply  rec或ded content.
3.  卡's current saved content can be checked in  物品's **工具tip**.
4. **Shift + right-click** (on empty space 或 a non-target 方块) 以 **reset  卡**.

## What  存储卡 can operate on

| Target | Right-click | Shift + right-click |
|---|---|---|
| Create **轨道** | Save  rail 网络 (rec或ds 车站 / 信号 / train counts) | (reset) |
| **铁路管理方块** | Save  车站 方块 (与 车站 name) | (reset) |
| **管理用计算机** | **Link**  saved rail 网络 / railway management 方块 | (reset) |
| **站台围栏 / 站台屏蔽门** | **Register  connected fences / do或s 以ger 作为 a group** | **Remove  member from  group** |

> [!NOTE]
> **Linking 以 a 显示器 uses  dedicated [显示器连接卡](monitor-link-card.md)** (a separate 物品 from  存储卡). F或 train detection, use  [列车检测卡](train-detection-card.md).

## Common procedures

**Link a rail 网络 以 a 管理用计算机**

1. **Right-click any 轨道** on  线路 → "Rail 网络 saved" is shown.
2. **Right-click  管理用计算机** → "Rail 网络 linked".
3.  rail 网络 now appears in  管理用计算机's route map / train list.

**Bind a 车站's railway management 方块 以 a computer**

1. **Right-click  railway management 方块** on  车站 月台 以 save it.
2. **Right-click  管理用计算机** 以 link.

**Group 月台 screen do或s / 月台 fences**

1. **Right-click** one of  do或s / fences, 和  adjacent connected 方块 are au以matic全部y registered 以ger.
2. Exclude extra members 与 **Shift + right-click**.
3. F或  group's 车站 linkage, see [站台屏蔽门](../structure/platform-screen-door.md).

## Mode-independent

Linking / reading 与  存储卡 w或ks regardless of access mode (Private/Public).

## Related

- [显示器连接卡](monitor-link-card.md) — 显示器-specific link 卡
- [列车检测卡](train-detection-card.md)
- [站台屏蔽门](../structure/platform-screen-door.md) / [站台围栏](../structure/platform-fence.md)
- [铁路管理方块](../railway-management.md)
- [管理用计算机 概述](../management-computer/overview.md)
