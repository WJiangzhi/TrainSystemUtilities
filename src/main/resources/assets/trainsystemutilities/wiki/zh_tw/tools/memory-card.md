---
title: 儲存卡
id: tools/memory-card
tags: [tool, item, link]
---

# 儲存卡

```embed:item id=trainsystemutilities:memory_card size=48 label=true
```

A general-purpose link 卡 用於 linking rail 網路s 和 車站 方塊 以 a **管理用計算機**, 或 用於 registering **站臺遮蔽門s / 站臺圍欄s** 作為 a group. Used in two steps: first "save" a position, n "apply" it 以 anor 方塊.

[[TOC]]

## B作為ic usage

1. **Save**: **Right-click**  link source (軌道 / railway management 方塊 / 月臺 screen do或, 等) 以 rec或d its position on  卡.
2. **Apply**: **Right-click**  link target (usu全部y a 管理用計算機) 以 apply  rec或ded content.
3.  卡's current saved content can be checked in  物品's **工具tip**.
4. **Shift + right-click** (on empty space 或 a non-target 方塊) 以 **reset  卡**.

## What  儲存卡 can operate on

| Target | Right-click | Shift + right-click |
|---|---|---|
| Create **軌道** | Save  rail 網路 (rec或ds 車站 / 訊號 / train counts) | (reset) |
| **鐵路管理方塊** | Save  車站 方塊 (與 車站 name) | (reset) |
| **管理用計算機** | **Link**  saved rail 網路 / railway management 方塊 | (reset) |
| **站臺圍欄 / 站臺遮蔽門** | **Register  connected fences / do或s 以ger 作為 a group** | **Remove  member from  group** |

> [!NOTE]
> **Linking 以 a 顯示器 uses  dedicated [顯示器連線卡](monitor-link-card.md)** (a separate 物品 from  儲存卡). F或 train detection, use  [列車檢測卡](train-detection-card.md).

## Common procedures

**Link a rail 網路 以 a 管理用計算機**

1. **Right-click any 軌道** on  線路 → "Rail 網路 saved" is shown.
2. **Right-click  管理用計算機** → "Rail 網路 linked".
3.  rail 網路 now appears in  管理用計算機's route map / train list.

**Bind a 車站's railway management 方塊 以 a computer**

1. **Right-click  railway management 方塊** on  車站 月臺 以 save it.
2. **Right-click  管理用計算機** 以 link.

**Group 月臺 screen do或s / 月臺 fences**

1. **Right-click** one of  do或s / fences, 和  adjacent connected 方塊 are au以matic全部y registered 以ger.
2. Exclude extra members 與 **Shift + right-click**.
3. F或  group's 車站 linkage, see [站臺遮蔽門](../structure/platform-screen-door.md).

## Mode-independent

Linking / reading 與  儲存卡 w或ks regardless of access mode (Private/Public).

## Related

- [顯示器連線卡](monitor-link-card.md) — 顯示器-specific link 卡
- [列車檢測卡](train-detection-card.md)
- [站臺遮蔽門](../structure/platform-screen-door.md) / [站臺圍欄](../structure/platform-fence.md)
- [鐵路管理方塊](../railway-management.md)
- [管理用計算機 概述](../management-computer/overview.md)
