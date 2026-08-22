---
title: 显示器连接卡
id: tools/monitor-link-card
tags: [tool, item, monitor, link]
---

# 显示器连接卡

```embed:item id=trainsystemutilities:monitor_link_card size=48 label=true
```

A **dedicated held 物品**  links a 显示器 方块 以 anor 方块 (railway management / poster management / management computer).

[[TOC]]

## Holding / usage

This 卡 h作为 no dedicated GUI. You use it simply by **holding it 和 right-clicking a 显示器**.

1. **Put  显示器连接卡 on your hotbar 和 hold it.**
2. **Right-click  显示器 方块** you want 以 link (by default,  **right mouse but以n**).
   - Adjacent, connected 显示器 are **au以matic全部y registered 以ger 作为 a single group** (you do not need 以 click each face one by one).
   - Right-clicking an already-registered group again **unregisters**  group.
3. When registered, "Registered (○ groups)" is shown at  bot以m of  screen (above  hotbar).
4.  registered content can be checked in  **工具tip** when you hover  卡: "Registered: ○".
5. **Shift + right-click** (right-click while sneaking) **clears 全部** of  卡's registered content.

> [!NOTE]
> This 卡 is one  remembers "registered 显示器". To actu全部y output 显示 content 以 a 显示器,  
> put this registered 卡 **in以  显示器 slot of a railway management 方块, 等** (see "Usage flow" below).

## Operation summary

| Operation | What happens |
|---|---|
| **Right-click** a 显示器 | Register  显示器 (connected group) / unregister if already registered |
| **Shift + right-click** | Clear 全部 of  卡's registered content |
| **Hover** over  卡 | Check  current registration count in  工具tip |

## Usage flow

1. **Register** 显示器 on  卡 与  steps above.
2. Put  registered 卡 in以  **显示器 slot** of  方块 you want 作为  source ([铁路管理方块](../railway-management.md) / [海报管理方块](../poster-management.md) / [管理用计算机](../management-computer/monitor.md)).
3. That 方块's 显示 content is now instantly synced 和 shown on  registered 显示器.

## Linkable combinations

| Source | Displayed content |
|---|---|
| [铁路管理方块](../railway-management.md) | 车站 arrivals / next 列车 + 线路 编号 |
| [海报管理方块](../poster-management.md) | Slideshow 图片 |
| [管理用计算机 Moni以r](../management-computer/monitor.md) | Cus以m layout |

## Moni以r 方块 placement

A 显示器 can be a 单个方块 或 a **multi-face 显示器** (= a grid of rows × columns).  
When linked 与  卡,  content is str等hed across  整个 grid.

## Related

- [存储卡](memory-card.md) — general-purpose version
- [铁路管理方块](../railway-management.md)
- [海报管理方块](../poster-management.md)
- [管理用计算机 显示器](../management-computer/monitor.md)
