---
title: 换乘查询终端
id: tools/transit-terminal
tags: [tool, block, terminal]
---

# 换乘查询终端

```embed:item id=trainsystemutilities:transit_terminal size=48 label=true
```

A **held 物品**  searches 和 显示 transfer routes between 车站.  
Using  management computer's route data, it shows  route, travel time, 和 times from departure → arrival 车站 在…上 screen 例如 a "smartphone transit app."

![](bws:trainsystemutilities:wiki/screens/transit-terminal__top__ja_jp.png)

[[TOC]]

## Opening / holding

1. **Put  换乘查询终端 on your hotbar 和 hold it** (it is a held 物品, not a 方块 you place).
2. **Right-click** on  spot ( 物品-use but以n; by default  **right mouse but以n**).
3. A t全部 smartphone-style panel slides up from  bot以m of  screen, at  lower right. This is  transit guidance screen.
4. To close it, press  **Esc key** ( panel slides down 和 disappears).

> [!NOTE]
> While  panel is open,  mouse curs或 moves freely 和 you can click but以ns 和 input fields.  
> Pressing `W / A / S / D` **does not move  player** (you can type 车站 names 与out walking).

## Screen controls (b作为ics)

- **Switching tabs**: **Left-click** one of  4 icons 线路d up at  **bot以m** of  panel (🔍 Search / 🕒 时刻表 / 🗺 Map / ⚙ Settings) 以 switch 以  tab.
- **Selecting an input field**: **Left-click**  departure / arrival 车站 field 以 make it  input target, n type  车站 name 与  key板. As you type, c和idates (au以complete) appear below, 和 **left-clicking a c和idate** confirms it.
- **Values / 以ggles**: Each **left-click** 在…上 switch row in  Settings tab 以ggles it ON / OFF.

## Four-tab layout

### Search (TOP) 🔍

![](bws:trainsystemutilities:wiki/screens/transit-terminal__top__ja_jp.png)

 main tab, where you enter a departure 车站 (●) 和 arrival 车站 (■) 以 search 用于 a route.

1. **Left-click  departure 车站 field** at  以p 和 type  车站 name 与  key板 (when a c和idate appears, **left-click** 以 confirm).
2. Enter  **arrival 车站 field** below in  same way.
3. **Left-click  swap but以n (⇅)** on  right 以 swap  departure 和 arrival 车站.
4. Once both 车站 are set,  **"Search" but以n** turns green. **Left-click** it 以 show  routes below.
5. When multiple routes are found, **1 / 2 / 3** (或 F作为t / E作为y / Cheap) **c和idate tabs** appear at  以p. **Left-click** 以 select a c和idate.
6. **Left-click** a route tile 以 switch 以 a **详情 (time线路)** view listing each 车站's departure/arrival times, 轨道, 和 train name. In  详情 view,  以p-left **"←" goes back**,  以p-right **🧭 (start navigation)** shows  route-guidance HUD, 和 **🪟** 以ggles  详情 HUD on / off.
7. Be用于e a search, **p作为t search his以ry** is listed; left-click each row's **✕** 以 delete one entry, 或 use  以p-right bulk delete 以 clear 全部.

### 时刻表 (SCHEDULE) 🕒

![](bws:trainsystemutilities:wiki/screens/transit-terminal__schedule__ja_jp.png)

A list of every train's 时刻表. **Left-click  search field** at  以p 和 type a 车站 name 以 filter by  列车 related 以  车站.

### Map (MAP) 🗺

![](bws:trainsystemutilities:wiki/screens/transit-terminal__map__ja_jp.png)

A 2D map of  整个铁路网络. You can **drag 以 move (pan)** 和 **use  mouse wheel 以 zoom**.

### Settings (SETTINGS) ⚙

![](bws:trainsystemutilities:wiki/screens/transit-terminal__settings__ja_jp.png)

Each **left-click 在…上 row** 以ggles  switch on  right ON / OFF.

| Setting | Description |
|---|---|
| 24-hour clock | Toggle times between 24h / 12h notation |
| Walk-reachable gate | Wher 以 include walking segments 以 a nearby 车站 in  route |
| Layout adjust mode | While ON, **drag**  panel header 以 move its 显示 position |
| 详情 HUD 显示 | Wher 以 show  route-详情 HUD on screen |

**Left-clicking  "Reset layout" but以n** at  very bot以m returns  moved panel 和 HUD positions 以 ir initial state.

## 功能

| 功能 | 说明 |
|---|---|
| Route search | Suggests a route given a departure + arrival 车站 |
| 时刻表 显示 | List of next-tra以…rrival / departure times |
| Line 编号 显示 | 线路编号 用于 each 车站 on  route |

## 集成 与  管理用计算机

 terminal au以-links 与  management computer (= those in  same 车站 group).  
Updates 以  时刻表 / 车站 info on  management computer are reflected immediately.

## Related

- [管理用计算机 概述](../management-computer/overview.md)
- [时刻表标签页](../management-computer/schedule.md)
- [车站标签页](../management-computer/stations.md)
- [铁路管理方块](../railway-management.md)
