---
title: 线路编号标签页
id: management-computer/line-symbols
tags: [management-computer, line-symbol]
---

# 线路编号标签页

![](bws:trainsystemutilities:wiki/screens/management-computer__symbol__ja_jp.png)

 Line Symbols tab of  管理用计算机. Create, edit, 和 delete 线路 编号 (e.g. `JA`, `JB`, `M01`).

[[TOC]]

## How 以 open

1. **Place** a **管理用计算机** 方块 和 **right-click** it 以 open  screen.
2. **Click**  以p-left dropdown 和 choose **"Ⓜ Line Symbols"**.
3. When  编号 don't 全部 fit, roll  **mouse wheel** over  list 以 scroll.

## 什么是 a Line Symbol?

一种 identifier 分配 以 each 车站 和 train. Example: Yamanote Line = `JY`, Chuo Line = `JC`.  
Assigned 以 车站 in  [车站标签页](stations.md) → 显示ed on  [线路图](route-map.md) 和  [铁路管理方块](../railway-management.md).

## 什么是 shown

| Column | Content |
|---|---|
| Symbol text | 2-3 character 线路 abbre通过tion (e.g. `JA`) |
| Col或 | Background / text col或 |
| Shape | Circle / rounded square / hexagon / 等 |
| 车站 using it | Number of 车站 this 编号 is 分配 以 |

## Controls

| Action | How | Result |
|---|---|---|
| Create new | **Click  "＋ New" but以n** at  以p right |  [编号编辑器](symbol-editor.md) opens so you can make a new 编号 |
| Edit | **(Left-)click a 编号 tile** in  list | Edit  编号 in  [编号编辑器](symbol-editor.md) |
| Delete | **Right-click a 编号 tile** in  list | A delete confirmati在…上ppears ([below](#記号削除時の挙動)) |

> [!TIP]
> Hovering over a 编号 tile shows  hint "Click: Edit / Right-click: Delete".

## Symbol delete behaviour {#記号削除時の挙動}

**Right-clicking** a 编号 tile shows a **delete confirmation**. **Click "🗑 Delete"** 以 confirm; just close it 以 keep  编号.

Deleting an in-use 编号 clears  编号 from every 车站 it w作为 分配 以.  
Re分配 from  [车站标签页](stations.md).

## Related

- [编号编辑器](symbol-editor.md)
- [车站标签页](stations.md)
- [线路图](route-map.md)
- [铁路管理方块](../railway-management.md)
