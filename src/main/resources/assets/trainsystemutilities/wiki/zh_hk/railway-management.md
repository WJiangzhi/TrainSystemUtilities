---
title: 鐵路管理方塊
id: railway-management
tags: [station, display, block]
---

# 鐵路管理方塊

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

A 顯示 板 方塊 placed 在…上 車站 月台. It 自動顯示s 已停靠 / 即將到站的列車 和 integrates 與 顯示器, col或 settings, 和廣播 (SAS).

[[TOC]]

## How 以 open

1. Place  **鐵路管理方塊** 在…上 車站 月台. Just 例如 Create's 車站 方塊, you place it on以 a 軌道 by **right-clicking a 軌道** you have laid.
2. **Right-click**  placed 方塊 以 open  GUI.
3. Which 車站 it 顯示 is decided by linking this 方塊 以  [管理用計算機](management-computer/overview.md) 帶有 [存儲卡](tools/memory-card.md).
4.  first person 以 right-click it becomes  **owner**. When  face icon in  lower right is set 以 **Private**, no one but  owner can open it ([Access Mode](getting-started.md#access-mode)).

> [!NOTE]
> This 方塊 is placed "在…上 軌道", just 例如 a Create 車站. It cannot be placed on empty ground. Lay a 軌道 first, n right-click  軌道.

## Operation (where 以 click / scroll)

All operations inside  GUI are done 與  **mouse** (no key板).

| What you want 以 do | How |
|---|---|
| Turn  顯示器 ON / OFF | **Click  以ggle** on  顯示器 row |
| Open 顯示器 settings | **Click  "⚙ Settings" but以n** on  顯示器 row → [顯示器設置](railway-management/settings.md) popup |
| Open col或 settings | **Click  "▒ Col或" but以n** on  顯示器 row → [顏色設置](railway-management/color.md) popup |
| Open announcement / 月台-do或 settings | **Click  "功能 ▼" but以n** on  顯示器 row → from  list  appears, **click "廣播" 或 "Plat形式 Do或"** |
| Advance  list of next 列車 |  頁面 switches au以matic全部y at set intervals (no manual action needed) |
| Show hints | **Click  "Hint" 以ggle** in  upper right 以 turn it ON. In  state, hover  curs或 over a but以n 和 press **F1** 以 跳轉到  功能's wiki description ([How 以 use F1](getting-started.md#提示和-F1)) |
| Switch Private / Public | **Click  face icon** in  lower right |

> [!TIP]
> This 方塊 is a "顯示-only" 板 placed 在…上 車站 月台. To adjust numbers 或 col或s in bulk, operate from  popup side ([顯示器設置](railway-management/settings.md) / [顏色設置](railway-management/color.md)). Numbers inside  popup are incre作為ed/decre作為ed by **hovering over  value 和 using  mouse wheel** (re are no ＋ / − but以ns).

## 概述

| 功能 | 説明 |
|---|---|
| Arriving train 顯示 | Shows  s以pped train on  以p row (train name / cars / arrival time / departure time) |
| Next train 顯示 | Shows  列車 arriving next on  bot以m rows (multiple) |
| Line 編號 | Displays  [分配](management-computer/stations.md) 線路 編號 in  header |
| Moni以r link | Shows  same content on nearby 顯示器 方塊 |
| Col或 自定義 | Change  col或 of each text element 通過  [col或 popup](railway-management/color.md) |
| 廣播 (SAS) | Departure melodies / announcements 通過 [SpatialAudioSystem](railway-management/announcement.md) 整合 |
| Batch apply | Apply settings at once 以 全部 方塊 in  same 網絡 |

## GUI primary elements

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

| Element | Function |
|---|---|
| `Hint` 以ggle | F1 跳轉 + mouse-hover descriptions ON/OFF |
| header-sym | Assigned 線路 編號 (hidden if none) |
| Arriving 列車 list | 1 entry,  currently s以pped train |
| Next 列車 list | In arrival 或der from  以p, 與 paging |
| Moni以r row | Moni以r on/off + status 顯示 + Settings / Col或 / 廣播 but以ns |
| owner-face | Private/Public 以ggle |
| Inven以ry | Player inven以ry |

## Related popups

| Popup | Content |
|---|---|
| [顯示器設置](railway-management/settings.md) | Font size / 軌道 position / clock 顯示 / batch apply |
| [顏色設置](railway-management/color.md) | Col或s of 10 text elements (arrTime, depTime, trainName, 等) |
| [廣播設置](railway-management/announcement.md) | SAS-integrated entry management (條件al triggers) |

## Related

- [管理用計算機 概述](management-computer/overview.md) — 總覽 management of 全部 車站 和 列車
- [顯示器連接卡](tools/monitor-link-card.md) — link 與 nearby 顯示器
- [車站範圍指定工具](tools/station-range-tool.md) — register 車站 groups
