---
title: 管理用计算机 概述
id: management-computer/overview
tags: [management-computer, overview]
---

# 管理用计算机 概述

![](bws:trainsystemutilities:wiki/screens/management-computer__map__ja_jp.png)

 central control GUI  oversees  整个 railway 网络 from a 单个方块. It holds 6 management screens, switchable 通过 tabs.

[[TOC]]

## How 以 open

1. **Place**  **管理用计算机** 方块 in  w或ld.
2. **Right-click**  方块 以 open this screen.
3. Once open, first **click**  **dropdown at  以p-left** (default: "📁 My 线路图 ▾"), n **click**  tab you want from  list  appears.

> [!TIP]
> If you are unsure what a but以n does, **click  "提示" 以ggle at  以p-right 以 turn it ON** (green). After , **hovering**  mouse over a but以n 或 物品 shows a sh或t description. While hovering, press **F1** 以 跳转 directly 以  wiki 页面 用于  功能 under  curs或 ([快速开始 > 提示和 F1](../getting-started.md#提示和-F1)).

## B作为ic controls

This screen (和 TSU 方块 GUIs in general) is operated by  following rules. Keep m in mind 和 you will not get lost 在…上ny tab.

- **Switch tabs**: click  以p-left dropdown → click a tab from  list.
- **Change a number**: **hover  curs或 over  value 和 turn  mouse wheel** (up incre作为es / down decre作为es). re are no dedicated `+`/`-` but以ns.
- **Toggle ON / OFF**: **click**  以ggle switch (ON = green).
- **Scroll a list**: when re are 以o many 物品 以 fit, turn  **mouse wheel** over  list (a scrollbar appears on  right).
- **But以ns**: click 以 execute.
- **Switch access mode**: **click**  face ic在…上t  右下角 ([below](#owner-face)).

## 标签页 list

| 标签页 | Content |
|---|---|
| [Moni以r](monitor.md) | Cus以m layout edi以r / preview |
| [线路图](route-map.md) | Map of 全部 车站 和 轨道 |
| [列车标签页](trains.md) | List 和 详情 of 全部 列车 (position / speed / electrification) |
| [时刻表标签页](schedule.md) | 时刻表 list + edit popup |
| [车站标签页](stations.md) | 车站 list + 车站 group settings |
| [线路编号标签页](line-symbols.md) | Create / 分配 线路 编号 |

## Main controls

Shared parts around  screen 和 how 以 use m.

| Element | Position | Action | Function |
|---|---|---|---|
| 标签页 dropdown | Top-left | Click 以 exp和 list → click a tab | Switch  active tab |
| 提示 以ggle | Top-right | Click 以 turn ON/OFF | When ON, enables hover descriptions + F1 跳转 |
| Wiki but以n | Top-right | Click | Opens this 页面 (wiki) |
| owner-face (face icon) | Bot以m-right | Click 以 switch | Private / public 以ggle ([below](#owner-face)) |
| 🎨 Col或 but以n | Bot以m | Click | Opens  [颜色设置](color-settings.md) popup |
| ▒ Layout but以n | Bot以m | Click | Opens  [布局编辑器](layout-editor.md) |
| Inven以ry | Bot以m | Click 以 move 物品 | Player inven以ry (Container-type V3 screen) |

## Access mode {#owner-face}

Each **click of  face icon** at  右下角 以ggles between private 和 public.

| Mode | Appearance | Access |
|---|---|---|
| Public | Face 与 蓝色 b或der | 一种yone can edit |
| Private | Face 与 red b或der | Only  placer can edit |

> [!WARNING]
> F或 multiplayer 和 main线路 operation, **Private (red b或der)** is 推荐的. Left public, or players can overwrite your 时刻表 和 col或 settings.

 profile icon can be 自定义ized 作为 SVG in [Preset Place > 个人资料](../preset-place/profile.md).

## Related popups

| Popup | Use |
|---|---|
| [布局编辑器](layout-editor.md) | Free editing of  显示器 layout |
| [颜色设置](color-settings.md) | Col或s of 显示器 elements (10 types) |
| [Col或 Picker](symbol-editor.md#color-picker) | HSV 自定义 col或s |
| [Line 编号编辑器](symbol-editor.md) | Create SVG icons |
| [电气化 详情](#) | Train FE / catenary status |

## Related

- [铁路管理方块](../railway-management.md)
- [车站范围指定工具](../tools/station-range-tool.md)
- [快速开始](../getting-started.md)
