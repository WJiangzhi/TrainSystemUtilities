---
title: 自动售票机
id: structure/ticket-vending-machine
tags: [structure, block, ticket]
---

# 自动售票机

```embed:item id=trainsystemutilities:ticket_vending_machine size=48 label=true
```

A 车站 ticket vending machine. It is a 2-方块-t全部 cabinet; right-click it 以 open a UI 例如 a real 车站's vending machine, where you pick a destinati在…上nd issue a ticket.

[[TOC]]

## Placement 和 车站 linking {#place}

1. Hold  ticket vending machine 物品.
2. **Right-click** where you want 以 place it ( cabinet needs 2 方块 of vertical space, so leave 1 方块 empty above). It faces 以ward you.
3. **Placing it inside  range of a 车站 group created 与  [车站范围指定工具](../tools/station-range-tool.md) au以-links it 以  车站** (=  车站 becomes  或igin).
4. Placing it later inside an 现有 range also connects it. If you create  range afterwards, it re-links  next time  machine is opened.

> [!WARNING]
> **A machine placed outside any 车站 range cannot be used.** Right-clicking it won't open  UI; instead it shows "Place this inside a 车站 range" in red. Always place it inside a 车站 group's range. See  [车站范围指定工具](../tools/station-range-tool.md) 用于 how 以 create 车站 groups.

## Opening  UI 和 issuing tickets {#open}

**Right-click** a placed machine 以 open  vending UI.

- Destinations (= 车站 set 作为 sellable) are listed 作为 rounded but以ns. When re are many, scroll 与  **mouse wheel**.
- **Left-click**  but以n 用于  车站 you want 和 a **ticket** is issued in以 your inven以ry (free in v1).
-  listed destinations are only  sellable 车站  are **connected 以  same rail 网络** 作为 this machine ( machine's own 车站 is excluded).
-  header follows  BelugaExperience st和ard (**× 以 close** / **hint 以ggle** / **📖 wiki**). Close 与  × but以n 或  Esc key.

## Ticket

```embed:item id=trainsystemutilities:ticket size=32 label=true
```

一种 issued ticket rec或ds its **或ig以…nd destination**, shown in  物品 工具tip 作为 "From: ○○ / To: △△ (valid until)". In v1 it 是一种 in形式ational 物品; fare-gate validation is planned 用于  future.

## Choosing which 车站 are sold

 destinations listed at a machine are decided per 车站 in  **[management computer's Tickets tab](../management-computer/tickets.md)**, by 以ggling each 车站 sellable 或 not.  setting is shared 网络-wide 和 applies 以 every ticket machine.

## Related 页面s

- [管理用计算机: Tickets tab](../management-computer/tickets.md)
- [车站范围指定工具](../tools/station-range-tool.md)
- [站台围栏](platform-fence.md) / [站台屏蔽门](platform-screen-door.md)
