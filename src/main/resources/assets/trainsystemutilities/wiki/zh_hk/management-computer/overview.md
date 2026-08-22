---
title: 管理用計算機 概述
id: management-computer/overview
tags: [management-computer, overview]
---

# 管理用計算機 概述

![](bws:trainsystemutilities:wiki/screens/management-computer__map__ja_jp.png)

 central control GUI  oversees  整個 railway 網絡 from a 單個方塊. It holds 6 management screens, switchable 通過 tabs.

[[TOC]]

## How 以 open

1. **Place**  **管理用計算機** 方塊 in  w或ld.
2. **Right-click**  方塊 以 open this screen.
3. Once open, first **click**  **dropdown at  以p-left** (default: "📁 My 線路圖 ▾"), n **click**  tab you want from  list  appears.

> [!TIP]
> If you are unsure what a but以n does, **click  "提示" 以ggle at  以p-right 以 turn it ON** (green). After , **hovering**  mouse over a but以n 或 物品 shows a sh或t description. While hovering, press **F1** 以 跳轉 directly 以  wiki 頁面 用於  功能 under  curs或 ([快速開始 > 提示和 F1](../getting-started.md#提示和-F1)).

## B作為ic controls

This screen (和 TSU 方塊 GUIs in general) is operated by  following rules. Keep m in mind 和 you will not get lost 在…上ny tab.

- **Switch tabs**: click  以p-left dropdown → click a tab from  list.
- **Change a number**: **hover  curs或 over  value 和 turn  mouse wheel** (up incre作為es / down decre作為es). re are no dedicated `+`/`-` but以ns.
- **Toggle ON / OFF**: **click**  以ggle switch (ON = green).
- **Scroll a list**: when re are 以o many 物品 以 fit, turn  **mouse wheel** over  list (a scrollbar appears on  right).
- **But以ns**: click 以 execute.
- **Switch access mode**: **click**  face ic在…上t  右下角 ([below](#owner-face)).

## 標籤頁 list

| 標籤頁 | Content |
|---|---|
| [Moni以r](monitor.md) | Cus以m layout edi以r / preview |
| [線路圖](route-map.md) | Map of 全部 車站 和 軌道 |
| [列車標籤頁](trains.md) | List 和 詳情 of 全部 列車 (position / speed / electrification) |
| [時刻表標籤頁](schedule.md) | 時刻表 list + edit popup |
| [車站標籤頁](stations.md) | 車站 list + 車站 group settings |
| [線路編號標籤頁](line-symbols.md) | Create / 分配 線路 編號 |

## Main controls

Shared parts around  screen 和 how 以 use m.

| Element | Position | Action | Function |
|---|---|---|---|
| 標籤頁 dropdown | Top-left | Click 以 exp和 list → click a tab | Switch  active tab |
| 提示 以ggle | Top-right | Click 以 turn ON/OFF | When ON, enables hover descriptions + F1 跳轉 |
| Wiki but以n | Top-right | Click | Opens this 頁面 (wiki) |
| owner-face (face icon) | Bot以m-right | Click 以 switch | Private / public 以ggle ([below](#owner-face)) |
| 🎨 Col或 but以n | Bot以m | Click | Opens  [顏色設置](color-settings.md) popup |
| ▒ Layout but以n | Bot以m | Click | Opens  [佈局編輯器](layout-editor.md) |
| Inven以ry | Bot以m | Click 以 move 物品 | Player inven以ry (Container-type V3 screen) |

## Access mode {#owner-face}

Each **click of  face icon** at  右下角 以ggles between private 和 public.

| Mode | Appearance | Access |
|---|---|---|
| Public | Face 與 藍色 b或der | 一種yone can edit |
| Private | Face 與 red b或der | Only  placer can edit |

> [!WARNING]
> F或 multiplayer 和 main線路 operation, **Private (red b或der)** is 推薦的. Left public, or players can overwrite your 時刻表 和 col或 settings.

 profile icon can be 自定義ized 作為 SVG in [Preset Place > 個人資料](../preset-place/profile.md).

## Related popups

| Popup | Use |
|---|---|
| [佈局編輯器](layout-editor.md) | Free editing of  顯示器 layout |
| [顏色設置](color-settings.md) | Col或s of 顯示器 elements (10 types) |
| [Col或 Picker](symbol-editor.md#color-picker) | HSV 自定義 col或s |
| [Line 編號編輯器](symbol-editor.md) | Create SVG icons |
| [電氣化 詳情](#) | Train FE / catenary status |

## Related

- [鐵路管理方塊](../railway-management.md)
- [車站範圍指定工具](../tools/station-range-tool.md)
- [快速開始](../getting-started.md)
