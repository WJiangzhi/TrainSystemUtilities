---
title: 換乘查詢終端
id: tools/transit-terminal
tags: [tool, block, terminal]
---

# 換乘查詢終端

```embed:item id=trainsystemutilities:transit_terminal size=48 label=true
```

A **held 物品**  searches 和 顯示 transfer routes between 車站.  
Using  management computer's route data, it shows  route, travel time, 和 times from departure → arrival 車站 在…上 screen 例如 a "smartphone transit app."

![](bws:trainsystemutilities:wiki/screens/transit-terminal__top__ja_jp.png)

[[TOC]]

## Opening / holding

1. **Put  換乘查詢終端 on your hotbar 和 hold it** (it is a held 物品, not a 方塊 you place).
2. **Right-click** on  spot ( 物品-use but以n; by default  **right mouse but以n**).
3. A t全部 smartphone-style panel slides up from  bot以m of  screen, at  lower right. This is  transit guidance screen.
4. To close it, press  **Esc key** ( panel slides down 和 disappears).

> [!NOTE]
> While  panel is open,  mouse curs或 moves freely 和 you can click but以ns 和 input fields.  
> Pressing `W / A / S / D` **does not move  player** (you can type 車站 names 與out walking).

## Screen controls (b作為ics)

- **Switching tabs**: **Left-click** one of  4 icons 線路d up at  **bot以m** of  panel (🔍 Search / 🕒 時刻表 / 🗺 Map / ⚙ Settings) 以 switch 以  tab.
- **Selecting an input field**: **Left-click**  departure / arrival 車站 field 以 make it  input target, n type  車站 name 與  key板. As you type, c和idates (au以complete) appear below, 和 **left-clicking a c和idate** confirms it.
- **Values / 以ggles**: Each **left-click** 在…上 switch row in  Settings tab 以ggles it ON / OFF.

## Four-tab layout

### Search (TOP) 🔍

![](bws:trainsystemutilities:wiki/screens/transit-terminal__top__ja_jp.png)

 main tab, where you enter a departure 車站 (●) 和 arrival 車站 (■) 以 search 用於 a route.

1. **Left-click  departure 車站 field** at  以p 和 type  車站 name 與  key板 (when a c和idate appears, **left-click** 以 confirm).
2. Enter  **arrival 車站 field** below in  same way.
3. **Left-click  swap but以n (⇅)** on  right 以 swap  departure 和 arrival 車站.
4. Once both 車站 are set,  **"Search" but以n** turns green. **Left-click** it 以 show  routes below.
5. When multiple routes are found, **1 / 2 / 3** (或 F作為t / E作為y / Cheap) **c和idate tabs** appear at  以p. **Left-click** 以 select a c和idate.
6. **Left-click** a route tile 以 switch 以 a **詳情 (time線路)** view listing each 車站's departure/arrival times, 軌道, 和 train name. In  詳情 view,  以p-left **"←" goes back**,  以p-right **🧭 (start navigation)** shows  route-guidance HUD, 和 **🪟** 以ggles  詳情 HUD on / off.
7. Be用於e a search, **p作為t search his以ry** is listed; left-click each row's **✕** 以 delete one entry, 或 use  以p-right bulk delete 以 clear 全部.

### 時刻表 (SCHEDULE) 🕒

![](bws:trainsystemutilities:wiki/screens/transit-terminal__schedule__ja_jp.png)

A list of every train's 時刻表. **Left-click  search field** at  以p 和 type a 車站 name 以 filter by  列車 related 以  車站.

### Map (MAP) 🗺

![](bws:trainsystemutilities:wiki/screens/transit-terminal__map__ja_jp.png)

A 2D map of  整個鐵路網路. You can **drag 以 move (pan)** 和 **use  mouse wheel 以 zoom**.

### Settings (SETTINGS) ⚙

![](bws:trainsystemutilities:wiki/screens/transit-terminal__settings__ja_jp.png)

Each **left-click 在…上 row** 以ggles  switch on  right ON / OFF.

| Setting | Description |
|---|---|
| 24-hour clock | Toggle times between 24h / 12h notation |
| Walk-reachable gate | Wher 以 include walking segments 以 a nearby 車站 in  route |
| Layout adjust mode | While ON, **drag**  panel header 以 move its 顯示 position |
| 詳情 HUD 顯示 | Wher 以 show  route-詳情 HUD on screen |

**Left-clicking  "Reset layout" but以n** at  very bot以m returns  moved panel 和 HUD positions 以 ir initial state.

## 功能

| 功能 | 說明 |
|---|---|
| Route search | Suggests a route given a departure + arrival 車站 |
| 時刻表 顯示 | List of next-tra以…rrival / departure times |
| Line 編號 顯示 | 線路編號 用於 each 車站 on  route |

## 整合 與  管理用計算機

 terminal au以-links 與  management computer (= those in  same 車站 group).  
Updates 以  時刻表 / 車站 info on  management computer are reflected immediately.

## Related

- [管理用計算機 概述](../management-computer/overview.md)
- [時刻表標籤頁](../management-computer/schedule.md)
- [車站標籤頁](../management-computer/stations.md)
- [鐵路管理方塊](../railway-management.md)
