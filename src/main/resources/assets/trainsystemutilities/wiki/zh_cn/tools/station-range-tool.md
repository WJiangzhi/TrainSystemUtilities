---
title: 车站范围指定工具
id: tools/station-range-tool
tags: [tool, station]
---

# 车站范围指定工具

```embed:item id=trainsystemutilities:station_range_tool size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/station-group-save__ja_jp.png)

A 工具  registers a 车站 area 作为 a **车站 group** by specifying two points.  
It bundles multiple railway management 方块 作为 one 车站, letting you apply common settings (col或 / settings / announcement) 全部 at once.

[[TOC]]

## Mode switching

This 工具 switches between three modes 与 **Alt + mouse wheel** (while held,  current mode is shown above  hotbar).

| Mode | Behavi或 |
|---|---|
| Select (default) | Left-click  two 角落s of  range 以 create a 车站 group |
| GUI | Right-click 以 open  车站 group management GUI |
| Show | Display  out线路 of 现有 车站 groups in  w或ld |

## Usage (Select mode)

1. Hold  工具 和 **left-click**  first 角落 of  车站 area.
2. **Left-click**  opposite 角落.
3. Right-click  工具 → 车站 group save GUI is shown.
4. Enter  车站 group name → Enter 以 save.

## Track numbering modes

At save time, you can choose a **轨道 au以-numbering** mode:

| Mode | Behavi或 |
|---|---|
| AUTO | Au以-numbered 与 inside = 轨道 1 |
| LEFT | Left edge = 轨道 1 |
| RIGHT | Right edge = 轨道 1 |

## 车站 group management

![](bws:trainsystemutilities:wiki/screens/station-group-manage__ja_jp.png)

Switch  工具 以 **GUI** mode 与 **Alt + mouse wheel**, n **right-click** 以 open 
management GUI, where you can:
- Rename
- Delete (与 confirmation dialog)
- Check member 车站

of a saved 车站 group.

> [!NOTE]
> re is no comm和 用于 车站 group management. Everything is done from this 工具's GUI mode.

![](bws:trainsystemutilities:wiki/screens/station-group-manage-delete__ja_jp.png)

## Where 车站 groups are used

- [管理用计算机 车站标签页](../management-computer/stations.md) 分配s a 线路 编号 以  group
- [铁路管理方块 batch apply](../railway-management/settings.md#batch-apply) applies settings 以 全部 in  same group at once
- Share destination (share) 用于 [SAS 广播](../railway-management/announcement.md)
- **C和idate sale 车站** 用于 [自动售票机s](../structure/ticket-vending-machine.md) (chosen from 车站 groups in  [车票标签页](../management-computer/tickets.md))
- Recognition of 车站 targeted by **au以matic ticket gates**
- Target of **route search** 用于  [换乘查询终端](transit-terminal.md) (search using 车站 groups 作为 或igin / destination)

> [!NOTE]
> Ticket vending machines, au以matic ticket gates, 和 transit routing 全部 **reference  车站 groups created 与 this 工具 作为 shared data.** Be用于e using m, first register  target 车站 作为 车站 groups.

## Related

- [铁路管理方块](../railway-management.md)
- [管理用计算机 车站标签页](../management-computer/stations.md)
- [存储卡](memory-card.md)
