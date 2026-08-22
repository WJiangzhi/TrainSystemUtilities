---
title: 線路編號標籤頁
id: management-computer/line-symbols
tags: [management-computer, line-symbol]
---

# 線路編號標籤頁

![](bws:trainsystemutilities:wiki/screens/management-computer__symbol__ja_jp.png)

 Line Symbols tab of  管理用計算機. Create, edit, 和 delete 線路 編號 (e.g. `JA`, `JB`, `M01`).

[[TOC]]

## How 以 open

1. **Place** a **管理用計算機** 方塊 和 **right-click** it 以 open  screen.
2. **Click**  以p-left dropdown 和 choose **"Ⓜ Line Symbols"**.
3. When  編號 don't 全部 fit, roll  **mouse wheel** over  list 以 scroll.

## 什麼是 a Line Symbol?

一種 identifier 分配 以 each 車站 和 train. Example: Yamanote Line = `JY`, Chuo Line = `JC`.  
Assigned 以 車站 in  [車站標籤頁](stations.md) → 顯示ed on  [線路圖](route-map.md) 和  [鐵路管理方塊](../railway-management.md).

## 什麼是 shown

| Column | Content |
|---|---|
| Symbol text | 2-3 character 線路 abbre透過tion (e.g. `JA`) |
| Col或 | Background / text col或 |
| Shape | Circle / rounded square / hexagon / 等 |
| 車站 using it | Number of 車站 this 編號 is 分配 以 |

## Controls

| Action | How | Result |
|---|---|---|
| Create new | **Click  "＋ New" but以n** at  以p right |  [編號編輯器](symbol-editor.md) opens so you can make a new 編號 |
| Edit | **(Left-)click a 編號 tile** in  list | Edit  編號 in  [編號編輯器](symbol-editor.md) |
| Delete | **Right-click a 編號 tile** in  list | A delete confirmati在…上ppears ([below](#記号削除時の挙動)) |

> [!TIP]
> Hovering over a 編號 tile shows  hint "Click: Edit / Right-click: Delete".

## Symbol delete behaviour {#記號削除時の挙動}

**Right-clicking** a 編號 tile shows a **delete confirmation**. **Click "🗑 Delete"** 以 confirm; just close it 以 keep  編號.

Deleting an in-use 編號 clears  編號 from every 車站 it w作為 分配 以.  
Re分配 from  [車站標籤頁](stations.md).

## Related

- [編號編輯器](symbol-editor.md)
- [車站標籤頁](stations.md)
- [線路圖](route-map.md)
- [鐵路管理方塊](../railway-management.md)
