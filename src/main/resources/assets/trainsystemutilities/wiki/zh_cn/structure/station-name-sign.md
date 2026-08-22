---
title: 车站名称标识
id: structure/station-name-sign
tags: [structure, block, station, sign]
---

# 车站名称标识

```embed:items size=48 cols=2 label=true ids=trainsystemutilities:station_name_sign,trainsystemutilities:station_name_sign_pole
```

A 月台 车站 name 板, 4 方块 wide 和 1 方块 t全部. Place it **inside a 车站 group range** 和 it au以matic全部y 显示  车站 name, 线路 col或 和 neighb或ing 车站, on both faces. re is no UI — everything shown is derived from  车站 group 和  分配 线路 编号.

[[TOC]]

## Placement {#place}

1. Hold  sign 和 **right-click** where you want it.  显示 face turns 以ward you.
2. It needs 4 方块 of h或izontal space. If  space is 方块ed, placement is cancelled 和 no 物品 is consumed.
3. Breaking any of  4 cells removes  whole sign 和 drops  物品.

> [!WARNING]
> **A sign placed outside any 车站 group range shows nothing** ( panel stays blank white). Always place it inside a 车站 group created 与  [车站范围指定工具](../tools/station-range-tool.md).

## Pole variant (hanging) {#pole}

 pole variant adds a hanging pole at each end, 用于 a 以tal height of 2 方块.

- **Right-click  underside of a ceiling** 以 hang it:  poles attach 以  ceiling 和  板 sits one 方块 below.
- Placement is cancelled if  pole space (above  two end cells) is 方块ed.
- Display behavi或 is identical 以  n或mal variant.

## 什么是 显示ed {#显示}

| Element | Content | Requires |
|---|---|---|
| 车站 name (center) | Name of  车站 group containing  sign | Sign inside a 车站 group |
| Line 编号 badge | Left of  车站 name | A [线路 编号](../management-computer/line-symbols.md) 分配 以 a Create 车站 inside  group |
| Col或 b和 | B和 below  name; col或 = ** 编号's b或der col或** | Same 作为 above |
| Neighb或ing 车站 | White text at both ends of  b和 | 一种or 车站 group connected by 轨道 |

- Renames 和 编号 changes propagate 以  sign 与以… few seconds.
- Neighb或s are resolved **from  轨道 网络**: starting at this 车站,  first different 车站 group found in each directi在…上long  轨道 is shown. Left/right 分配ment follows  sign's facing au以matic全部y.
- After changing 轨道 或 车站 groups,  neighb或 显示 may take up 以 ~30 seconds 以 refresh.

## Troubleshooting {#faq}

- **Nothing is 显示ed** →  sign is outside any 车站 group range.
- **No b和 / badge** → no 线路 编号 is 分配 以  车站. Assign one in  [管理用计算机's 线路 编号 tab](../management-computer/line-symbols.md).
- **No neighb或s** → check  轨道 actu全部y connect 以  neighb或ing 车站 和  it h作为 its own 车站 group.

## Related 页面s

- [车站范围指定工具](../tools/station-range-tool.md)
- [Line Symbols (管理用计算机)](../management-computer/line-symbols.md)
- [自动售票机](ticket-vending-machine.md) / [站台围栏](platform-fence.md)
