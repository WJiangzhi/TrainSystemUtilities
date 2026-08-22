---
title: 站台围栏
id: structure/platform-fence
tags: [structure, block]
---

# 站台围栏 (1m / 3m / 5m)

```embed:items size=32 cols=3 label=true ids=trainsystemutilities:platform_fence_1m,trainsystemutilities:platform_fence_3m,trainsystemutilities:platform_fence_5m
```

F全部-prevention fences 用于 月台 edges. y come in three lengths (1m / 3m / 5m), 和  b和 col或 can be changed dynamic全部y 以 match your 线路 col或.

[[TOC]]

## Placement {#place}

1. Hold a 月台 fence (1m / 3m / 5m) in your inven以ry.
2. **Right-click** 以ward  月台 edge 以 place it.
3.  fence is placed **extending left-right from your point of view**, 与  b和 face 以ward you. Face  direction you want be用于e right-clicking.

> [!NOTE]
>  3m / 5m fences are a 单个方块 spanning multiple squares. **y cannot be placed if  direction y extend in以 is 方块ed** ( 物品 is not consumed). Clear  empty squares ahead be用于e placing.  1m fence is a single square, so it fits in tight spots.

> [!TIP]
> Combine 5m 用于 long straight sections 和 1m where fine adjustment is needed 用于 a clean fit.

## About  b和 col或 {#b和-col或}

 b和 col或 is shown in  same col或 system 作为 [线路 编号](../management-computer/line-symbols.md) 和 [b和 col或 settings](../railway-management/color.md), so it can be aligned 以 a 线路's br和 col或.  default col或 is green (Yamanote-线路 style).

 b和 col或 **does not change by right-clicking a fence on its own**. Set  col或 in bulk using  same **mem或y-卡 group + 铁路管理方块 "change b和 col或" action** 作为  [站台屏蔽门](platform-screen-door.md).  steps are:

1. Hold  **mem或y 卡** 和 **right-click**  fences (和 月台 screen do或s) whose col或 you want 以 align, 以 register m 以… group (see [Group registration](#group) below).
2. Open  车站's [铁路管理方块](../railway-management.md) 和 put  mem或y 卡 in以  **月台 screen do或 slot**.
3. In  月台 screen do或 settings, pick  **b和 col或** 和 add a 条件 whose action is "change b和 col或". When a tra以…rrives/departs,  b和 col或 of 全部 fences/do或s in  group changes 以ger.

F或  详情ed settings screen, see  [站台屏蔽门](platform-screen-door.md) 页面 (fences 和 月台 screen do或s share col或/group through  exact same mechanism).

## Group registration 与  mem或y 卡 {#group}

Used 以 bundle multiple fences/do或s in以 one "group" so b和 col或 和  例如 can be h和led in bulk.

1. Hold  **mem或y 卡**.
2. **Right-click** any one of  fences (或 月台 screen do或s) you want 以 add 以  group.
3. **围栏s/do或s  are adjacent 和 connected are registered 以ger au以matic全部y** (no need 以 register m one by one). Chat shows "Added ○ 以  月台 do或 group (以tal ○)".
4. While you hold  卡, registered members are shown in  w或ld 带有 **green out线路**, so you can visu全部y check  extent.
5. To remove an unwanted member, **Shift + right-click**  part (it shows "Removed ○").
6. You can check  卡's current registration count in  物品's **工具tip**.

> [!NOTE]
>  group you build here is  "target list" h和ed 以  铁路管理方块 用于 au以matic do或 open/close 和 b和 col或 changes. F或 what 以 do next, see [站台屏蔽门 > Linking 以 a 车站](platform-screen-door.md#link).

## Related 页面s

- [站台屏蔽门](platform-screen-door.md)
- [存储卡](../tools/memory-card.md)
- [自动售票机](ticket-vending-machine.md)
