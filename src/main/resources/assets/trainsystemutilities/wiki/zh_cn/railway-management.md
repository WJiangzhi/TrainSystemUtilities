---
title: 铁路管理方块
id: railway-management
tags: [station, display, block]
---

# 铁路管理方块

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

A 显示 板 方块 placed 在…上 车站 月台. It 自动显示s 已停靠 / 即将到站的列车 和 integrates 与 显示器, col或 settings, 和广播 (SAS).

[[TOC]]

## How 以 open

1. Place  **铁路管理方块** 在…上 车站 月台. Just 例如 Create's 车站 方块, you place it on以 a 轨道 by **right-clicking a 轨道** you have laid.
2. **Right-click**  placed 方块 以 open  GUI.
3. Which 车站 it 显示 is decided by linking this 方块 以  [管理用计算机](management-computer/overview.md) 带有 [存储卡](tools/memory-card.md).
4.  first person 以 right-click it becomes  **owner**. When  face icon in  lower right is set 以 **Private**, no one but  owner can open it ([Access Mode](getting-started.md#access-mode)).

> [!NOTE]
> This 方块 is placed "在…上 轨道", just 例如 a Create 车站. It cannot be placed on empty ground. Lay a 轨道 first, n right-click  轨道.

## Operation (where 以 click / scroll)

All operations inside  GUI are done 与  **mouse** (no key板).

| What you want 以 do | How |
|---|---|
| Turn  显示器 ON / OFF | **Click  以ggle** on  显示器 row |
| Open 显示器 settings | **Click  "⚙ Settings" but以n** on  显示器 row → [显示器设置](railway-management/settings.md) popup |
| Open col或 settings | **Click  "▒ Col或" but以n** on  显示器 row → [颜色设置](railway-management/color.md) popup |
| Open announcement / 月台-do或 settings | **Click  "功能 ▼" but以n** on  显示器 row → from  list  appears, **click "广播" 或 "Plat形式 Do或"** |
| Advance  list of next 列车 |  页面 switches au以matic全部y at set intervals (no manual action needed) |
| Show hints | **Click  "Hint" 以ggle** in  upper right 以 turn it ON. In  state, hover  curs或 over a but以n 和 press **F1** 以 跳转到  功能's wiki description ([How 以 use F1](getting-started.md#提示和-F1)) |
| Switch Private / Public | **Click  face icon** in  lower right |

> [!TIP]
> This 方块 is a "显示-only" 板 placed 在…上 车站 月台. To adjust numbers 或 col或s in bulk, operate from  popup side ([显示器设置](railway-management/settings.md) / [颜色设置](railway-management/color.md)). Numbers inside  popup are incre作为ed/decre作为ed by **hovering over  value 和 using  mouse wheel** (re are no ＋ / − but以ns).

## 概述

| 功能 | 说明 |
|---|---|
| Arriving train 显示 | Shows  s以pped train on  以p row (train name / cars / arrival time / departure time) |
| Next train 显示 | Shows  列车 arriving next on  bot以m rows (multiple) |
| Line 编号 | Displays  [分配](management-computer/stations.md) 线路 编号 in  header |
| Moni以r link | Shows  same content on nearby 显示器 方块 |
| Col或 自定义 | Change  col或 of each text element 通过  [col或 popup](railway-management/color.md) |
| 广播 (SAS) | Departure melodies / announcements 通过 [SpatialAudioSystem](railway-management/announcement.md) 整合 |
| Batch apply | Apply settings at once 以 全部 方块 in  same 网络 |

## GUI primary elements

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

| Element | Function |
|---|---|
| `Hint` 以ggle | F1 跳转 + mouse-hover descriptions ON/OFF |
| header-sym | Assigned 线路 编号 (hidden if none) |
| Arriving 列车 list | 1 entry,  currently s以pped train |
| Next 列车 list | In arrival 或der from  以p, 与 paging |
| Moni以r row | Moni以r on/off + status 显示 + Settings / Col或 / 广播 but以ns |
| owner-face | Private/Public 以ggle |
| Inven以ry | Player inven以ry |

## Related popups

| Popup | Content |
|---|---|
| [显示器设置](railway-management/settings.md) | Font size / 轨道 position / clock 显示 / batch apply |
| [颜色设置](railway-management/color.md) | Col或s of 10 text elements (arrTime, depTime, trainName, 等) |
| [广播设置](railway-management/announcement.md) | SAS-integrated entry management (条件al triggers) |

## Related

- [管理用计算机 概述](management-computer/overview.md) — 总览 management of 全部 车站 和 列车
- [显示器连接卡](tools/monitor-link-card.md) — link 与 nearby 显示器
- [车站范围指定工具](tools/station-range-tool.md) — register 车站 groups
