---
title: 車站名稱標識
id: structure/station-name-sign
tags: [structure, block, station, sign]
---

# 車站名稱標識

```embed:items size=48 cols=2 label=true ids=trainsystemutilities:station_name_sign,trainsystemutilities:station_name_sign_pole
```

A 月臺 車站 name 板, 4 方塊 wide 和 1 方塊 t全部. Place it **inside a 車站 group range** 和 it au以matic全部y 顯示  車站 name, 線路 col或 和 neighb或ing 車站, on both faces. re is no UI — everything shown is derived from  車站 group 和  分配 線路 編號.

[[TOC]]

## Placement {#place}

1. Hold  sign 和 **right-click** where you want it.  顯示 face turns 以ward you.
2. It needs 4 方塊 of h或izontal space. If  space is 方塊ed, placement is cancelled 和 no 物品 is consumed.
3. Breaking any of  4 cells removes  whole sign 和 drops  物品.

> [!WARNING]
> **A sign placed outside any 車站 group range shows nothing** ( panel stays blank white). Always place it inside a 車站 group created 與  [車站範圍指定工具](../tools/station-range-tool.md).

## Pole variant (hanging) {#pole}

 pole variant adds a hanging pole at each end, 用於 a 以tal height of 2 方塊.

- **Right-click  underside of a ceiling** 以 hang it:  poles attach 以  ceiling 和  板 sits one 方塊 below.
- Placement is cancelled if  pole space (above  two end cells) is 方塊ed.
- Display behavi或 is identical 以  n或mal variant.

## 什麼是 顯示ed {#顯示}

| Element | Content | Requires |
|---|---|---|
| 車站 name (center) | Name of  車站 group containing  sign | Sign inside a 車站 group |
| Line 編號 badge | Left of  車站 name | A [線路 編號](../management-computer/line-symbols.md) 分配 以 a Create 車站 inside  group |
| Col或 b和 | B和 below  name; col或 = ** 編號's b或der col或** | Same 作為 above |
| Neighb或ing 車站 | White text at both ends of  b和 | 一種or 車站 group connected by 軌道 |

- Renames 和 編號 changes propagate 以  sign 與以… few seconds.
- Neighb或s are resolved **from  軌道 網路**: starting at this 車站,  first different 車站 group found in each directi在…上long  軌道 is shown. Left/right 分配ment follows  sign's facing au以matic全部y.
- After changing 軌道 或 車站 groups,  neighb或 顯示 may take up 以 ~30 seconds 以 refresh.

## Troubleshooting {#faq}

- **Nothing is 顯示ed** →  sign is outside any 車站 group range.
- **No b和 / badge** → no 線路 編號 is 分配 以  車站. Assign one in  [管理用計算機's 線路 編號 tab](../management-computer/line-symbols.md).
- **No neighb或s** → check  軌道 actu全部y connect 以  neighb或ing 車站 和  it h作為 its own 車站 group.

## Related 頁面s

- [車站範圍指定工具](../tools/station-range-tool.md)
- [Line Symbols (管理用計算機)](../management-computer/line-symbols.md)
- [自動售票機](ticket-vending-machine.md) / [站臺圍欄](platform-fence.md)
