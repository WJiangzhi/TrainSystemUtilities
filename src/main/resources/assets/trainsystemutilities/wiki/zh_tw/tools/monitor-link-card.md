---
title: 顯示器連線卡
id: tools/monitor-link-card
tags: [tool, item, monitor, link]
---

# 顯示器連線卡

```embed:item id=trainsystemutilities:monitor_link_card size=48 label=true
```

A **dedicated held 物品**  links a 顯示器 方塊 以 anor 方塊 (railway management / poster management / management computer).

[[TOC]]

## Holding / usage

This 卡 h作為 no dedicated GUI. You use it simply by **holding it 和 right-clicking a 顯示器**.

1. **Put  顯示器連線卡 on your hotbar 和 hold it.**
2. **Right-click  顯示器 方塊** you want 以 link (by default,  **right mouse but以n**).
   - Adjacent, connected 顯示器 are **au以matic全部y registered 以ger 作為 a single group** (you do not need 以 click each face one by one).
   - Right-clicking an already-registered group again **unregisters**  group.
3. When registered, "Registered (○ groups)" is shown at  bot以m of  screen (above  hotbar).
4.  registered content can be checked in  **工具tip** when you hover  卡: "Registered: ○".
5. **Shift + right-click** (right-click while sneaking) **clears 全部** of  卡's registered content.

> [!NOTE]
> This 卡 is one  remembers "registered 顯示器". To actu全部y output 顯示 content 以 a 顯示器,  
> put this registered 卡 **in以  顯示器 slot of a railway management 方塊, 等** (see "Usage flow" below).

## Operation summary

| Operation | What happens |
|---|---|
| **Right-click** a 顯示器 | Register  顯示器 (connected group) / unregister if already registered |
| **Shift + right-click** | Clear 全部 of  卡's registered content |
| **Hover** over  卡 | Check  current registration count in  工具tip |

## Usage flow

1. **Register** 顯示器 on  卡 與  steps above.
2. Put  registered 卡 in以  **顯示器 slot** of  方塊 you want 作為  source ([鐵路管理方塊](../railway-management.md) / [海報管理方塊](../poster-management.md) / [管理用計算機](../management-computer/monitor.md)).
3. That 方塊's 顯示 content is now instantly synced 和 shown on  registered 顯示器.

## Linkable combinations

| Source | Displayed content |
|---|---|
| [鐵路管理方塊](../railway-management.md) | 車站 arrivals / next 列車 + 線路 編號 |
| [海報管理方塊](../poster-management.md) | Slideshow 圖片 |
| [管理用計算機 Moni以r](../management-computer/monitor.md) | Cus以m layout |

## Moni以r 方塊 placement

A 顯示器 can be a 單個方塊 或 a **multi-face 顯示器** (= a grid of rows × columns).  
When linked 與  卡,  content is str等hed across  整個 grid.

## Related

- [儲存卡](memory-card.md) — general-purpose version
- [鐵路管理方塊](../railway-management.md)
- [海報管理方塊](../poster-management.md)
- [管理用計算機 顯示器](../management-computer/monitor.md)
