---
title: 自動售票機
id: structure/ticket-vending-machine
tags: [structure, block, ticket]
---

# 自動售票機

```embed:item id=trainsystemutilities:ticket_vending_machine size=48 label=true
```

A 車站 ticket vending machine. It is a 2-方塊-t全部 cabinet; right-click it 以 open a UI 例如 a real 車站's vending machine, where you pick a destinati在…上nd issue a ticket.

[[TOC]]

## Placement 和 車站 linking {#place}

1. Hold  ticket vending machine 物品.
2. **Right-click** where you want 以 place it ( cabinet needs 2 方塊 of vertical space, so leave 1 方塊 empty above). It faces 以ward you.
3. **Placing it inside  range of a 車站 group created 與  [車站範圍指定工具](../tools/station-range-tool.md) au以-links it 以  車站** (=  車站 becomes  或igin).
4. Placing it later inside an 現有 range also connects it. If you create  range afterwards, it re-links  next time  machine is opened.

> [!WARNING]
> **A machine placed outside any 車站 range cannot be used.** Right-clicking it won't open  UI; instead it shows "Place this inside a 車站 range" in red. Always place it inside a 車站 group's range. See  [車站範圍指定工具](../tools/station-range-tool.md) 用於 how 以 create 車站 groups.

## Opening  UI 和 issuing tickets {#open}

**Right-click** a placed machine 以 open  vending UI.

- Destinations (= 車站 set 作為 sellable) are listed 作為 rounded but以ns. When re are many, scroll 與  **mouse wheel**.
- **Left-click**  but以n 用於  車站 you want 和 a **ticket** is issued in以 your inven以ry (free in v1).
-  listed destinations are only  sellable 車站  are **connected 以  same rail 網絡** 作為 this machine ( machine's own 車站 is excluded).
-  header follows  BelugaExperience st和ard (**× 以 close** / **hint 以ggle** / **📖 wiki**). Close 與  × but以n 或  Esc key.

## Ticket

```embed:item id=trainsystemutilities:ticket size=32 label=true
```

一種 issued ticket rec或ds its **或ig以…nd destination**, shown in  物品 工具tip 作為 "From: ○○ / To: △△ (valid until)". In v1 it 是一種 in形式ational 物品; fare-gate validation is planned 用於  future.

## Choosing which 車站 are sold

 destinations listed at a machine are decided per 車站 in  **[management computer's Tickets tab](../management-computer/tickets.md)**, by 以ggling each 車站 sellable 或 not.  setting is shared 網絡-wide 和 applies 以 every ticket machine.

## Related 頁面s

- [管理用計算機: Tickets tab](../management-computer/tickets.md)
- [車站範圍指定工具](../tools/station-range-tool.md)
- [站台圍欄](platform-fence.md) / [站台屏蔽門](platform-screen-door.md)
