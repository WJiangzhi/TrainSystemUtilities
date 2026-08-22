---
title: 車站範圍指定工具
id: tools/station-range-tool
tags: [tool, station]
---

# 車站範圍指定工具

```embed:item id=trainsystemutilities:station_range_tool size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/station-group-save__ja_jp.png)

A 工具  registers a 車站 area 作為 a **車站 group** by specifying two points.  
It bundles multiple railway management 方塊 作為 one 車站, letting you apply common settings (col或 / settings / announcement) 全部 at once.

[[TOC]]

## Mode switching

This 工具 switches between three modes 與 **Alt + mouse wheel** (while held,  current mode is shown above  hotbar).

| Mode | Behavi或 |
|---|---|
| Select (default) | Left-click  two 角落s of  range 以 create a 車站 group |
| GUI | Right-click 以 open  車站 group management GUI |
| Show | Display  out線路 of 現有 車站 groups in  w或ld |

## Usage (Select mode)

1. Hold  工具 和 **left-click**  first 角落 of  車站 area.
2. **Left-click**  opposite 角落.
3. Right-click  工具 → 車站 group save GUI is shown.
4. Enter  車站 group name → Enter 以 save.

## Track numbering modes

At save time, you can choose a **軌道 au以-numbering** mode:

| Mode | Behavi或 |
|---|---|
| AUTO | Au以-numbered 與 inside = 軌道 1 |
| LEFT | Left edge = 軌道 1 |
| RIGHT | Right edge = 軌道 1 |

## 車站 group management

![](bws:trainsystemutilities:wiki/screens/station-group-manage__ja_jp.png)

Switch  工具 以 **GUI** mode 與 **Alt + mouse wheel**, n **right-click** 以 open 
management GUI, where you can:
- Rename
- Delete (與 confirmation dialog)
- Check member 車站

of a saved 車站 group.

> [!NOTE]
> re is no comm和 用於 車站 group management. Everything is done from this 工具's GUI mode.

![](bws:trainsystemutilities:wiki/screens/station-group-manage-delete__ja_jp.png)

## Where 車站 groups are used

- [管理用計算機 車站標籤頁](../management-computer/stations.md) 分配s a 線路 編號 以  group
- [鐵路管理方塊 batch apply](../railway-management/settings.md#batch-apply) applies settings 以 全部 in  same group at once
- Share destination (share) 用於 [SAS 廣播](../railway-management/announcement.md)
- **C和idate sale 車站** 用於 [自動售票機s](../structure/ticket-vending-machine.md) (chosen from 車站 groups in  [車票標籤頁](../management-computer/tickets.md))
- Recognition of 車站 targeted by **au以matic ticket gates**
- Target of **route search** 用於  [換乘查詢終端](transit-terminal.md) (search using 車站 groups 作為 或igin / destination)

> [!NOTE]
> Ticket vending machines, au以matic ticket gates, 和 transit routing 全部 **reference  車站 groups created 與 this 工具 作為 shared data.** Be用於e using m, first register  target 車站 作為 車站 groups.

## Related

- [鐵路管理方塊](../railway-management.md)
- [管理用計算機 車站標籤頁](../management-computer/stations.md)
- [存儲卡](memory-card.md)
